/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:31:59 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.gff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertiesPanel_ESTest extends PropertiesPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0);
      // Undeclared exception!
      try { 
        PropertiesPanel.updateObsoleteSettings(gFFStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      PropertiesPanel propertiesPanel0 = null;
      try {
        propertiesPanel0 = new PropertiesPanel(feature0, true, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertiesPanel propertiesPanel0 = null;
      try {
        propertiesPanel0 = new PropertiesPanel((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("v_%|tg6.9&snyu");
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      // Undeclared exception!
      try { 
        propertiesPanel0.getGffQualifiers(feature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("v_%|tg6.9&snyu");
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      propertiesPanel0.updateFromFeature(feature0);
      assertTrue(propertiesPanel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("v_%|tg6.9&snyu");
      Feature feature0 = entry0.createFeature();
      bases0.reverseComplement();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      assertTrue(propertiesPanel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("Attempted to read outside of this sequence (1..", "Attempted to read outside of this sequence (1..");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0, false, true, false, true);
      propertiesPanel0.getGffQualifiers(feature0);
      assertTrue(propertiesPanel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("g`>C#I|y");
      // Undeclared exception!
      try { 
        PropertiesPanel.isPropertiesTag(qualifier0, (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("Start_range");
      boolean boolean0 = PropertiesPanel.isPropertiesTag(qualifier0, (Feature) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("v_%|tg6.9&snyu");
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      propertiesPanel0.makeBorder();
      assertTrue(propertiesPanel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("Derives_from");
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      boolean boolean0 = propertiesPanel0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Derives_from");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("v_%|tg6.9&snyu");
      Feature feature0 = entry0.createFeature();
      PropertiesPanel propertiesPanel0 = new PropertiesPanel(feature0);
      propertiesPanel0.setObsoleteChanged(false);
  }
}