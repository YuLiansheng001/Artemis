/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 13:13:26 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ShortCut_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.ShortCut"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ShortCut_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.EntryEdit$CommitButton",
      "uk.ac.sanger.artemis.components.variant.VCFview$27",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.filetree.JTreeTable$TreeTableCellRenderer",
      "org.emboss.jemboss.JembossParams",
      "org.biojava.bio.seq.Feature$Template",
      "com.sshtools.j2ssh.transport.AsyncService",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "htsjdk.samtools.seekablestream.SeekableFileStream",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "com.sshtools.j2ssh.connection.Channel",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.components.ActMain$4",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.circular.TextFieldInt",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.biojava.bio.Annotation",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable",
      "uk.ac.sanger.artemis.components.ShortCut",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "uk.ac.sanger.artemis.util.URLDocument",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry$IndexContig",
      "uk.ac.sanger.artemis.components.Plot",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "uk.ac.sanger.artemis.components.database.DatabaseJPanel$5",
      "uk.ac.sanger.artemis.components.database.DatabaseJPanel$6",
      "uk.ac.sanger.artemis.components.database.DatabaseEntrySource",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "uk.ac.sanger.artemis.components.ArtemisMain$8",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.components.database.DatabaseJPanel$4",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.sshtools.j2ssh.SshException",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "uk.ac.sanger.artemis.components.EditMenu",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.components.filetree.JTreeTable",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.MarkerRangeRequesterListener",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.components.SelectionMenu",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.components.filetree.LocalAndRemoteFileManager",
      "uk.ac.sanger.artemis.components.filetree.TransferableFileNodeList",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "uk.ac.sanger.artemis.components.ActMain",
      "org.biojava.bio.symbol.Symbol",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel$13",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.components.database.DatabaseJPanel",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "htsjdk.tribble.TribbleException",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "uk.ac.sanger.artemis.circular.TextFieldSink",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.seq.Sequence",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.components.database.DatabaseTreeNode",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "com.sshtools.j2ssh.transport.SshMessage",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.seq.io.ParseException",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$TreeTableCellRenderer",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "org.apache.log4j.spi.LoggerRepository",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.components.TextRequesterListener",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "uk.ac.sanger.artemis.components.AddMenu",
      "htsjdk.samtools.util.Log$LogLevel",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.components.RunMenu",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "htsjdk.samtools.util.BlockCompressedInputStream",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "uk.ac.sanger.artemis.components.ViewMenu",
      "uk.ac.sanger.artemis.components.StickyFileChooser",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "uk.ac.sanger.artemis.components.GotoMenu",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.filetree.JTreeTable$5",
      "uk.ac.sanger.artemis.components.filetree.JTreeTable$6",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.components.GraphMenu",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "uk.ac.sanger.artemis.components.SelectMenu",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.plot.UserDataAlgorithm",
      "com.sshtools.j2ssh.FileTransferProgress",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "uk.ac.sanger.artemis.components.SelectionSubMenu",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.components.EntryGroupMenu",
      "uk.ac.sanger.artemis.FeatureVector",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "org.biojava.bio.seq.FeatureHolder",
      "org.gmod.schema.dao.OrganismDaoI",
      "htsjdk.samtools.util.LocationAware",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry$1",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.WriteMenu",
      "uk.ac.sanger.artemis.components.database.ILoginPrompt",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "uk.ac.sanger.artemis.components.IndexReferenceListener",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "htsjdk.variant.vcf.VCFHeader",
      "org.biojava.bio.symbol.EmptySymbolList",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "com.sshtools.j2ssh.transport.Service",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$9",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.components.filetree.SshJTreeTable$7",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "htsjdk.samtools.seekablestream.SeekableBufferedStream",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "htsjdk.samtools.seekablestream.SeekableHTTPStream",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.biojava.bio.BioError",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.components.variant.TabixReader$Iterator",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "htsjdk.samtools.util.Log",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.GotoEventSource",
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.components.SequenceComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.EntryEdit$8",
      "uk.ac.sanger.artemis.components.EntryEdit$7",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel",
      "uk.ac.sanger.artemis.components.ArtemisMain",
      "uk.ac.sanger.artemis.components.variant.GraphPanel",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.biojava.bio.seq.io.SequenceBuilder",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "uk.ac.sanger.artemis.components.database.DatabaseJTree",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.Alphabet",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "uk.ac.sanger.artemis.Logger",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ShortCut_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.components.ShortCut",
      "uk.ac.sanger.artemis.components.ActMain",
      "uk.ac.sanger.artemis.components.database.DatabaseEntrySource",
      "uk.ac.sanger.artemis.components.ArtemisMain",
      "htsjdk.variant.vcf.VCFHeader",
      "org.emboss.jemboss.JembossParams",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.plot.UserDataAlgorithm",
      "uk.ac.sanger.artemis.components.database.DatabaseJPanel",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "org.biojava.bio.seq.io.SequenceBuilderBase"
    );
  }
}
