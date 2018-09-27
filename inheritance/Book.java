/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Objects;

public abstract class Book extends Item{
    

String author ;
 String isbn;

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String author, String isbn, int itemID, String title, String genre, String targetAudience, boolean available) {
        super(itemID, title, genre, targetAudience, available);
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
 
    

    
    public Book(Book b) {
        super(b);
        this.author = b.author;
        this.isbn = b.isbn;
        
    }
    
}
