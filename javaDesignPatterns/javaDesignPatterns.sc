javaDesignPatterns {
   object javaDesignPatternsPkg extends MvnRepositoryPackage {
      packageName = "javaDesignPatterns";
      type = "git-mvn";
      // Not sure how to go to a specific hash with an https url. this
      // will require the machine's ssh key to be installed in the
      // user's github account settings
      url = "git@github.com:iluwatar/java-design-patterns.git#6026eedd51b9753250051b620312bbedd2ccd6ef";

      srcPaths = {"src/main/java", "src/main/resources"};
   }
}
