/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 11:42:12 GMT 2018
 */

package uk.ac.sanger.artemis.components.database;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DatabaseJTree_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.database.DatabaseJTree"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DatabaseJTree_ESTest_scaffolding.class.getClassLoader() ,
      "com.ibatis.common.beans.Probe",
      "net.sf.cglib.core.Transformer",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "com.ibatis.sqlmap.client.extensions.ParameterSetter",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "net.sf.cglib.core.KeyFactory$Generator",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "net.sf.cglib.asm.FieldWriter",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "net.sf.cglib.core.CodeEmitter$State",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "org.gmod.schema.sequence.FeaturePub",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.Constants",
      "com.ibatis.sqlmap.client.SqlMapTransactionManager",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "net.sf.cglib.core.AbstractClassGenerator",
      "org.gmod.schema.analysis.AnalysisFeature",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "org.gmod.schema.dao.SchemaDaoI",
      "org.gmod.schema.sequence.Synonym",
      "org.gmod.schema.sequence.FeatureRelationship",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.gmod.schema.sequence.FeatureCvTermProp",
      "org.postgresql.util.PSQLException",
      "org.apache.log4j.Hierarchy",
      "net.sf.cglib.beans.BulkBean",
      "com.ibatis.common.logging.Log",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "net.sf.cglib.asm.MethodWriter",
      "com.ibatis.common.util.PaginatedList",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.core.ReflectUtils$4",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "net.sf.cglib.core.LocalVariablesSorter",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "com.ibatis.sqlmap.client.SqlMapExecutor",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "com.ibatis.sqlmap.client.SqlMapException",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.gmod.schema.cv.CvTerm",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterThanTagHandler",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEqualTagHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "com.ibatis.common.io.ReaderInputStream",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "com.ibatis.sqlmap.engine.accessplan.MapAccessPlan",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "com.ibatis.sqlmap.client.extensions.ResultGetter",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.sshtools.j2ssh.FileTransferProgress",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEqualTagHandler",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "net.sf.cglib.core.ClassInfo",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.Predicate",
      "org.gmod.schema.sequence.Feature",
      "net.sf.cglib.core.ClassEmitter",
      "org.apache.log4j.PropertyWatchdog",
      "org.gmod.schema.sequence.FeatureCvTermDbXRef",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "net.sf.cglib.core.ClassNameReader",
      "org.gmod.schema.utils.Rankable",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.ibatis.sqlmap.engine.mapping.sql.Sql",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.cache.CacheController",
      "net.sf.cglib.core.ClassNameReader$1",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "net.sf.cglib.core.Local",
      "com.ibatis.sqlmap.engine.config.SqlSource",
      "net.sf.cglib.asm.Edge",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "net.sf.cglib.asm.ClassWriter",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "net.sf.cglib.beans.BulkBean$Generator",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "org.gmod.schema.cv.Cv",
      "com.ibatis.common.resources.Resources",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "org.apache.log4j.Priority",
      "com.ibatis.sqlmap.engine.exchange.DataExchange",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlChild",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicTagHandler",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "org.biojava.bio.BioException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "net.sf.cglib.asm.AnnotationVisitor",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "net.sf.cglib.asm.FieldVisitor",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "net.sf.cglib.asm.MethodVisitor",
      "net.sf.cglib.asm.ClassVisitor",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.postgresql.core.Logger",
      "org.apache.log4j.or.RendererMap",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateContext",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessThanTagHandler",
      "com.ibatis.sqlmap.client.SqlMapClient",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.pub.PubDbXRef",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "com.ibatis.sqlmap.engine.transaction.Transaction",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "net.sf.cglib.core.Customizer",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "com.ibatis.sqlmap.engine.type.TypeHandler",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.chado.Graph",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "com.ibatis.sqlmap.engine.execution.BatchException",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.ibatis.sqlmap.engine.mapping.result.ResultObjectFactory",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterEqualTagHandler",
      "net.sf.cglib.core.EmitUtils",
      "org.apache.log4j.MDC",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "org.gmod.schema.dao.SequenceDaoI",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "org.apache.log4j.spi.RootLogger",
      "com.ibatis.common.beans.Invoker",
      "net.sf.cglib.asm.Type",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "net.sf.cglib.core.MethodInfo",
      "org.apache.log4j.spi.RendererSupport",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotParameterPresentTagHandler",
      "net.sf.cglib.core.Block",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "net.sf.cglib.asm.Opcodes",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "net.sf.cglib.beans.BulkBeanException",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagContext",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback",
      "org.postgresql.Driver",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicParent",
      "org.gmod.schema.dao.CvDaoI",
      "com.ibatis.common.xml.NodeletException",
      "org.apache.log4j.Logger",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandler",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "net.sf.cglib.core.Signature",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "net.sf.cglib.asm.ByteVector",
      "uk.ac.sanger.artemis.io.Feature",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.transaction.TransactionException",
      "com.ibatis.sqlmap.engine.mapping.result.Discriminator",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "org.apache.log4j.spi.RepositorySelector",
      "net.sf.cglib.beans.BulkBean$BulkBeanKey",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "net.sf.cglib.asm.Frame",
      "uk.ac.sanger.artemis.io.Range",
      "net.sf.cglib.core.NamingPolicy",
      "uk.ac.sanger.artemis.components.database.DatabaseTreeNode",
      "net.sf.cglib.asm.Item",
      "uk.ac.sanger.artemis.io.Entry",
      "org.apache.log4j.or.DefaultRenderer",
      "com.ibatis.common.jdbc.exception.NestedSQLException",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlan",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "uk.ac.sanger.artemis.components.database.DatabaseJTree",
      "net.sf.cglib.asm.MethodAdapter",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessEqualTagHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "com.ibatis.sqlmap.client.event.RowHandler",
      "com.ibatis.sqlmap.client.extensions.TypeHandlerCallback",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.gmod.schema.organism.Organism",
      "org.gmod.schema.general.Db",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "org.apache.log4j.Appender",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "net.sf.cglib.core.CodeGenerationException",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "net.sf.cglib.core.ProcessArrayCallback",
      "uk.ac.sanger.artemis.Logger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.client.SqlMapSession",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEmptyTagHandler",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.asm.ClassReader",
      "org.apache.log4j.spi.LoggerRepository",
      "com.ibatis.common.beans.ProbeException",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash",
      "com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DatabaseJTree_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.database.DatabaseJTree",
      "uk.ac.sanger.artemis.components.database.DatabaseTreeNode",
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
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "com.ibatis.common.resources.Resources",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "com.ibatis.common.logging.LogFactory",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.postgresql.Driver",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.beans.BulkBean",
      "net.sf.cglib.beans.BulkBean$Generator",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "com.ibatis.common.beans.ProbeException",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "net.sf.cglib.beans.BulkBeanException",
      "org.gmod.schema.organism.Organism",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.MDC",
      "com.ibatis.common.xml.NodeletException",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode"
    );
  }
}
