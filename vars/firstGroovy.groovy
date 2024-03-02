def call(String name = 'name', String place = 'place', String qualification = 'qualification', String url = 'url') {
    pipeline {
    environment {
        name = "$name"
        place = "$place"
        qualification = "$qualification"
        url = "$url"
    }
    agent any
   

    stages {
        stage('Printing vars') {
            steps {  
                echo "Welcome $name from $place for completing $qualification"
            }
        }
        stage('gitclone') {
            steps {
                git '$url'
                sh 'ls'
            }
        }
    }
}
}