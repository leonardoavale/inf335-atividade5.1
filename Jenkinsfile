pipeline {
  agent any
  stages {
    stage ('Build') {
      steps {
        try {
          sh 'make'
        }
        catch (exc) {
          echo 'Something failed during the build, I should sound the klaxons!'
          throw
        }
      }
    }
    stage ('Test') {
      steps {
        try {
          sh 'make check'
          junit 'reports/**/*.xml'
        }
        catch (exc) {
          echo 'Something failed during the test, I should sound the klaxons!'
          throw
        }
      }
    }
    stage ('Deploy') {
      steps {
        try {
          sh 'make publish'
        }
        catch (exc) {
          echo 'Something failed during the deploy, I should sound the klaxons!'
          throw
        }
      }
    }
  }
}
  
