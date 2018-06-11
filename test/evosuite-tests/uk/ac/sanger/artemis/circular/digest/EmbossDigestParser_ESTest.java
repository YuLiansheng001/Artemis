/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:41:58 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.EmbossDigestParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbossDigestParser_ESTest extends EmbossDigestParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "/N=bG;qz;y+REBASE/embossre.enz");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)35;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      embossDigestParser0.setEmbossDir("N=bG;qz;y+");
      embossDigestParser0.afterPropertiesSet();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "test/N=bG;qz;y+REBASE/embossre.enz");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Handlng log4j.additivit.");
      embossDigestParser0.setEmbossDir("N=bG;qz;y+");
      embossDigestParser0.afterPropertiesSet();
      List<String> list0 = embossDigestParser0.getDigests();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      embossDigestParser0.afterPropertiesSet();
  }
}