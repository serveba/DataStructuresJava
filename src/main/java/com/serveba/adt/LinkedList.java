package com.serveba.adt;


import java.lang.StringBuilder;

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

  public void add(Object data) {
    if(head == null) {
      head = new Node(data);
      counter++;
      return;
    }

    Node cursor = head;
    while ( cursor.getNext() != null ) {
      cursor = cursor.getNext();
    }
    cursor.setNext(new Node(data));

    counter++;
  }

  public Object get(int index) {
    if(isNotValidIndex(index)) {
      return null;
    }
    Node cursor = head;
    for(int i = 0; i < index; i++) {
      cursor = cursor.getNext();
    }
    return cursor.getData();
  }

  public void addInitial(Object data) {
    if(head == null) {
      head = new Node(data);
      counter = 1;
      return;
    }

    Node first = new Node(data);
    first.setNext(head);
    head = first;
    counter++;
  }

  public boolean removeInitial() {
    if(head == null) {
      return false;
    }
    Node deleted = head;
    head = head.getNext();
    deleted.destroy();
    counter--;
    return true;
  }

  public boolean remove(int index) {
    if( isNotValidIndex(index) ) {
      return false;
    }

    if(size() == 1 && index == 0) {
      head = null;
      counter--;
      return true;
    }

    Node cursor = head;
    for(int i = 0; i < index - 1 ; i++) {
      cursor = cursor.getNext();
    }

    Node deleted = cursor.getNext();
    cursor.setNext(deleted.getNext());
    deleted.destroy();
    counter--;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder info = new StringBuilder("(");

    if(head != null) {
      Node cursor = head;
      for (int i = 0; i < size(); i++) {
        if(cursor != null) {

          if(info.toString().length() > 1) {
            info.append(", ");
          }
          info.append(cursor.getData().toString());
          cursor = cursor.getNext();
        }
      }
    }

    info.append(")");

    return info.toString();
  }

  private boolean isNotValidIndex(int index) {
    return (index < 0 || head == null || index > size() - 1);
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

    public void destroy() {
      next = null;
      data = null;
    }

  }
}
