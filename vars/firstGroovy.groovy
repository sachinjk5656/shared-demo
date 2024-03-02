def call(String name = 'name', String place = 'place', String qualification = 'qualification')
pipeline {
    agent any
    environment {
        name = "$name"
        place = "$place"
        qualification = "$qualification"
    }

    stages {
        stage('Printing vars') {
            steps {  
                echo "Welcome $name from $place for completing $qualification"
            }
        }
    }
}