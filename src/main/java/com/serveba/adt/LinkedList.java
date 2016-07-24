package com.serveba.adt;


import java.lang.StringBuilder;

public class LinkedList {

  private Node head;

  private Node tail;

  private Node iterator;

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
      iterator = head;
      tail = head;
      counter++;
      return;
    }
    Node item = new Node(data);
    tail.setNext(item);
    tail = item;
    counter++;
  }

  public void resetIterator() {
    iterator = head;
  }

  public boolean next() {
    if(iterator == null || iterator.getNext() == null) {
      return false;
    }

    Object data = iterator.getNext().getData();
    iterator = iterator.getNext();
    return true;
  }

  public Object getData() {
    if(iterator == null ) {
      return null;
    }
    return iterator.getData();
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
      tail = head;
      iterator = head;
      counter = 1;
      return;
    }

    Node first = new Node(data);
    first.setNext(head);
    head = first;
    iterator = head;
    counter++;
  }

  public boolean removeInitial() {
    if(head == null) {
      return false;
    }
    Node deleted = head;
    head = head.getNext();
    iterator = head;
    deleted.destroy();
    counter--;

    if(tail == null) {
      tail = head;
    }

    return true;
  }

  public boolean remove(Object data) {

    if((head == null) || (data==null)) {
      return false;
    }

    Node cursor = head;

    if(cursor.getData() != null && data.equals(cursor.getData())) {
      head = cursor.getNext();
      iterator = head;
      cursor.destroy();
      counter--;
      return true;
    }

    while (cursor.getNext() != null) {
      Object item = cursor.getNext().getData();

      if(item != null && item.equals(data)) {
        Node deleted = cursor.getNext();
        cursor.setNext(deleted.getNext());
        deleted.destroy();
        counter--;
        return true;
      }

      cursor = cursor.getNext();
    }

    return false;
  }

  public boolean remove(int index) {
    if( isNotValidIndex(index) ) {
      return false;
    }

    if(size() == 1 && index == 0) {
      head = null;
      iterator = null;
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
