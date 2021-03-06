/*
 Name: Ege Ozan �zyedek
 Date: 13.12.2017
 Program Name: LibraryBook
 Program Description: A class that contains methods to loan and return a book and chack how many times it was loande
 and if its loaned or not at the moment
 */ 
public class LibraryBook {
  
  // properties
  public String title;
  public String author;
  private String dueDate;
  private int timesLoaned;
  private boolean loaned;
  
  // constructors
  
  /**
   * Conductor of class to initilize properties
   * @param startTitle to determine start title
   * @param startAuthor to determine start author
   * @param startDueDate to determine start dueDate 
   * @param startTimesLoaned to determine how many timesLoaned at the start
   * @param startLoanrd to determine if the book is loaned at the start
   */
  public LibraryBook( String startTitle, String startAuthor, String startDueDate, int startTimesLoaned, boolean startLoaned) {
    title = startTitle ;
    author = startAuthor ;
    dueDate = startDueDate ;
    timesLoaned = startTimesLoaned ;
    loaned = startLoaned;
  }
  
  /**
   * Conductor of class to initilize properties
   * @param startTitle to determine start title
   * @param startAuthor to determine start author
   */
  public LibraryBook( String startTitle, String startAuthor) {
    title = startTitle ;
    author = startAuthor ;
    dueDate = "" ;
    timesLoaned = 0 ;
    loaned = false;
  }
  
  /**
   * Conductor of class to copy properties
   * @param x to copy x's properties
   */
  public LibraryBook(LibraryBook x) {
    title = x.title;
    author = x.author;
    loaned = x.loaned;
    dueDate = x.dueDate;
    timesLoaned = x.timesLoaned;
  }
  
  // methods
  
  /**
   * This method will be used if the book is loaned
   * @param newDueDate to determine dueDate
   * @return the initialized dueDate
   */
  public void loanBook( String newDueDate) {
    dueDate = newDueDate;
    timesLoaned++;
    loaned = true;
  }
  
  /**
   * This method will be used if the book is returned
   * @return newly initialized dueDate (which is an empty string)
   */
  public void returnBook() {
    dueDate = "";
    loaned = false;
  }
  
  /**
   * How many times the book was loaned
   * @return how many times the book was loaned
   */
  public int getTimesLoaned() {
    return timesLoaned ;
  }
  
  /**
   * Determines if the book is loaned or not
   * @return the book is loaned or not
   */
  public boolean onLoan() {
    return loaned;
  }
  
  /**
   * toString to make debugging easy
   * @return method returns
   */
  public String toString() {
    String result;
    result = "Title: "+ title + ", " + "Author: " + author + ", " 
      + "Book is loaned: " + loaned + ", " + "Times Loaned: " + timesLoaned ;
    if ( onLoan()) {
      result = result + ", " + "Due Date: " + dueDate;
    }
    return result;
  }
  
  /**
   * Method to see whether both objects are equal
   * @param x, LibraryBook object
   * @return true or false depending on author and title
   */
  public boolean equals( LibraryBook x) {
    boolean result;
    if ( title == x.title && author == x.author) {
      result = true;
    }
    else {
      result = false;
    }
    return result;
  }
  
  /**
   * Method to see if two references have the same title
   * @param x, LibraryBook object
   * @return true if title is same else false
   */
  public boolean hasSameTitle( LibraryBook x) {
    return x.title == title;
  }
  
  /**
   * Method to see if two references have the same author
   * @param x, LibraryBook object
   * @return true if author is same else false
   */
  public boolean hasSameAuthor( LibraryBook x) {
    return x.author == author;
  }
}