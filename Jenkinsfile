


pipeline{
    environment {
        PROD_BRANCH = 'master'
        STAGING_BRANCH = 'staging'
        user_env_input = 'Development'
    }

    agent any
     
   
    stages {
        stage('Which environment to build?') {
            steps {
            sh 'echo which environment to build'       
            }
        }
        stage('Confirm') {
            steps {
                script {
              (manual_value == 'true') {
                        input("Do you want to proceed building in ${user_env_input} environment?")
                    }
                }
            
        }
        stage('Clean Build') {
            steps {
                sh 'mvn clean build'
                echo 'Building..'
            }
        }
        
       

       

        }   
    }
}

