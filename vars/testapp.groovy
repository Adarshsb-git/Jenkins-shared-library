def testFun(){
  stage ('test'){
    echo "run the unit tests"
    sh 'mvn test'
    echo "test stage success"
  }
}
