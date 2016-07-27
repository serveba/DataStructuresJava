package com.serveba.adt;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

  private BinaryTree tree;

  @Before
  public void setUp() {
	  tree = new BinaryTree("A");
	  
	  tree.insertLeft(tree.getRoot(), "B");
	  tree.insertRight(tree.getRoot(), "C");
	  
	  tree.insertLeft(tree.getRoot().getLeft(), "D");
	  tree.insertRight(tree.getRoot().getLeft(), "E");
	  
	  tree.insertLeft(tree.getRoot().getRight(), "F");
	  tree.insertRight(tree.getRoot().getRight(), "G");
  }

  @After
  public void tearDown() {
    tree = null;
  }
  
  @Test
  public void testSize() {
	  assertTrue(tree.size() == 7);
  }

  @Test
  public void testPreorder(){
	  final String EXPECTED = "ABDECFG";
	  String result = tree.preorder();
	  assertEquals(EXPECTED, result);
  }

  @Test
  public void testInorder() {
	  final String EXPECTED = "DBEAFCG";
	  String result = tree.inorder();
	  assertEquals(EXPECTED, result);
  }

  @Test
  public void testPostorder() {
	  final String EXPECTED = "DEBFGCA";
	  String result = tree.postorder();
	  assertEquals(EXPECTED, result);
  }
  
  @Test
  public void testLevelorder() {
	  final String EXPECTED = "ABCDEFG";
	  String result = tree.levelorder();
	  assertEquals(EXPECTED, result);
  }
  
  



}
