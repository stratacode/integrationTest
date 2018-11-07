prestodb.presto {
   object prestoPkg extends MvnRepositoryPackage {
      packageName = "prestodb/presto";
      type = "git-mvn";
      // Because we have copied in the antlr generated source here need to fix
      // the version
      url = "https://github.com/prestodb/presto#c69669abb8152f995684232f602586a245f2b7f5";

      srcPaths = {"src/main/java", "src/main/resources"};

      // Needed for at least org.jetbrains.annotations
      includeProvided = true;
   }

   srcPath = "antlrSrc";
}
