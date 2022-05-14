pipeline {
  agent any
  stages {
   stage ('Build') {
      steps {
        sh 'make check'
		sh "mvn -Dmaven.test.failure.ignore=true clean package"
        junit 'reports/**/*.xml'
      }
	  post {
		sucess {
			junit '**/target/surefire-reports/TEST-*.xml'
			archiveArtifacts 'target/*.jar'
		}
	  }
	}
    stage ('Deploy') {
      steps {
          sh 'make publish'
      }
    }
  }
}
  
