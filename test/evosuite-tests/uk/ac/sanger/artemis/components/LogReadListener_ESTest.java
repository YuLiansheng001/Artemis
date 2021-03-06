/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:46:11 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.LogReadListener;
import uk.ac.sanger.artemis.io.ReadEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogReadListener_ESTest extends LogReadListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LogReadListener logReadListener0 = new LogReadListener("2aF i-qQW");
      // Undeclared exception!
      try { 
        logReadListener0.notify((ReadEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.LogReadListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadEvent readEvent0 = new ReadEvent("of~Qdekw0Bj=x]Pg", "of~Qdekw0Bj=x]Pg");
      LogReadListener logReadListener0 = new LogReadListener((String) null);
      // Undeclared exception!
      try { 
        logReadListener0.notify(readEvent0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LogReadListener logReadListener0 = new LogReadListener("");
      Object object0 = new Object();
      ReadEvent readEvent0 = new ReadEvent(object0, "");
      // Undeclared exception!
      try { 
        logReadListener0.notify(readEvent0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LogReadListener logReadListener0 = new LogReadListener((String) null);
      boolean boolean0 = logReadListener0.seenMessage();
      assertFalse(boolean0);
  }
}
