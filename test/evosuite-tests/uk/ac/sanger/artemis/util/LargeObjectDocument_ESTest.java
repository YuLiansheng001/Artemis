/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:53:46 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.postgresql.largeobject.LargeObject;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.LargeObjectDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LargeObjectDocument_ESTest extends LargeObjectDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("= }QQ6zB'3s9XfbT=7s", (String) null, (LargeObject) null);
      String string0 = largeObjectDocument0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("2", "2", largeObject0);
      String string0 = largeObjectDocument0.getName();
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-673)).when(inputStream0).read();
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0, (InputStream) null).when(largeObject0).getInputStream();
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", ".fuQ;@]Y[=gT", largeObject0);
      largeObjectDocument0.getInputStream();
      assertEquals(".fuQ;@]Y[=gT", largeObjectDocument0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(inputStream0).read();
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0, (InputStream) null).when(largeObject0).getInputStream();
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      InputStream inputStream1 = largeObjectDocument0.getInputStream();
      assertNull(inputStream1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(largeObject0).getInputStream();
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("2", "2", largeObject0);
      // Undeclared exception!
      try { 
        largeObjectDocument0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = null;
      try {
        largeObjectDocument0 = new LargeObjectDocument((String) null, (String) null, largeObject0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      String string0 = largeObjectDocument0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      boolean boolean0 = largeObjectDocument0.writable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      Document document0 = largeObjectDocument0.getParent();
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      Document document0 = largeObjectDocument0.append("");
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      boolean boolean0 = largeObjectDocument0.readable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", largeObject0);
      OutputStream outputStream0 = largeObjectDocument0.getOutputStream();
      assertNull(outputStream0);
  }
}
