#### README FILE

This README file has been created to providde the details of tasks which were included to be completed on Saturday's Activity.

Team Members :-
| --------------- |
| Lovedeep Sharma |
| Shivani Pal |
| Rajesh |
| Nishant |

#### Tasks are being divided into various parts as follows.

##### Task 1

Create an GitHub Organisation.

- Created an GitHub Organisation named "ninja2ansibleactivity "
- Git Link - https://github.com/orgs/ninja2ansibleactivity/people

![github.com/ninja2ansibleactivity](https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/blob/master/media/gitorg.png)


##### Task 2

Create 2 machines i.e. One Master and Another Node.

- Created two Ubuntu machines i.e. One Master and Another Node.
- Also Installed Ansible on Master Machine.
```
apt-add-repository ppa:ansible/ansible
apt-get update
apt-get install ansible
```
- Also made ssh connection between both the machines.


##### Task 3 

Create various roles for Java, Jenkins, nginx and Tomcat and Install them to thier respective machines

- Created all 4 roles i.e. Java, Jenkins, nginx and Tomcat.

Java Link - https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/tree/master/roles/java

Jenkins Link - https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/tree/master/roles/jenkins

nginx Link - https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/tree/master/roles/nginx

Tomcat Link - https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/tree/master/roles/tomcat

##### Task 4

Create Various Job DSL for Continous Integration for Spring3HibernateApp.

Created various Job DSL's.

- Git code pull
```
job('spring3_get_code1') {
  label('lovedeep')

    customWorkspace('/home/vagrant/lovedeep')

    scm {
        
      git{
        
        remote
        
         {
            url('https://github.com/Team-A-Ninja/ContinuousIntegration.git')
        
         }
            branch('master')  
         }
       }

    steps 
  
  		{      
          
		shell('ls -la' )
	
          }
}
```

![GitDsl](https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/blob/master/media/Spring3Gitcode.png)

- Git Code Continous Integration
```
mavenJob('spring3_get_stability1') 
{
  label('lovedeep')
         customWorkspace('/home/vagrant/lovedeep')
  
        mavenInstallation('mvn3.5.2')
       
        rootPOM('Spring3HibernateApp/pom.xml')
        goals('install cobertura:cobertura findbugs:findbugs checkstyle:checkstyle')
} 
```

![Git Code CI](https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/blob/master/media/Gitcode.png)

##### Task 5

Create a playbook to Deploy the Artifact on Node machine.

- Created a playbook.

![Deploy-Playbook](https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/blob/master/media/deploy%20playbook.png)

![Deploy-Playbook-Jenkins](https://github.com/ninja2ansibleactivity/Team-C-ansible-activity/blob/master/media/Spring3deploy.png)

########## Thanks  ##########



