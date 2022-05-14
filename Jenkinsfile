pipeline {
  agent any
  
  tools {
	maven "M3"
  }
  stages {
	
	stage ('Build') {
		steps {
			git	branch: 'main', url: 'https://github.com/leonardoavale/inf335-atividade5.git'
			bat "mvn clean package"
			//junit 'reports/**/*.xml'
		}
		post {
			success {
				archiveArtifacts 'maven/target/*.jar'
			}
			always {
				junit '**/maven/target/surefire-reports/*.xml'
			}
		}
	}
  }
}
  
