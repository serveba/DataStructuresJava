package com.serveba.adt;

import com.serveba.adt.LinkedList;
import java.lang.StringBuilder;

public class Set {

  private LinkedList list;

  public Set() {
    list = new LinkedList();
  }

  public void insert(Object data) {

  }

  public boolean isMember(Object data) {
    return false;
  }

  public boolean isSubset(Set set) {
    return false;
  }

  public boolean isEqual(Set set) {
    return false;
  }

  public boolean remove(Object data) {
    return false;
  }

  public Set intersection(Set set) {
    return null;
  }

  public Set union(Set set) {
    return null;
  }

  public Set difference(Set set) {
    return null;
  }

  public int size() {
    return list.size();
  }

  @Override
  public String toString() {
      return list == null ? "" : list.toString();
  }

}
