def buildFun(){
  stage ('build'){
    echo "build a app"
    sh 'mvn clean package'
    echo "build success or failure"
  }
}
