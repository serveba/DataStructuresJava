package com.serveba.adt;

import com.serveba.adt.LinkedList;
import java.lang.StringBuilder;

public class Stack {

  private LinkedList list;

  public Stack() {
    list = new LinkedList();
  }

  public Object peek() {
    return list.get(0);
  }

  public void push(Object data) {
    list.addInitial(data);
  }

  public boolean pop() {
    return list.removeInitial();
  }

  public int size() {
    return list == null ? 0 : list.size();
  }

  @Override
  public String toString() {
      return list == null ? "" : list.toString();
  }

}
