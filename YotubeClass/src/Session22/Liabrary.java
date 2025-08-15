package Session22;

import java.util.ArrayList;
import java.util.List;

public class Liabrary {
	private List<Member> lstMembers = new ArrayList<Member>();
	
	public List<Member> getLstMembers(){
		return lstMembers;
	}
	public void setLstMembers(List<Member> lstMembers) {
		this.lstMembers = lstMembers;
	}
	
	public void addMember(Member memberObj) {
		lstMembers.add(memberObj);
	}
	public List<Member> viewAllMembers(){
		return lstMembers;
	}
	public List<Member> viewMembersByAddress(String address){
		List<Member> lstMembersLoc = new ArrayList<Member>();
		for(Member m : lstMembers) {
			if(m.getAddress().equals(address)) {
				lstMembersLoc.add(m);
			}
		}
		return lstMembersLoc;
	}
}
