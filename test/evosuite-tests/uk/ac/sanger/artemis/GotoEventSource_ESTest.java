/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:25:20 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.GotoEvent;
import uk.ac.sanger.artemis.GotoListener;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.SimpleGotoEventSource;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Marker;
import uk.ac.sanger.artemis.sequence.MarkerRange;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GotoEventSource_ESTest extends GotoEventSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Key key0 = new Key("gi|");
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "Can't pack with alphabet ", "", true, true, true);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, "");
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(filteredEntryGroup0);
      GotoEvent gotoEvent0 = new GotoEvent(featureKeyQualifierPredicate0, (Marker) null);
      simpleGotoEventSource0.sendGotoEvent(gotoEvent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Key key0 = new Key("gi|");
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "Can't pack with alphabet ", "", true, true, true);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, "");
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(filteredEntryGroup0);
      MarkerRange markerRange0 = simpleGotoEventSource0.gotoBase((-662));
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      simpleGotoEventSource0.removeGotoListener((GotoListener) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      simpleGotoEventSource0.gotoBase((Marker) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      simpleGotoEventSource0.addGotoListener((GotoListener) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      // Undeclared exception!
      try { 
        simpleGotoEventSource0.sendGotoEvent((GotoEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleGotoEventSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      // Undeclared exception!
      try { 
        simpleGotoEventSource0.gotoLastBase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleGotoEventSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      // Undeclared exception!
      try { 
        simpleGotoEventSource0.gotoFirstBase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleGotoEventSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      // Undeclared exception!
      try { 
        simpleGotoEventSource0.gotoBase(1066);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleGotoEventSource", e);
      }
  }
}
