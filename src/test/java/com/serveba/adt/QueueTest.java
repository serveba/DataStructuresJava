package com.serveba.adt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.serveba.adt.Queue;

public class QueueTest {

  private Queue queue;

  @Before
  public void setUp() {
    queue = new Queue();
    for(int i=0; i<5; i++) {
      queue.enqueue(new Integer(i+1));
    }
  }

  @After
  public void tearDown() {
    queue = null;
  }

  @Test
  public void testCounter(){
    assertNotNull(queue);
    assertTrue(queue.size() == 5);
  }

  @Test
  public void testPeek() {
    assertTrue((Integer)queue.peek() == 1);
  }

  @Test
  public void testDequeue() {
    assertTrue(queue.dequeue());
    assertTrue(queue.size() == 4);
    assertTrue((Integer)queue.peek() == 2);
  }

  @Test
  public void testToString() {
    String info = queue.toString();
    final String EXPECTED = "(1, 2, 3, 4, 5)";
    assertEquals(EXPECTED, info);
  }

}
