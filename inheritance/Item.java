/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 This is a class that represent a general item
 */
public abstract class Item 
{
    //PRIVATE instance variables
    private int itemID;
    private String title;
    private String genre;
    private String targetAudience;
    private boolean available;
    
    /**
    //this constructor initializes the fields to the passed values 
    * @param startItem item's initial ID
    * @param startTitle item's initial Tite
    * @param startGenre item's initial genre
    * @param startAudience item's initial audience
    * @param startAvailable item's initial available
    */ 
    public Item(int startItem, String startTitle, String startGenre, String startAudience, boolean startAvailable)
    {
        itemID = startItem;
        title = startTitle;
        genre = startGenre;
        targetAudience = startAudience;
        available = startAvailable;
    
    }
    
    /**
     * this is a copy constructor.  It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param itemObject the object being copied
     */
     
    public Item (Item itemObject)
    {
        if (itemObject != null)
        {
            itemID = itemObject.itemID;
            title = itemObject.title;
            genre = itemObject.genre;
            targetAudience = itemObject.targetAudience;
            available = itemObject.available;        
        }
    }
    /**
     * The getItemID method returns an item object's ID
     * 
     * @return the value in the itemID field
     */
    public int getItemID()
    {
        return itemID;    
    }
    
    /**
     * The getTitle method returns an item object's title.
     * 
     * @return the value in the title field
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * The getGenre method returns an item object's genre
     * 
     * @return the value in the genre field. 
     */
    
    public String getGenre()
    {
        return genre;
    }
    /**
     * The getAudience method returns an item object object's Audience.
     * 
     * @return the value in the targetAudience field.
     */
    
    public String getAudience()
    {
        return targetAudience;    
    }
    
    /**
     * The getAvailable method returns an item object's available.
     * 
     * @return the value in the available field.
     */
    public boolean getAvailable()
    {
        return available;
    }
    
    /**
     * The setItem method stores a value in the itemID field.
     * 
     * @param newitemID the value store in itemID.
     */   
    public void setItem(int newitemID)
    {
    itemID = newitemID;
    }
    
    /**
     * The setTitle method stores a value in the title field
     * 
     * @param newTitle the value to store in title
     */
    public void setTitle(String newTitle)
    {
    title = newTitle;
    }
    
    /**
     * The setGenre method stores a value in the genre field.
     * 
     * @param newGenre the value to store in genre
     */
    public void setGenre(String newGenre)
    {
        genre = newGenre;
    }
    
    /**
     * The setAudience method stores a value in the targetAudience field
     * 
     * @param newAudience the value to store in Audience
     */
    public void setAudience(String newAudience)
    {
        targetAudience = newAudience;
    }
    
    /**
     * The toString method returns a string representing the state of an item object.
     * 
     * @return A string containing the item information: itemID, title, genre, audience.
     */
    
    @Override
    public String toString()
    {
        String output = "Item: " + itemID + "\n" 
                + "Title: " + title + "\n" + "Genre: " + genre + "\n"
                + "Audience: " + targetAudience + "\n"; 
        
        return output;
    }
    
    /**
     * The equals method compares two item objects.  The results is true if the argument is not 
     * null and is an item object with the same values for all fields as this object.
     * 
     * @param it the object witch which to compare the calling object.
     * @return true if the given object has the same value for all fields
     */
    public boolean equals (Object it)
    {
        //check that the type of the parameter is Item
        if (!(it instanceof Item))
        {
        return false;
        }
        
        //we alreade know that it is of type Item, so its safe to cast
        Item thing = (Item) it;
        
        //return true or false depending on weather title, genre and targetAudience have the same value
        return title.equals(thing.title) && genre.equals(thing.genre) && targetAudience.equals(thing.targetAudience);
    }
   
}
