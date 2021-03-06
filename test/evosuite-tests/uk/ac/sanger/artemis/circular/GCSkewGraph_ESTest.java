/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:53:28 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.GCSkewGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GCSkewGraph_ESTest extends GCSkewGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw();
      GCSkewGraph gCSkewGraph0 = new GCSkewGraph(dNADraw0);
      // Undeclared exception!
      try { 
        gCSkewGraph0.calculateValue(0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GCSkewGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GCSkewGraph gCSkewGraph0 = null;
      try {
        gCSkewGraph0 = new GCSkewGraph((DNADraw) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw();
      GCSkewGraph gCSkewGraph0 = new GCSkewGraph(dNADraw0);
      // Undeclared exception!
      try { 
        gCSkewGraph0.calculateValue(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GCSkewGraph", e);
      }
  }
}
