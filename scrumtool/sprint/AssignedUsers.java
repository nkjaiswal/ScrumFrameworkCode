package scrumtool.sprint;

import java.util.ArrayList;
import java.util.List;

public class AssignedUsers {
	public String userId;
	public List<String> roles;
	public Integer EffortAvailable;
	
	public AssignedUsers(){
		roles = new ArrayList<String>();
	}
}
