/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:57:00 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GFF3AttributeAggregator;
import uk.ac.sanger.artemis.io.GFF3AttributeBuilder;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GFF3AttributeBuilder_ESTest extends GFF3AttributeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("", "Y7LtU(@");
      gFF3AttributeBuilder0.setMapping("Y7LtU(@", "");
      String string0 = gFF3AttributeBuilder0.get("Y7LtU(@");
      assertEquals("Y7LtU(@", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("", "JEOSIzB8!$J\"qOy");
      // Undeclared exception!
      try { 
        gFF3AttributeBuilder0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector("CLX,(GZhg@ET|");
      gFF3AttributeBuilder0.add((String) null, stringVector0);
      // Undeclared exception!
      try { 
        gFF3AttributeBuilder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GFF3AttributeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector((String) null);
      // Undeclared exception!
      try { 
        gFF3AttributeBuilder0.add((String) null, stringVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GFF3AttributeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      // Undeclared exception!
      try { 
        gFF3AttributeBuilder0.add((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GFF3AttributeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector();
      GFF3AttributeAggregator gFF3AttributeAggregator0 = mock(GFF3AttributeAggregator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(gFF3AttributeAggregator0).process(any(uk.ac.sanger.artemis.util.StringVector.class));
      gFF3AttributeBuilder0.setAggregator("D-?4JdOtK/XYF\"", gFF3AttributeAggregator0);
      gFF3AttributeBuilder0.add("D-?4JdOtK/XYF\"", stringVector0);
      assertTrue(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector("");
      gFF3AttributeBuilder0.add("", stringVector0);
      assertEquals("[]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector();
      gFF3AttributeBuilder0.setClone("Contig cannot be null", "Contig cannot be null");
      gFF3AttributeBuilder0.setMapping("D-?4JdOtK/XYF\"", "Contig cannot be null");
      gFF3AttributeBuilder0.add("D-?4JdOtK/XYF\"", stringVector0);
      assertEquals(0, stringVector0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector();
      gFF3AttributeBuilder0.setMapping("D-?4JdOtK/XYF\"", "Tz^");
      gFF3AttributeBuilder0.add("D-?4JdOtK/XYF\"", stringVector0);
      assertTrue(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("Contig cannot be null", "Contig cannot be null");
      gFF3AttributeBuilder0.add("mqNRtYgFVP,WGpVkEiT", "Contig cannot be null");
      String string0 = gFF3AttributeBuilder0.toString();
      assertEquals("contig cannot be null=Contig cannot be null;mqNRtYgFVP,WGpVkEiT=Contig cannot be null", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("YWPc@9\"Lr[.Yxt-1=w", "B/xy4:a<IG,~%PWP");
      gFF3AttributeBuilder0.ignore("YWPc@9\"Lr[.Yxt-1=w");
      String string0 = gFF3AttributeBuilder0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector();
      gFF3AttributeBuilder0.add("", stringVector0);
      String string0 = gFF3AttributeBuilder0.get("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.setMapping("", "");
      try { 
        gFF3AttributeBuilder0.get("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // empty attribute value for 
         //
         verifyException("uk.ac.sanger.artemis.io.GFF3AttributeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("Start_range", "k\"7&'RYp)q@k(i)C^@b");
      String string0 = gFF3AttributeBuilder0.toString();
      assertEquals("Start_range=k\"7%26'RYp)q@k(i)C^@b", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.setClone("5L\"\"Z<", "_jXOt/mnQ|L ");
      GFF3AttributeAggregator gFF3AttributeAggregator0 = mock(GFF3AttributeAggregator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(gFF3AttributeAggregator0).process(any(uk.ac.sanger.artemis.util.StringVector.class));
      gFF3AttributeBuilder0.setAggregator("_jXOt/mnQ|L ", gFF3AttributeAggregator0);
      StringVector stringVector0 = new StringVector();
      gFF3AttributeBuilder0.add("5L\"\"Z<", stringVector0);
      assertTrue(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.add("@{r", (StringVector) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      String[] stringArray0 = new String[3];
      StringVector stringVector0 = new StringVector(stringArray0);
      gFF3AttributeBuilder0.add("t8\"J5@K#.u.sze?{z*", stringVector0);
      gFF3AttributeBuilder0.setGlue("t8\"J5@K#.u.sze?{z*", "t8\"J5@K#.u.sze?{z*");
      gFF3AttributeBuilder0.add("t8\"J5@K#.u.sze?{z*", stringVector0);
      assertEquals("[null, null, null]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      StringVector stringVector0 = new StringVector();
      gFF3AttributeBuilder0.add("Contig cannot be null", stringVector0);
      gFF3AttributeBuilder0.add("mqNRtYgFVP,WGpVkEiT", "Contig cannot be null");
      String string0 = gFF3AttributeBuilder0.toString();
      assertEquals("mqNRtYgFVP,WGpVkEiT=Contig cannot be null", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.unignore("fb+{R3V#(`");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.unsetClone("");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.unsetGlue((String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      gFF3AttributeBuilder0.unsetMapping(" intersection ", (String) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GFF3AttributeBuilder gFF3AttributeBuilder0 = new GFF3AttributeBuilder();
      GFF3AttributeAggregator gFF3AttributeAggregator0 = mock(GFF3AttributeAggregator.class, new ViolatedAssumptionAnswer());
      gFF3AttributeBuilder0.unsetAggregator("Contig cannot be null", gFF3AttributeAggregator0);
  }
}
