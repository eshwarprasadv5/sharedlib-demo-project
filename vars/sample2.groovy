def call(){
pipeline{
  agent{
    label 'maven2'
  }
  stages{
   stage('Checkout'){
     steps{
     git 'https://github.com/eshwarprasadv5/sharedlib-demo-project.git'
     }
    
   }
  }
}
}
