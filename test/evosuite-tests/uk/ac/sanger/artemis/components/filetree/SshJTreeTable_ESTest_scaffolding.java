/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 12:12:17 GMT 2018
 */

package uk.ac.sanger.artemis.components.filetree;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SshJTreeTable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.filetree.SshJTreeTable"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SshJTreeTable_ESTest_scaffolding.class.getClassLoader() ,
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "uk.ac.sanger.artemis.components.filetree.FileNode",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.components.SwingWorker$1",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.SwingWorker$2",
      "com.sshtools.j2ssh.transport.Service",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$9",
      "uk.ac.sanger.artemis.EntryGroup",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$7",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$1",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolClient",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "com.sshtools.j2ssh.transport.TransportProtocolEventHandler",
      "com.sshtools.j2ssh.FileTransferProgress",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$TreeTableCellEditor",
      "com.sshtools.j2ssh.transport.SshMessage",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.emboss.jemboss.JembossParams",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "com.sshtools.j2ssh.transport.AsyncService",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.util.Document",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$TreeTableCellRenderer",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "uk.ac.sanger.artemis.components.SwingWorker$ThreadVar",
      "org.emboss.jemboss.gui.Browser$6",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.emboss.jemboss.gui.Browser",
      "com.sshtools.j2ssh.connection.Channel",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "uk.ac.sanger.artemis.components.filetree.TransferableFileNodeList",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "com.sshtools.j2ssh.SshException",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.components.filetree.AbstractCellEditor",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$PopupListener",
      "com.sshtools.j2ssh.connection.IOChannel",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "com.sshtools.j2ssh.transport.TransportProtocolException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SshJTreeTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$TreeTableCellRenderer",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$1",
      "uk.ac.sanger.artemis.components.filetree.FileNode",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.filetree.TransferableFileNodeList",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.emboss.jemboss.gui.Browser",
      "org.emboss.jemboss.JembossParams",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "com.sshtools.j2ssh.io.UnsignedInteger64"
    );
  }
}
