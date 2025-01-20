pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/AymanAhmedOsman/Jenkins-maven-App.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                sh 'java -cp target/Jenkins-maven-App-1.0-SNAPSHOT.jar com.example.App'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'output.txt', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
