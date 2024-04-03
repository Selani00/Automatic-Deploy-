pipeline{
    agent any
    stages{
        stage('Stage-1'){
            steps{
                echo 'Stage-1 Completed'
            }
        }
        stage('Stage-2'){
            steps{
                echo 'Stage-2 Completed'
            }
        }
        stage('Stage-3'){
            steps{
                echo 'Stage-3 Completed'
            }
        }
    }
}