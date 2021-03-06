/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:22:48 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.cv.GoBox;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GoBox_ESTest extends GoBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      Dimension dimension1 = new Dimension();
      dimension0.setSize(dimension1);
      Dimension dimension2 = GoBox.getEvidenceListDimension();
      assertEquals(0.0, dimension2.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      dimension0.setSize((-1619437758), (-1619437758));
      Dimension dimension1 = GoBox.getEvidenceListDimension();
      assertEquals((-1.619437758E9), dimension1.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = GoBox.getEvidenceCodeGoTextFromText("3zQ");
      assertEquals("3zQ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        GoBox.getGOCvTerm((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        GoBox.getEvidenceCodeGoTextFromText((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = GoBox.getEvidenceCodeGoTextFromText("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = GoBox.getEvidenceIndex("EXP");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = GoBox.getEvidenceIndex("Inferred from Biological aspect of Descendent");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = GoBox.getEvidenceIndex("inferred from key resi7ues");
      assertEquals((-1), int0);
  }
}
