  package exp.schoolms;
  
  
  class StudentMain {

    public static void main(String args[]){
       Student students[]=new Student[2];
       EceStudent student1=new EceStudent(1,"bankim",21,"millimeter");      
       student1.setAge(22);
       
        CseStudent student2=new CseStudent(2,"roshi",21,"java");
        student2.setName("roshhi"); 
      
        students[0]=student1;
        students[1]=student2;
        
        

        for (Student iterated:students) {
             int id=iterated.getId();
             String name=iterated.getName();
             int age=iterated.getAge();
            System.out.println(id + " " + name + " " + age);
            boolean isEce=iterated instanceof EceStudent;
            if(isEce){
              EceStudent eceStudent=(EceStudent)iterated;
              String device=eceStudent.getDevice();
              System.out.println("device="+device);
            }
            
            if(iterated instanceof CseStudent)
            {
              CseStudent cseStudent=(CseStudent)iterated;
              System.out.println("language="+cseStudent.getProgrammingLanguage());           
            }
        }
    }

}
