package sc.gwt;

gwt.lib extends servlet.webAppBuild, gwt.lang {
   // Tells the system to put the src into a sub-directory of the normal build directory
   buildSrcSubDir = "src";

   // GWT has been decomissioned.  We are keeping it around because it helped expand the integration APIs so it's a good reminder how to do certain things
   // and to make sure those APIs are still active.  By disabling it we won't try to load any source references in the layer and turn off errors that would otherwise
   // result.
   disabled = true;

   public void init() {
      createDefaultRuntime("gwt", false);
   }

   public void start() {
      String sdkDir = System.getenv("GWT_SDK");
      if (sdkDir == null)
         sdkDir = getRelativeFile("lib");

      if (!(new java.io.File(sdkDir).isDirectory())) {
         throw new IllegalArgumentException("*** Need a link from: " + sdkDir + " to the GWT SDK or set the GWT_SDK environment variable");
      }

      System.setProperty("gwt.sdk.dir", sdkDir);

      // Include the gwt jars into the classpath
      String file = sc.util.FileUtil.concat(sdkDir, "gwt-user.jar");
      classPath = file;

      if (!(new java.io.File(classPath).canRead())) {
         throw new IllegalArgumentException("*** GWT SDK is missing a readable gwt-user.jar at: " + classPath);
      }
      file = sc.util.FileUtil.concat(sdkDir, "gwt-dev.jar");
      if (!(new java.io.File(classPath).canRead())) {
         throw new IllegalArgumentException("*** GWT SDK is missing a readable gwt-dev.jar at: " + classPath);
      }
      classPath = classPath + sc.util.FileUtil.PATH_SEPARATOR + file;
      sc.layer.LayeredSystem system = getLayeredSystem();

      if (activated) {
         // GWT does not support reflection.  Need to compile in references
         system.useRuntimeReflection = false;
      }

      sc.lang.TemplateLanguage templateResourceLang = new sc.lang.TemplateLanguage();
      templateResourceLang.processTemplate = true;
      templateResourceLang.definedInLayer = this;
      // For gwt, xml files are used by the compiler itself so they need to be done
      // before the process phase in prepare.  May need to register a separate xml pattern for the specific build files
      // if we need to scxml elsewhere with different rules (i.e. that go into the web root)
      templateResourceLang.buildPhase = sc.layer.BuildPhase.Prepare;
      templateResourceLang.resultSuffix = "xml";
      templateResourceLang.useSrcDir = false;
      templateResourceLang.prependLayerPackage = false;
      // Share one buildDir for web root files since they do not support path searching
      templateResourceLang.useCommonBuildDir = true;
      registerLanguage(templateResourceLang, "scxml");

      templateResourceLang = new sc.lang.TemplateLanguage();
      templateResourceLang.processTemplate = true;
      templateResourceLang.definedInLayer = this;
      // This one could be Process?
      templateResourceLang.buildPhase = sc.layer.BuildPhase.Prepare;
      templateResourceLang.resultSuffix = "html";
      templateResourceLang.useSrcDir = false;
      templateResourceLang.prependLayerPackage = false;
      // Share one buildDir for web root files since they do not support path searching
      templateResourceLang.useCommonBuildDir = true;
      registerLanguage(templateResourceLang, "schtml");
   }
}
