broadleaf.core {
   // An optional package for Java11
   object annotationPkg extends MvnRepositoryPackage {
     url = "mvn://javax.annotation/javax.annotation-api/1.3.2";
   }
   object broadLeafPkg extends MvnRepositoryPackage {
      packageName = "broadleaf";
      type = "git-mvn";
      // TODO: Tying to a specific commit from where this worked.  Now we are missing some libraries which looks like a maven problem about including the right library which is not a priority given how bizarre maven is used sometimes. 
      url = "https://github.com/BroadleafCommerce/BroadleafCommerce.git#f0e641be448a7fcbb2eba277c95011ddb3018272";
      useRepositories = true;
      // TODO: remove this? didn't work for broadleaf
      // Broadleaf stopped distributing to our default repository but
      // does have a public repo they use to publish their distributions
      // which is in the POM for this package.
      //useDistributionRepositories = true;

      srcPaths = {"src/main/java", "src/main/resources"};
   }

   {
      // Broadleaf currently only compiles with javac -source 1.7
      layeredSystem.options.javaSrcVersion = "1.7";
   }
}
