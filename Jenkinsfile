pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				sh 'mvn --version'
				sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				sh 'nohup java -jar ./target/myfirstservice-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}