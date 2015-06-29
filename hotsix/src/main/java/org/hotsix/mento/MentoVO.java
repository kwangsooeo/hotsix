package org.hotsix.mento;

import java.util.Date;

public class MentoVO extends MemberVO{
	
	private int mentoNo;
	private int memberNo;
	private String career;
	private boolean status;
	private String id;
	

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	@Override
	public String getMenteeId() {
		// TODO Auto-generated method stub
		return super.getMenteeId();
	}

	@Override
	public void setMenteeId(String menteeId) {
		// TODO Auto-generated method stub
		super.setMenteeId(menteeId);
	}

	@Override
	public String getNickname() {
		// TODO Auto-generated method stub
		return super.getNickname();
	}
	@Override
	public void setNickname(String nickname) {
		// TODO Auto-generated method stub
		super.setNickname(nickname);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation();
	}
	@Override
	public void setLocation(String location) {
		// TODO Auto-generated method stub
		super.setLocation(location);
	}
	@Override
	public Date getRegdate() {
		// TODO Auto-generated method stub
		return super.getRegdate();
	}
	@Override
	public void setRegdate(Date regdate) {
		// TODO Auto-generated method stub
		super.setRegdate(regdate);
	}
	@Override
	public Date getLogdate() {
		// TODO Auto-generated method stub
		return super.getLogdate();
	}
	@Override
	public void setLogdate(Date logdate) {
		// TODO Auto-generated method stub
		super.setLogdate(logdate);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getMentoNo() {
		return mentoNo;
	}
	public void setMentoNo(int mentoNo) {
		this.mentoNo = mentoNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getCareer() {
		return career;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

}
