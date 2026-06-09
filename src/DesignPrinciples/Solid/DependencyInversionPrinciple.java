package DesignPrinciples.Solid;
import java.util.*;

interface IVersionControl{
	void commit(String message);
	void push();
	void pull();
}

class GitVersionControl implements IVersionControl{
	@ Override
	public void commit(String message) {
		System.out.println("Commiting changes to Git with message : "+message);
	}
	
	@ Override
	public void push() {
		System.out.println("Pushing changes to remote Git repository");
	}
	
	@ Override
	public void pull() {
		System.out.println("Pulling changes from remote Git repository");
	}
}

class DevelopmentTeam{
	private IVersionControl versionControl;
	
	public DevelopmentTeam(IVersionControl vc) {
		this.versionControl = vc;
	}
	
	public void makeCommit(String message) {
		versionControl.commit(message);
	}
	public void performPush() {
		versionControl.push();
	}
	public void performPull() {
		versionControl.pull();
	}
}
class DependencyInversionPrinciple{
	public static void main(String[] args) {
		GitVersionControl git = new GitVersionControl();
		DevelopmentTeam team = new DevelopmentTeam(git);
		
		team.makeCommit("Initial commit");
		team.performPush();
		team.performPull();
	}
}