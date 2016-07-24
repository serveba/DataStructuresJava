package com.serveba.adt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.serveba.adt.LinkedList;

public class LinkedListTest {

  private LinkedList list;

  @Before
  public void setUp() {
    list = new LinkedList();
    for(int i=0; i<5; i++) {
        list.add(new Integer(i+1));
    }
  }

  @After
  public void tearDown() {
    list = null;
  }

  @Test
  public void testCounter(){
    assertNotNull(list);
    assertTrue(list.size() == 5);
  }

  @Test
  public void testGet() {
    Integer value = (Integer)list.get(2);
    assertTrue(value == 3);
  }

}
