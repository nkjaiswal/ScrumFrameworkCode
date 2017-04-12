package scrumtool.sprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import scrumtool.Reusable;

public class Backlogs {
	public Integer BacklogId;
	private String _date;
	public String Description;
	public String Status;
	public Integer EffortEstimated;
	public List<Comments> Comments;
	public List<DeveloperAssigned> DeveloperAssigned;
	
	public Backlogs(){
		this._date = Reusable.getMongoDate(new Date());
		Comments = new ArrayList<Comments>();
		DeveloperAssigned = new ArrayList<DeveloperAssigned>();
	}
}
