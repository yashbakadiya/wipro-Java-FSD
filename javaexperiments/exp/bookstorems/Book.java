package exp.bookstorems;

class Book {

    String name;

    String author;

    String genre;

    double price;

    Book(String name, String author, String genre, double price){
        this.name=name;
        this.author=author;
        this.genre=genre;
        this.price=price;
    }

    double discount(){
        if(!genre.equalsIgnoreCase("fiction")){
            return price;
        }
        double discountedPrice=price- (.25*price);
        return discountedPrice;
    }

}
