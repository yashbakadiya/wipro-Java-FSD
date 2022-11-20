package exp.bookstorems;

public class BookStore {

    Book books[]=new Book[5];

    String genres[]={"programming", "fiction", "adventure" };

    int index;

    Book addBook(String name, String author, double price, String genre){
        Book book=new Book(name,author,genre,price);
        books[index]=book;
        index++;
        return book;
    }

    Book findByName(String name){
        for (Book book: books){
            if(book.name.equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }

    Book[] findBooksByGenre(String genre){
        Book desired[]=new Book[index];
        int i=0;
        for (Book book: books){
            if(book.genre.equalsIgnoreCase(genre)){
                desired[i]=book;
                i++;
            }
        }
        return desired;
    }


}
