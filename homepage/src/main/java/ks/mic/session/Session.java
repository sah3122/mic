package ks.mic.session;

public class Session {
	private String memberId;
	private String memberName;
	private String memberEmail;
	private String memberAdmin;
	
	public String getMemberAdmin() {
		return memberAdmin;
	}
	public void setMemberAdmin(String memberAdmin) {
		this.memberAdmin = memberAdmin;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
}
