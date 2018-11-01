jool.lib {
   object joolPkg extends MvnRepositoryPackage {
      packageName = "org.jooq/jool";
      type = "git-mvn";
      // problems with auth using this URL
      //url = "git@github.com:jOOQ/jOOL.git";
      url = "https://github.com/jOOQ/jOOL.git#4fa207f6a4cae65b2b0c79c70b0662a068c69ce3";

      srcPaths = {"src/main/java"};
   }
}
