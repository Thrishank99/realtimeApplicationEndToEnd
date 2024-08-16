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
                  withCredentials([usernamePassword(credentialsId: 'dockerhubpwd', passwordVariable: 'dockerhubpwd', usernameVariable: 'srinu255')]) {
                  bat "docker login -u ${env.srinu255} -p ${env.dockerhubpwd}"

}
                  bat 'srinu255/springboot-endtoend-application'
                }
            }
        }  
   }
}