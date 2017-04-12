package scrumtool.sprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint {
	private String _id;
	public String _userId;
	public String SprintName;
	public String SprintVersion;
	public String EffortUnit;
	public Integer HoursInOneDay;
	public String Status;
	public String StartDate;
	public String EndDate;
	public List<AssignedUsers> AssignedUsers;
	public List<Backlogs> Backlogs;
	
	public Sprint(){
		AssignedUsers = new ArrayList<AssignedUsers>();
		Backlogs = new ArrayList<Backlogs>();
	}
	
	public String getId(){
		return _id;
	}
}
