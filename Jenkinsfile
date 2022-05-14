pipeline {
  agent any
  
  tools {
	maven "M3"
  }
  stages {
	
	stage ('Build') {
		steps {
			git	branch: 'main', url: 'https://github.com/leonardoavale/inf335-atividade5.git'
			bat "mvn -Dmaven.test.failure.ignore=true clean package"
			//junit 'reports/**/*.xml'
		}
		post {
			success {
				junit '**/maven/target/surefire-reports/TEST-*.xml'
				archiveArtifacts 'maven/target/*.jar'
			}
		}
	}
  }
}
  
