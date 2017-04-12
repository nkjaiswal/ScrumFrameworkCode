import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.Date;
import java.util.List;

import scrumtool.ScrumTool;
import scrumtool.sprint.AssignedUsers;
import scrumtool.sprint.Backlogs;
import scrumtool.sprint.Comments;
import scrumtool.sprint.DeveloperAssigned;
import scrumtool.sprint.EffortSpent;
import scrumtool.sprint.Sprint;
import scrumtool.sprint.SprintSummary;
import scrumtool.sprint.User;

public class Main {
	public static void main(String args[]) {
		RestHandler rh = new RestHandler();
		ScrumTool scrumTool = ScrumTool.getInstance(rh);
		try {
//			login test
			System.out.println(scrumTool.login("admin", "admin", new Date()));
			
//			sprint handling test
			List<SprintSummary> sprints = scrumTool.getSprints();///
			List<SprintSummary> assignedSprints = scrumTool.getAssignedSprint();///
//			Comments c = new Comments();
//			c.Description = "My Test";
//			scrumTool.commentBacklog(sprints.get(0).getId(), "1", c);
//			EffortSpent ef = new EffortSpent();
//			Comments c = new Comments();
//			c.Description = "My Dev";
//			ef.Comments.add(c);
//			ef.EffortConsumed = 2;
//			
//			System.out.println(scrumTool.setEffortSpentOnBacklog(assignedSprints.get(0).getId(), "1", ef));
			Sprint sprint = scrumTool.getSprintDetails(sprints.get(0).getId());
			
//			Sprint s = new Sprint();
//			s.SprintName = "TestSprint";
//			s.SprintVersion = "1602.3";
//			s.EffortUnit = "DAY";
//			s.HoursInOneDay = 8;
//			s.Status = "OPEN";
//			s.StartDate = "2017-04-01T10:45:30.468Z";
//			s.EndDate = "2017-05-01T10:45:30.468Z";
//			
//			AssignedUsers au = new AssignedUsers();
//			au.userId = "DEV";
//			au.EffortAvailable = 10;
//			au.roles.add("DEVELOPER");
//			
//			s.AssignedUsers.add(au);
//			
//			AssignedUsers au2 = new AssignedUsers();
//			au2.userId = "D000026";
//			au2.EffortAvailable = 10;
//			au2.roles.add("DEVELOPER");
//			s.AssignedUsers.add(au2);
//			
//			Backlogs b1 = new Backlogs();
//			b1.Description = "Develop UI for Scrum Tool";
//			b1.BacklogId = 1;
//			b1.EffortEstimated = 2;
//			b1.Status = "OPEN";
//			
//			DeveloperAssigned b1da1 = new DeveloperAssigned();
//			b1da1.EffortAssigned = 2;
//			b1da1.userId = "DEV";
//			
//			b1.DeveloperAssigned.add(b1da1);
//			
//			s.Backlogs.add(b1);
//			
//			System.out.println(scrumTool.SaveSprint(s));
//			user registration test
//			User user = new User();
//			user.email = "nishant.soft04@gmail.com";
//			user.userid = "DEV";
//			user.isAdmin = false;
//			System.out.println(scrumTool.RegisterUser(user));
//			System.out.println(scrumTool.grantAdminRole(user.userid));
			
//			System.out.println(scrumTool.activateUser("USM", "18b507d491fcb45a6306987d543e0fbd7c1b81c6", "1234"));
//			System.out.println(scrumTool.activateUser("DEV", "c5599ecc7d90b584eac94da2dbd8e337be59f95d", "1234"));
			int x = 10;
			//throws ProtocolException, MalformedURLException, IOException, Exception{
		} catch (ProtocolException pe) {
			System.out.println("Error" + pe.toString());
		}catch (MalformedURLException me) {
			System.out.println("Error" + me.toString());
		}catch (IOException ie) {
			System.out.println("Error" + ie.toString());
		}catch (Exception e) {
			System.out.println("Error" + e.toString());
		}
	}
}
