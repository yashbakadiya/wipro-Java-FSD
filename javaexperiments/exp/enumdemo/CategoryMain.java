package exp.enumdemo;

public class CategoryMain {

    public static void main(String[]  args){
        Category category1=Category.Phone;
        String code=category1.getCategoryCode();
        String displayValue=category1.getDisplayValue();
        System.out.println("enum ="+category1);
        System.out.println("category code="+code);
        System.out.println("display value="+displayValue);


        Category categories[]=Category.values();
        for(Category category:categories){
            System.out.println("enum="+category);
            System.out.println("cat code="+category.getCategoryCode());
            System.out.println("display value="+category.getDisplayValue());
        }

    }

}


