def call(String name = 'name', String place = 'place', String qualification = 'qualification') {
    pipeline {
    environment {
        name = "$name"
        place = "$place"
        qualification = "$qualification"
    }
    agent any
   

    stages {
        stage('Printing vars') {
            steps {  
                sh 'ls'
                sh echo "Welcome $name from $place for completing $qualification"
            }
        }
    }
}
}