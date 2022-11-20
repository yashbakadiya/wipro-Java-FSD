package exp.inheritancedemo;

public class CseStudent extends Student{
   private  String language;

   public CseStudent(int id,String name, String language){
       super(id, name);
       this.language=language;
   }

   public void setLanguage(String language){
       this.language=language;
   }

   public String getLanguage() {
       return language;
   }
}
