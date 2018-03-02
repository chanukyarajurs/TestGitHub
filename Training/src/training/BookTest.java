package training;
import com.audex.books.Book;
import com.audex.books.Author;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author author = new Author("Shiv Kehra", "shiv@gmail.com", 'M');
Book winFriends = new Book("How to Win Friends and influence people", author, 290.0);


System.out.println(winFriends.toString());
Author author1 = winFriends.getAuthor();
System.out.println("The name of the book is : " +  winFriends.getName());
System.out.println("The Name of author is : " + winFriends.getAuthor().getName());


//2nd
Book twenty20 = new Book("Twenty Twenty", new Author("Chethan Bagath", "chethan@gmail.com", 'M'), 290.0, 2);
System.out.println(twenty20.toString());





	}

}
