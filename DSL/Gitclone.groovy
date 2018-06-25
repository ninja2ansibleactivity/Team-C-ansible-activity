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
