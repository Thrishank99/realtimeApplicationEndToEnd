pipeline {
    agent any
    tools{
         maven 'maven 3.9.1'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Thrishank99/springbootelkkobernateproject.git']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t srinu255/springboot-elk-kubernate .'
                }
            }
        
        }     
    }
}