/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:40:26 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.LogReadListener;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.DocumentEntryFactory;
import uk.ac.sanger.artemis.io.EmblDocumentEntry;
import uk.ac.sanger.artemis.io.Entry;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.GenbankDocumentEntry;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.PublicDBDocumentEntry;
import uk.ac.sanger.artemis.io.ReadListener;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.FileDocument;
import uk.ac.sanger.artemis.util.TextDocument;
import uk.ac.sanger.artemis.util.URLDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentEntryFactory_ESTest extends DocumentEntryFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(simpleEntryInformation0);
      // Undeclared exception!
      try { 
        DocumentEntryFactory.makeDocumentEntry((EntryInformation) simpleEntryInformation0, (Entry) emblDocumentEntry0, (-2165), true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unknown DocumentEntry type
         //
         verifyException("uk.ac.sanger.artemis.io.DocumentEntryFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      LogReadListener logReadListener0 = new LogReadListener("&Ix,");
      // Undeclared exception!
      try { 
        DocumentEntryFactory.makeDocumentEntry(entryInformation0, (Document) null, (ReadListener) logReadListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DocumentEntryFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      MockFile mockFile0 = new MockFile("");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      LogReadListener logReadListener0 = new LogReadListener("");
      try { 
        DocumentEntryFactory.makeDocumentEntry(entryInformation0, (Document) fileDocument0, (ReadListener) logReadListener0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      TextDocument textDocument0 = new TextDocument();
      LogReadListener logReadListener0 = new LogReadListener("SELECT fcp.feature_cvterm_id, pub.* FROM feature_cvterm_pub fcp LEFT JOIN pub ON fcp.pub_id=pub.pub_id ");
      // Undeclared exception!
      try { 
        DocumentEntryFactory.makeDocumentEntry((EntryInformation) mSPcrunchEntryInformation0, (Document) textDocument0, (ReadListener) logReadListener0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(mSPcrunchEntryInformation0);
      EmblDocumentEntry emblDocumentEntry1 = (EmblDocumentEntry)DocumentEntryFactory.makeDocumentEntry((EntryInformation) mSPcrunchEntryInformation0, (Entry) emblDocumentEntry0, 0, true);
      assertTrue(PublicDBDocumentEntry.IGNORE_OBSOLETE_FEATURES);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      // Undeclared exception!
      try { 
        DocumentEntryFactory.makeDocumentEntry((EntryInformation) blastEntryInformation0, (Entry) null, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(mSPcrunchEntryInformation0);
      EmblDocumentEntry emblDocumentEntry1 = (EmblDocumentEntry)DocumentEntryFactory.makeDocumentEntry((EntryInformation) mSPcrunchEntryInformation0, (Entry) emblDocumentEntry0, 0, false);
      assertTrue(PublicDBDocumentEntry.IGNORE_OBSOLETE_FEATURES);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      GenbankDocumentEntry genbankDocumentEntry0 = new GenbankDocumentEntry(mSPcrunchEntryInformation0);
      GenbankDocumentEntry genbankDocumentEntry1 = (GenbankDocumentEntry)DocumentEntryFactory.makeDocumentEntry((EntryInformation) mSPcrunchEntryInformation0, (Entry) genbankDocumentEntry0, 0, true);
      assertTrue(PublicDBDocumentEntry.IGNORE_OBSOLETE_FEATURES);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      // Undeclared exception!
      try { 
        DocumentEntryFactory.makeDocumentEntry(entryInformation0, (Entry) null, 597, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unknown DocumentEntry type
         //
         verifyException("uk.ac.sanger.artemis.io.DocumentEntryFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      LogReadListener logReadListener0 = new LogReadListener("");
      try { 
        DocumentEntryFactory.makeDocumentEntry((EntryInformation) blastEntryInformation0, (Document) uRLDocument0, (ReadListener) logReadListener0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}
