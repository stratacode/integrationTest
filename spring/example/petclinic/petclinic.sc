spring.example.petclinic extends tomcat.servlet, spring.std {
   // Do not inherit the package of tomcat.servlet.  Since this layer
   // uses sources in a normal Java package directory tree, it does not
   // restrict classes to any specific package.
   inheritPackage = false;

   object thymeLeaf extends MvnRepositoryPackage {
      url = "mvn://org.thymeleaf/thymeleaf/3.0.2.RELEASE";
   }
   // For some reason this dependency is excluded by the petclinic demo and after quickly looking, I could
   // not find any other way it should be getting added so just manually including it for now.
   object thymeLeafLayout extends MvnRepositoryPackage {
      url = "mvn://nz.net.ultraq.thymeleaf/thymeleaf-layout-dialect/1.4.0";
   }

   object petClinicPkg extends MvnRepositoryPackage {
      packageName = "spring-petclinic";
      // The git-mvn repository uses git to check out the src, 
      // and maven to get the dependencies
      type = "git-mvn";
      url = "https://github.com/spring-projects/spring-petclinic.git";

      // Include maven dependencies marked <scope>runtime</scope>
      includeRuntime = true;

      srcPaths = {"src/main/java", "src/main/resources"};
      // Not used anymore in the latest version of petclinic - everything is in resources
      //webPaths = {"src/main/webapp"};
   }
}
