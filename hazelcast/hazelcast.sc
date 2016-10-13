hazelcast {
   object hazelcastPkg extends MvnRepositoryPackage {
      packageName = "hazelcast";
      type = "git-mvn";
      url = "git@github.com:hazelcast/hazelcast.git";

      srcPaths = {"src/main/java", "src/main/resources"};

      includeProvided = true;
      // osgi at least is required for compiling and it's marked as optional
      includeOptional = true;

      useRepositories = true;

      excludeModules = {"hazelcast-build-utils"};
   }
}
