package com.serveba.adt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.serveba.adt.Stack;

public class StackTest {

  private Stack stack;

  @Before
  public void setUp() {
    stack = new Stack();
    for(int i=0; i<5; i++) {
      stack.push(new Integer(i+1));
    }
  }

  @After
  public void tearDown() {
    stack = null;
  }

  @Test
  public void testCounter(){
    assertNotNull(stack);
    assertTrue(stack.size() == 5);
  }

  @Test
  public void testPeek() {
    Integer value = (Integer)stack.peek();
    assertTrue(value == 5);
  }

  @Test
  public void testPop() {
    assertTrue(stack.pop());
    assertTrue(stack.size() == 4);
    assertTrue((Integer)stack.peek() == 4);
  }

  @Test
  public void testToString() {
    String info = stack.toString();
    final String EXPECTED = "(1, 2, 3, 4, 5)";
    assertEquals(EXPECTED, info);
  }

}
