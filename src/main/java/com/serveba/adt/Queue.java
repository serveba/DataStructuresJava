package com.serveba.adt;

public class Queue {

  private LinkedList list;

  public Queue() {
    list = new LinkedList();
  }

  public Object peek() {
    return list.get(0);
  }

  public void enqueue(Object data) {
    list.add(data);
  }

  public boolean dequeue() {
    return list.removeInitial();
  }

  public int size() {
    return list == null ? 0 : list.size();
  }
  
  public boolean isEmpty() {
	  return size() == 0;
  }

  @Override
  public String toString() {
      return list == null ? "" : list.toString();
  }

}
