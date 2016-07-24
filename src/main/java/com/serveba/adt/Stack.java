package com.serveba.adt;

import com.serveba.adt.LinkedList;
import java.lang.StringBuilder;

public class Stack {

  private LinkedList stack;

  public Stack() {
    stack = new LinkedList();
  }

  public Object peek() {
    return stack.get(0);
  }

  public void push(Object data) {
    stack.addInitial(data);
  }

  public boolean pop() {
    return stack.removeInitial();
  }

  public int size() {
    return stack == null ? 0 : stack.size();
  }

  @Override
  public String toString() {
      return stack == null ? "" : stack.toString();
  }

}
