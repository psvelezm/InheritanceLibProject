/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;



/**
 *
 * @author dyd
 */
public class Request {
    private int itemID;
	private String requestDate;
	private String dueDate;
	private String status;
	public request(int itemID,String requestDate, String dueDate,String status )
	{
		this.itemID=itemID;
		this.requestDate=requestDate;
		this.dueDate=dueDate;
		this.status=status;
	}
	
	public int getItemID()
	{
		return itemID;
	}
	
	public String getrequestDate()
	{
		return requestDate;
	}
	
	public String getdueDate()
	{
		return dueDate;
	}
	
	public String status()
	{
		return status();
	}
	
	public void setitemID(int setitemID)
	{
		this.itemID=itemID;
	}
	
	public void setdueDate(String dueDate)
	{
		this.dueDate=dueDate;
	}
	
	public void setrequestDate(String requestDate)
	{
		this.requestDate=requestDate;
	}
	
	public void setstatus(String status)
	{
		this.status=status;
	}
	
}

