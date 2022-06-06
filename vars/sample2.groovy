def call(){
pipeline{
  agent any
  stages{
   stage('Checkout'){
     steps{
     git 'https://github.com/eshwarprasadv5/sharedlib-demo-project.git'
     }
    
   }
  }
}
}
