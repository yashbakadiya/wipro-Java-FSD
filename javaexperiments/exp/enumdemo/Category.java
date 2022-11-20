package exp.enumdemo;

public enum Category {

    Phone("phn", "Android Phones amd iphones"),
    Laptop("lap","Laptops and Computers"),
    Groceries("grcr", "Groceries and more");

    Category(String categoryCode, String displayValue){
        this.categoryCode=categoryCode;
        this.displayValue=displayValue;
    }

    private String categoryCode, displayValue;

    public String getCategoryCode(){
        return categoryCode;
    }

    public String getDisplayValue(){
        return displayValue;
    }


}
