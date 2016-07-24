package com.serveba.adt;


public class LinkedList {

  private Node head;

  private int counter;

  public LinkedList() {
    head = null;
    counter = 0;
  }

  public int size() {
    return counter;
  }

  private void incCounter() {
    counter++;
  }

  private void decCounter() {
    counter--;
  }

  public void add(Object data) {
    if(head == null) {
      head = new Node(data);
      incCounter();
      return;
    }
    Node cursor = head;
    while ( cursor.getNext() != null ) {
      cursor = cursor.getNext();
    }
    cursor.setNext(new Node(data));
    incCounter();
  }

  public Object get(int index) {
    if(index <= 0 || head == null || index > size() - 1) {
      return null;
    }
    Node cursor = head;
    for(int i = 0; i < index; i++) {
      cursor = cursor.getNext();
    }
    return cursor.getData();
  }

  public boolean remove(int index) {
    // TODO
    return false;
  }

  private class Node {

    Node next;
    Object data;

    public Node(Object dataValue) {
      data = dataValue;
      next = null;
    }

    public Object getData() {
      return data;
    }

    public void setData(Object dataValue) {
      data = dataValue;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node nextValue) {
      next = nextValue;
    }

  }
}
