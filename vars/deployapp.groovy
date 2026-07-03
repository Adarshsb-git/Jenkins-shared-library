def deployFun(String environment){
  stage ('deploy'){
    echo "deploy stage"
    echo "deploying application to ${environment}"
    sh "echo deployment completed successfully"
  }
}
