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
                    bat 'docker build -t srinuk9676/springboot-endtoend-application .'
                }
            }
        
        }
        stage('Push image to Hub'){
            steps{
                script{
                  withCredentials([usernamePassword(credentialsId: 'dockerhubpwd', passwordVariable: 'dockerhubpwd', usernameVariable: 'srinuk9676')]) {
                  bat "docker login -u ${env.srinuk9676} -p ${env.dockerhubpwd}"

}
                  bat 'docker push srinuk9676/springboot-endtoend-application'
                }
            }
        }  
   }
}