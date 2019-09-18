library('jenkins-shared-library@1.0.4')

pipeline {
  agent any
  stages {

    stage('Where is Jenkins Shared Library cloned') {
      steps {
        script {
          sh 'ls -la ../050-shared-library-where-is-it-cloned@libs/jenkins-shared-library'
        }
      }
    }

  }
}

