/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
/*
 * COP 3084 - Fall 2016
 * Library System Project - phase 1
 * and open the template in the editor.
 * @author Alexis Gonzalez
 */

//** This class represent and child from main class
public class PrintedBook extends Book
{
//Private instance of extended class
    private String coverType;
    
     /**
      * This constructor initializes the fields to the passed values.
      *
      * @param startcoverType PrintedBook's initial item
     */
    public String getCoverType()
    {
        return coverType;
    }

    /**
     * The setcoverType method stores a value in the file type field
     * 
     * @param coverType the value to store in file type
     */
    public void setCoverType(String coverType)
    {
        this.coverType = coverType;
    }
/**
     * The toString method returns a string representing the state of an PrintedBook object.
     * 
     * @return A string containing the Item information: itemID, title, genre, file type, target audience, available, author, ISBN
     */
    public PrintedBook( int itemID, String title,String coverType,String targetAudience, boolean available,String author, String isbn, String genre) {
        super(author, isbn, itemID, title, genre, targetAudience, available);
        this.coverType = coverType;
    }
/**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * 
     * @param p The object being copied. 
     */
    public PrintedBook(PrintedBook p)
    {
        super(p);//polymorfism///take one fields that we inherent//call of the constructor in the parent class
        
      if (p != null)
        {
            coverType = p.coverType;
        }
    }
    }
	
	
	
	//this is the tostring method with your desired output
	@Override
    public String toString()
    {
        String output = super.toString();
        return output;
    }

   /**
     * The equals method compares two PrintedBook objects.  The result is true if the arguments
     * is not null and is a PrintedBook object with the same values for all fields as this object.
     * @param it
     * @return 
     */
    @Override
    public boolean equals (Object it)
    {   
        //check that the type of parameter is electronicBook
        if (!(it instanceof PrintedBook))
        {
        return false;                     
        }
        
        //we already know that it is of type Book, so its safe to cast
        PrintedBook type = (PrintedBook) it;
        
        //return true or false depending on weather, itemID, title, genre ,targetAudience, file type, available, author and ISBN have the same value.
        return super.equals(type) && coverType.equals(type.coverType); 

    

}
