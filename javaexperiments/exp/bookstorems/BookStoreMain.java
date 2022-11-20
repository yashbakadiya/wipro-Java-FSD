package exp.bookstorems;

public class BookStoreMain {

    public static void main(String args[]){
        BookStore store=new BookStore();
        store.addBook("complete reference","schieldt",2000,"programming");
        Book foundBook=store.findByName("complete reference");

    }
}
