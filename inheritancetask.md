**inheritance task**

base package com.traningapps.jobapp

subpackages :

              jobms

              companyms

              ui               
              
              
jobms

     
     Job{
     
      id: long
      
      type: String
        
      company: Company
     
     }
   
   
     ITJob extends Job{
     
     language: int
     
     codingExperienceInYrs :int
          
     }
     
     
     ElectronicsJob extends Job{
     
     deviceUsed: String
     
     experienceWithDeviceInYrs: int
     
     }
     
     
     JobStorage{
     
     //keep jobs array here
     
     +addITJob(*)
     
     +findJobById(*)
     
     +findJobsByType(*)
     
     
     }
     
     
     
     
companyms


     Company{
     
     id: String
     
     name: String
     
              
     }                  
              
              


Features

 Add employee
 
 find employee by id
  
 change department
 
 
**Please Note** 

 Fields should be private
 
 Use getters setters
 
 

