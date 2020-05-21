pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				sh 'mvn --version'
				sh 'mvn clean package'
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
				//sh 'sh startup.sh'
				sh 'kubectl apply -f kubernetes-deployment-config.yaml'
            }
        }
    }
}