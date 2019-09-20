public class Book {
 private String title;
 
 private String author;
 
 private String publisher;
 
 private int copiesSold;


    public Book (String newTitle, String newAuthor, String newPublisher, int bookssold){
    title = newTitle;
    author = newAuthor;
    publisher = newPublisher;
    copiesSold = bookssold;
    }
    class BookTest {

        public void main (String[] args){
    
        Book book0= new Book();
        System.out.println();
            
        

        Book book1 = new Book("Life", "John Doe", "Penguin Publishing", 100);
        System.out.println("Title: " + book1.title());
        System.out.println("Author: " + book1.author());
        System.out.println("Publisher: " + book1.publisher());
        System.out.println("Copies Sold: " + book1.copiesSold());

        
        }

    }

}
