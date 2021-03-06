/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:54:52 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.File;
import java.net.URL;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.FastaListener;
import uk.ac.sanger.artemis.editor.FastaTextPane;
import uk.ac.sanger.artemis.editor.HitInfo;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.FileDocument;
import uk.ac.sanger.artemis.util.TextDocument;
import uk.ac.sanger.artemis.util.URLDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastaTextPane_ESTest extends FastaTextPane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = FastaTextPane.insertNewline("", "acc org des gen");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("2QYG(h5m0]]2q(N+", "");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(fileDocument0);
      // Undeclared exception!
      try { 
        fastaTextPane0.reRead();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastaTextPane fastaTextPane0 = null;
      try {
        fastaTextPane0 = new FastaTextPane((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      FastaTextPane fastaTextPane0 = null;
      try {
        fastaTextPane0 = new FastaTextPane(textDocument0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(true, "!ptd}\"Pw^(^u1", stringArray0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "", stringArray0, "p2>j!GF]5tv)<3");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "<s");
      HitInfo hitInfo0 = new HitInfo("internal error - a JOIN should have > 1 child", "");
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(mockFile0, true, hitInfo0, stringArray0, "internal error - a JOIN should have > 1 child");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f", "getz");
      HitInfo hitInfo0 = new HitInfo("", "q|> ?}d&d*T:$~L6%");
      String[] stringArray0 = new String[6];
      FastaTextPane.getUniprotLinkToDatabase(mockFile0, false, hitInfo0, stringArray0, "q|> ?}d&d*T:$~L6%");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = FastaTextPane.insertNewline("f", "f");
      assertEquals("f", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HitInfo hitInfo0 = new HitInfo("Wp6`OY", "Wp6`OY");
      HitInfo hitInfo1 = FastaTextPane.checkCache(hitInfo0);
      assertNull(hitInfo1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastaTextPane.setRemoteMfetch(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(uRLDocument0);
      Vector<HitInfo> vector0 = fastaTextPane0.getHitCollection();
      assertNull(vector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = FastaTextPane.getMfetchExecutable();
      assertTrue(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastaTextPane.setForceUrl(false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("2QYG(h5m0]]2q(N+", "");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(fileDocument0);
      fastaTextPane0.addFastaListener((FastaListener) null);
      assertFalse(fastaTextPane0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = FastaTextPane.isForceUrl();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(uRLDocument0);
      int int0 = fastaTextPane0.getQueryLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = FastaTextPane.isRemoteMfetch();
      assertFalse(boolean0);
  }
}
