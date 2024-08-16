pipeline {
    agent any
    tools{
        maven 'Maven 3.9.8'
    }
    stages{
        stage('Build Maven'){
            steps{
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Thrishank99/realtimeApplicationEndToEnd']])
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
    }
}

