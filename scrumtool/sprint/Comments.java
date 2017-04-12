package scrumtool.sprint;

import java.util.Date;
public class Comments {
	private String _userId;
	public String Description;
	private Date Date;
	public Comments(){
		Date = new Date();
	}
	public Date getDate(){
		return Date;
	}
}
