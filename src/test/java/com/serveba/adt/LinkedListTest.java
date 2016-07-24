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

  @Test
  public void testDeleteHead() {
    assertTrue(list.remove(0));
    assertTrue(list.size() == 4);
    Integer value = (Integer)list.get(0);
    assertTrue(value == 1);
  }

  @Test
  public void testDeleteTail() {
    assertTrue(list.remove(4));
    assertTrue(list.size() == 4);
    Integer value = (Integer)list.get(3);
    assertTrue(value == 4);
  }

  @Test
  public void testDeleteMiddle() {
    assertTrue(list.remove(2));
    assertTrue(list.size() == 4);
    Integer value = (Integer)list.get(2);
    assertTrue(value == 4);
  }

  @Test
  public void testDeleteFalse() {
    // index overflow
    assertFalse(list.remove(6));
    // index underflow
    assertFalse(list.remove(-1));
    // delete element empty list
    LinkedList testList = new LinkedList();
    assertFalse(testList.remove(0));
    testList.add(new Integer(1));
    assertTrue(testList.size() == 1);
    // delete element from one element list
    assertTrue(testList.remove(0));
    assertTrue(testList.size() == 0);
  }

  @Test
  public void testToString() {
    String info = list.toString();
    final String EXPECTED = "(1, 2, 3, 4, 5)";
    assertEquals(EXPECTED, info);
  }

}
