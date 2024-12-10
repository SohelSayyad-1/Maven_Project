pipeline {
    agent any  
    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Deploy') {  
                echo 'Deploy World' 
            }
        }
          stage('Test') {
            steps {
                echo 'Test World'
            }
        }
    }
	post
	{
		always
		{
			emailext body: 'Summary', subject: 'Pipeline Status', to: 'sohelsp07@gmail.com'
		}
	}
}

