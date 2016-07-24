package com.serveba.adt;

import com.serveba.adt.LinkedList;
import java.lang.StringBuilder;

public class Set {

  private LinkedList list;

  public Set() {
    list = new LinkedList();
  }

  public void insert(Object data) {
    // to avoid duplicated objects
    if (!isMember(data)) {
        list.add(data);
    }
  }

  public boolean isMember(Object data) {
    if (data == null) {
      return false;
    }

    do {
      Object setData = list.getData();
      if(data.equals(setData)) {
        list.resetIterator();
        return true;
      }
    }while (list.next());

    list.resetIterator();

    return false;
  }

  public LinkedList getList() {
    return list;
  }

  public boolean isSubset(Set set) {
    if (set == null) {
      return false;
    }

    do {
      Object data = list.getData();
      if(!set.isMember(data)) {
        list.resetIterator();
        return false;
      }
    }while (list.next());

    list.resetIterator();

    return true;
  }

  public boolean isEqual(Set set) {
    return this.isSubset(set) && set.isSubset(this);
  }

  public boolean remove(Object data) {
    return list.remove(data);
  }

  public Set intersection(Set set) {
    if(set == null) {
      return null;
    }
    Set intersection = new Set();
    do {
      Object data = list.getData();
      if(set.isMember(data)) {
        intersection.insert(data);
      }
    }while (list.next());

    list.resetIterator();

    return intersection;
  }

  public Set union(Set set) {
    if(set == null) {
      return null;
    }
    Set union = new Set();
    do {
      Object data = list.getData();
      union.insert(data);
    }while (list.next());

    list.resetIterator();

    LinkedList secondList = set.getList();

    do {
      Object data = secondList.getData();
      if(!isMember(data)) {
        union.insert(data);
      }
    }while (secondList.next());

    secondList.resetIterator();

    return union;
  }

  public Set difference(Set set) {
    if(set == null) {
      return null;
    }
    Set diff = new Set();
    do {
      Object data = list.getData();
      if(!set.isMember(data)) {
        diff.insert(data);
      }
    }while (list.next());

    list.resetIterator();

    return diff;
  }

  public int size() {
    return list.size();
  }

  @Override
  public String toString() {
      return list == null ? "" : list.toString();
  }

}
