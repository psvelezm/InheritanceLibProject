/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
This class represent a special kind of Item, an ElectronicBook.
 */
public class ElectronicBook extends Book 
{
    //private instance of extended class
    private String fileType;   

    /**
     * This constructor initializes the fields to the passed values.
     * 
     * @param startItem ElectronicBook's initial item
     * @param startTitle ElectronicBook's initial title
     * @param startGenre ElectronicBook's initial genre
     * @param startAudience ElectronicBook's initial audience
     * @param startfileType ElectronicBook's initial file type
     * @param available ElectronicBook's initial available
     * @param startAuthor ElectronicBook's initial author
     * @param startISBN  ElectronicBook's initial ISBN
     */
    public ElectronicBook (int startItem, String startTitle, String startGenre, String startAudience, String startfileType, boolean available, String startAuthor, int startISBN)
    {
        //call the constructor in the super class
        super (startItem, startTitle,startGenre, startAudience, available, startAuthor, startISBN);////------7...
        
        //set the fields in this class
        fileType = startfileType;              
    }
    
    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * 
     * @param itemObject The object being copied. 
     */
    public ElectronicBook (ElectronicBook itemObject)
    {
        super (itemObject);//polymorfism///take 3 fields that we inherent//call of the constructor in the parent class
        if (itemObject != null)
        {
            fileType = itemObject.fileType;
        }
    }
    
    /**
     * The getfileType method returns a ElectronicBook object's file type
     * 
     * @return The value in the file type field.
     */    
    public String getfileType()
    {
        return fileType;
    }
    
    /**
     * The setfileType method stores a value in the file type field
     * 
     * @param enterfileType the value to store in file type
     */
    public void setfileType(String enterfileType)
    {
        fileType = enterfileType;
    }
    
    /**
     * The toString method returns a string representing the state of an ElectronicBook object.
     * 
     * @return A string containing the Item information: itemID, title, genre, file type, target audience, available, author, ISBN
     */
    public String toString ()
    {
        //create a string representing the object
        String output = super.toString() + "File type: " + fileType + "\n";
        
        return output;
    }
    /**
     * The equals method compares two ElectronicBook objects.  The result is true if the arguments
     * is not null and is a ElectronicBook object with the same values for all fields as this object.
     * @param it
     * @return 
     */
    @Override
    public boolean equals (Object it)
    {   
        //check that the type of parameter is electronicBook
        if (!(it instanceof ElectronicBook))
        {
        return false;                     
        }
        
        //we already know that it is of type Book, so its safe to cast
        ElectronicBook type = (ElectronicBook) it;
        
        //return true or false depending on weather, itemID, title, genre ,targetAudience, file type, available, author and ISBN have the same value.
        return super.equals(type) && fileType.equals(type.fileType); 
    }       
}