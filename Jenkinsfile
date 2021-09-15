pipeline {
     agent any
        stages {
          stage("Compile") {
               steps {
                    sh "chmod 755 gradlew"
		    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"
               }
          }
    }      
  }
