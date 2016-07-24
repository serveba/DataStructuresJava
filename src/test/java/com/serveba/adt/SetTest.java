package com.serveba.adt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.serveba.adt.Set;

public class SetTest {

  private Set nameSet;

  private Set carSet;

  private static final String [] NAMES = new String[] {
    "John", "Kate", "Tommy", "Robert", "Tesla"
  };

  private static final String [] CARS = new String []{
    "bmw", "mercedes", "audi", "Tesla"
  };

  @Before
  public void setUp() {
    nameSet = new Set();

    for(String name : NAMES) {
      nameSet.insert(name);
    }

    carSet = new Set();

    for(String car : CARS) {
      carSet.insert(car);
    }
  }

  @After
  public void tearDown() {
    carSet = null;
    nameSet = null;
  }

  @Test
  public void testCounter(){
    assertNotNull(nameSet);
    assertTrue(nameSet.size() == NAMES.length);
    assertNotNull(carSet);
    assertTrue(carSet.size() == CARS.length);
  }

  @Test
  public void isMember() {
    assertTrue(nameSet.isMember("John"));
    assertFalse(nameSet.isMember("Kelly"));
  }

  @Test
  public void isSubset() {
    Set subSet = new Set();
    subSet.insert("Robert");
    subSet.insert("Tesla");
    assertTrue(subSet.isSubset(nameSet));
    assertFalse(nameSet.isSubset(subSet));
  }

  @Test
  public void isEqual() {
    Set testSet = new Set();
    testSet.insert("bmw");
    testSet.insert("Tesla");
    testSet.insert("mercedes");
    testSet.insert("audi");

    assertTrue(testSet.isEqual(carSet));
    assertTrue(testSet.remove("Tesla"));
    assertFalse(testSet.isEqual(carSet));
  }

  @Test
  public void testRemove() {
    assertTrue(nameSet.isMember("Kate"));
    assertTrue(nameSet.remove("Kate"));
    assertTrue(nameSet.size() == 4);
    assertFalse(nameSet.isMember("Kate"));
  }

  @Test
  public void testIntersection() {
    Set intersection = nameSet.intersection(carSet);
    assertNotNull(intersection);
    assertTrue(intersection.size() == 1);
    assertTrue(intersection.isMember("Tesla"));
  }

  @Test
  public void testUnion() {
    Set union = nameSet.union(carSet);
    assertNotNull(union);
    int size = NAMES.length + CARS.length;
    assertTrue(union.size() == size);
  }

  @Test
  public void testDifference() {
    Set difference = nameSet.difference(carSet);
    assertNotNull(difference);
    int diff = NAMES.length + CARS.length - 1;
    assertTrue(difference.size() == diff);
  }

  @Test
  public void testToString() {
    String info = nameSet.toString();
    final String EXPECTED = "(John, Kate, Tommy, Robert, Tesla)";
    assertEquals(EXPECTED, info);
  }

}
