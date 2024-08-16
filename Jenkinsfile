pipeline {
    agent any

    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Thrishank99/springbootelkkobernateproject.git']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t srinu255/springboot-endtoend-application .'
                }
            }
        
        }
        stage('Push image to Hub'){
            steps{
                script{
                  withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                   bat 'docker login -u srinu255 -p ${dockerhubpwd}'

}
                   bat 'docker push srinu255/springboot-endtoend-application'
                }
            }
        }  
   }
}
