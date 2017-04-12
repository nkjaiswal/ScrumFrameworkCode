package scrumtool.sprint;

import java.util.Date;

public class SprintSummary {
	private String _id;
	public String getId() {
		return _id;
	}
	public String SprintName;
	public String SprintVersion;
	public String EffortUnit;
	public int HoursInOneDay;
	private String _userId;
	public String Status;
	public String StartDate;
	public String EndDate;
	public int count_AssignedUsers;
	public int count_Backlogs;
}
