package scrumtool.sprint;

import java.util.ArrayList;
import java.util.List;

public class DeveloperAssigned {
	public String userId;
	public Integer EffortAssigned;
	public List<EffortSpent> EffortSpent;
	
	public DeveloperAssigned(){
		EffortSpent = new ArrayList<EffortSpent>();
	}
}
