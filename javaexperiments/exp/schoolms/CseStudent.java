 package exp.schoolms;
 
 public class CseStudent extends Student{
 private String programmingLanguage;
 
 public CseStudent(int id, String name, int age,String language){
 super(id,name,age);
 this.programmingLanguage=language;
 } 
 
 public void setProgrammingLanguage(String language){
 this.programmingLanguage=language;
 }
 
 public String getProgrammingLanguage(){
 return programmingLanguage;
 
 }
 
 
 
 }
