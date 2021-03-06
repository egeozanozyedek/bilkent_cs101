import java.util.ArrayList;

/*
 Name: Ege Ozan �zyedek
 Date: 13.12.2017
 Program Name: Library
 Program Description: A class that creates a library containing 4 books that are initialized null. User can add books
 by title and author, find the book by title and loan remove or return the book.
 */ 
public class Library {
  
  // properties
  private ArrayList<LibraryBook> book;
  private int n;
  // constructors
  
  /**
   * Conductor of class to create an empty library
   */
  public Library() { 
    book = new ArrayList<LibraryBook>();
  }
  
  // methods
  
  /**
   * Shows whether the library is empty or not
   * @return true if empty false if not
   */
  public boolean isEmpty() {
    return book.size() == 0;
  }
  
  /**
   * toString to make debugging easy and also to show books in library
   * @return method returns
   */
  public String toString() {
    String result;
    result = "";
    for (n = 0; n < book.size(); n++) {
      
      result = result + book.get(n).toString() + "\n";
      
    }
    return result;
  }
  
  /**
   * Will be used to add a book to the library
   * @param title which declares a null book 
   * @param author does the same thing as title
   */
  public void add( String title, String author) {
    book.add(new LibraryBook(title, author));
  }
  
  /**
   *When used this method returns the book with the title
   * @param title to compare the books title
   * @return the book with the same title
   */
  public LibraryBook findByTitle( String title) {
    LibraryBook result;
    result = null;
    for (n = 0; n < book.size(); n++) {
      if (title.equals(book.get(n).title)) {
        result = book.get(n);
      }
    }
    return result;
  }
  
  /**
   * This method removes a book from a library
   * @param aBook which is the chosen book
   * @return returns false if there is no book to be removed
   */
  public boolean remove( LibraryBook aBook) {
    for (n = 0; n < book.size(); n++) {
      if (book.get(n) == aBook) {
      book.remove(n);
      return true;
      }
    }
  return false;
  }
}