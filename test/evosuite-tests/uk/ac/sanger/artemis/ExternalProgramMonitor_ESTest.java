/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:10:00 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ExternalProgramListener;
import uk.ac.sanger.artemis.ProcessMonitor;
import uk.ac.sanger.artemis.components.LogViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExternalProgramMonitor_ESTest extends ExternalProgramMonitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Process process0 = mock(Process.class, new ViolatedAssumptionAnswer());
      LogViewer logViewer0 = new LogViewer();
      ProcessMonitor processMonitor0 = new ProcessMonitor(process0, "Q", logViewer0);
      ExternalProgramListener externalProgramListener0 = mock(ExternalProgramListener.class, new ViolatedAssumptionAnswer());
      processMonitor0.addExternalProgramListener(externalProgramListener0);
      assertEquals(0, processMonitor0.countStackFrames());
  }
}
