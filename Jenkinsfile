node{
    
    stage('git checkout'){
       git credentialsId: 'git', url: 'https://github.com/botondlaxmi/war-test.git' 
        
    }
    
    stage('build & test'){
        def mavenHome = tool name: 'maven 3' , type:'maven'
        def mavenCMD = "${mavenHome}/bin/mvn" 
        sh "${mavenCMD} clean package"
    }
    
    stage('deplot to tomcat'){
        deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://localhost:8090')], contextPath: 'bootcamp4', war: '**/*.war'
    }
}
