package scrumtool.sprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EffortSpent {
	private Date Date;
	public Integer EffortConsumed;
	public List<Comments> Comments;
	
	public EffortSpent(){
		Comments = new ArrayList<Comments>();
		Date = new Date();
	}
	public Date getDate(){
		return Date;
	}
}
