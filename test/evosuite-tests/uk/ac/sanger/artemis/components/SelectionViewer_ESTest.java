/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:10:42 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.Clipboard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.SelectionViewer;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionViewer_ESTest extends SelectionViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("4");
      assertEquals("[4 content: 1  (100.0%), , GC percentage: 0.0]", stringVector0.toString());
      assertEquals(10, stringVector0.capacity());
      assertNotNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("");
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("(no ambiguous bases)");
      assertEquals("[  content: 2  (10.0%), ( content: 1  (5.0%), ) content: 1  (5.0%), A content: 2  (10.0%), B content: 2  (10.0%), E content: 1  (5.0%), G content: 1  (5.0%), I content: 1  (5.0%), M content: 1  (5.0%), N content: 1  (5.0%), O content: 2  (10.0%), S content: 3  (15.0%), U content: 2  (10.0%), , GC percentage: 5.0, GC percentage of non-ambiguous bases: 33.33]", stringVector0.toString());
      assertNotNull(stringVector0);
      assertEquals(20, stringVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary((String) null);
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("%_6):XRl~");
      Selection selection0 = new Selection(clipboard0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      SelectionViewer selectionViewer0 = null;
      try {
        selectionViewer0 = new SelectionViewer(selection0, simpleEntryGroup0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.FileViewer
         //
         verifyException("uk.ac.sanger.artemis.components.SelectionViewer", e);
      }
  }
}