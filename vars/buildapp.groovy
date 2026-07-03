def buildFun(){
  stage ('build'){
    echo "build a app"
    sh 'mvn clean'
    echo "build success or failure"
  }
}
