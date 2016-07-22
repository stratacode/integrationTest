prestodb.presto {
   object prestoPkg extends MvnRepositoryPackage {
      packageName = "prestodb/presto";
      type = "git-mvn";
      url = "https://github.com/prestodb/presto";

      srcPaths = {"src/main/java", "src/main/resources"};

      // Needed for at least org.jetbrains.annotations
      includeProvided = true;
   }

   srcPath = "antlrSrc";
}
