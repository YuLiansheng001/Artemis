/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:33:47 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.Graph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Graph_ESTest extends Graph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setName("_{bN@j[{xVJL5w7&");
      String string0 = graph0.getName();
      assertEquals("_{bN@j[{xVJL5w7&", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setName("");
      String string0 = graph0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setGraphId((-1757));
      int int0 = graph0.getGraphId();
      assertEquals((-1757), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setFeatureId(2078);
      int int0 = graph0.getFeatureId();
      assertEquals(2078, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setFeatureId((-100));
      int int0 = graph0.getFeatureId();
      assertEquals((-100), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setDescription("'9yEEm7@SqtI@E");
      String string0 = graph0.getDescription();
      assertEquals("'9yEEm7@SqtI@E", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setDescription("");
      String string0 = graph0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      byte[] byteArray0 = new byte[8];
      graph0.setData(byteArray0);
      byte[] byteArray1 = graph0.getData();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Graph graph0 = new Graph();
      byte[] byteArray0 = new byte[0];
      graph0.setData(byteArray0);
      byte[] byteArray1 = graph0.getData();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Graph graph0 = new Graph();
      int int0 = graph0.getGraphId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Graph graph0 = new Graph();
      int int0 = graph0.getFeatureId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Graph graph0 = new Graph();
      byte[] byteArray0 = graph0.getData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      String string0 = graph0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      String string0 = graph0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.setGraphId(3700);
      int int0 = graph0.getGraphId();
      assertEquals(3700, int0);
  }
}
