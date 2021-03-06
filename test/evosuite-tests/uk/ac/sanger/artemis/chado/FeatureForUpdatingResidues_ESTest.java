/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:30:48 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.FeatureForUpdatingResidues;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureForUpdatingResidues_ESTest extends FeatureForUpdatingResidues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
      
      featureForUpdatingResidues0.setResidueUpdate(true);
      boolean boolean0 = featureForUpdatingResidues0.isResidueUpdate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setStartBase(1);
      int int0 = featureForUpdatingResidues0.getStartBase();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setStartBase((-1692));
      int int0 = featureForUpdatingResidues0.getStartBase();
      assertEquals((-1692), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setNewSubSequence("");
      featureForUpdatingResidues0.getNewSubSequence();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setLength((-1));
      int int0 = featureForUpdatingResidues0.getLength();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setEndBase(13);
      int int0 = featureForUpdatingResidues0.getEndBase();
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setBasesToEnd(32);
      int int0 = featureForUpdatingResidues0.getBasesToEnd();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setBasesToEnd((-3257));
      int int0 = featureForUpdatingResidues0.getBasesToEnd();
      assertEquals((-3257), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      int int0 = featureForUpdatingResidues0.getStartBase();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setEndBase((-719));
      int int0 = featureForUpdatingResidues0.getEndBase();
      assertEquals((-719), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      int int0 = featureForUpdatingResidues0.getBasesToEnd();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      boolean boolean0 = featureForUpdatingResidues0.isResidueUpdate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      int int0 = featureForUpdatingResidues0.getEndBase();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setLength(42);
      int int0 = featureForUpdatingResidues0.getLength();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.getNewSubSequence();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      featureForUpdatingResidues0.setNewSubSequence("$_eTDN?wFMw_S(Ag");
      featureForUpdatingResidues0.getNewSubSequence();
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FeatureForUpdatingResidues featureForUpdatingResidues0 = new FeatureForUpdatingResidues();
      int int0 = featureForUpdatingResidues0.getLength();
      assertEquals(0, int0);
      assertFalse(featureForUpdatingResidues0.isResidueUpdate());
  }
}
