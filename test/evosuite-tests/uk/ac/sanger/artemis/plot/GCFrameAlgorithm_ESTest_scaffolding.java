/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 16:09:48 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GCFrameAlgorithm_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.plot.GCFrameAlgorithm"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GCFrameAlgorithm_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "org.biojava.bio.seq.AcceptNoneFilter",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "org.biojava.bio.seq.ByHierarchy",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "org.biojava.bio.seq.impl.SimpleSimilarityPairFeature",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "org.biojava.ontology.Term",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.biojava.utils.ChangeListener",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$EmptyPairwiseAlignment",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.GotoEvent",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.seq.SimpleFeatureHolder",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.seq.Feature$Template",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "org.postgresql.util.PSQLException",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.utils.Changeable",
      "org.biojava.bio.symbol.EmptyLocation",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.postgresql.largeobject.LargeObject",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.biojava.bio.seq.StrandedFeature",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.LocationComparator",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.biojava.utils.bytecode.GeneratedClassLoader",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.biojava.bio.symbol.Edit",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "org.apache.log4j.or.ObjectRenderer",
      "org.postgresql.largeobject.BlobOutputStream",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.biojava.utils.bytecode.CodeGenerator",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "org.biojava.utils.bytecode.CodeMethod",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.biojava.utils.ChangeForwarder",
      "org.biojava.bio.Annotation",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "org.biojava.bio.seq.io.StreamParser",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "org.biojava.bio.seq.FeatureFilter",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.sshtools.j2ssh.FileTransferProgress",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.biojava.utils.ChangeEvent",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$Template",
      "org.biojava.bio.seq.FeatureFilter$OnlyChildren",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "org.biojava.bio.molbio.RestrictionEnzyme",
      "uk.ac.sanger.artemis.io.BioJavaSequence",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "org.biojava.bio.BioRuntimeException",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "org.biojava.bio.seq.AcceptAllFilter",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "org.biojava.bio.seq.FeatureHolder",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.symbol.SymbolList",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.biojava.utils.ClassTools",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "org.biojava.bio.seq.impl.SimpleStrandedFeature",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.postgresql.largeobject.BlobInputStream",
      "org.apache.log4j.helpers.Loader",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "org.apache.log4j.ProvisionNode",
      "org.biojava.bio.seq.impl.SimpleFeature",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "org.biojava.bio.symbol.Alignment",
      "org.biojava.bio.seq.impl.SimpleRestrictionSite",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.BioError",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "org.biojava.bio.seq.OptimizableFilter",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "org.biojava.bio.symbol.Symbol",
      "org.biojava.bio.seq.RealizingFeatureHolder",
      "org.biojava.bio.molbio.RestrictionSite$Template",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.biojava.bio.symbol.AbstractLocation",
      "org.biojava.bio.seq.AbstractFeatureHolder",
      "uk.ac.sanger.artemis.GotoEventSource",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "org.biojava.utils.ChangeSupport",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.biojava.bio.molbio.RestrictionSite",
      "org.biojava.bio.seq.StrandedFeature$Strand",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.seq.Sequence",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "org.apache.log4j.spi.RepositorySelector",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder$1",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.biojava.bio.symbol.AbstractRangeLocation",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.symbol.Location",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.components.FileViewer",
      "org.biojava.bio.symbol.Alphabet",
      "uk.ac.sanger.artemis.Selection",
      "org.biojava.utils.walker.WalkerFactory",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.bytecode.CodeException",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.Logger",
      "org.biojava.bio.seq.IsTopLevel",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "org.apache.log4j.spi.LoggerRepository",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash",
      "org.biojava.bio.symbol.RangeLocation",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GCFrameAlgorithm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
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
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "org.biojava.bio.seq.Feature$Template",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.molbio.RestrictionSite$Template",
      "org.biojava.bio.seq.impl.SimpleFeature",
      "org.biojava.bio.seq.impl.SimpleStrandedFeature",
      "org.biojava.bio.seq.impl.SimpleRestrictionSite",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "org.biojava.bio.symbol.EmptySymbolList",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.bio.symbol.SymbolList",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.postgresql.largeobject.LargeObject",
      "org.emboss.jemboss.JembossParams",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot"
    );
  }
}
