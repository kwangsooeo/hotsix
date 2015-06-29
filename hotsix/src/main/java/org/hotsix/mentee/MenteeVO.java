package org.hotsix.mentee;

import java.util.Date;

import javax.inject.Inject;


public class MenteeVO extends MemberVO {

	private int menteeNo;
	
	private String mentoNo;
	private int memberNo;
	private String id;
	
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	@Override
	public String getEdu_level() {
		// TODO Auto-generated method stub
		return super.getEdu_level();
	}
	@Override
	public void setEdu_level(String edu_level) {
		// TODO Auto-generated method stub
		super.setEdu_level(edu_level);
	}
	@Override
	public String getMentoId() {
		// TODO Auto-generated method stub
		return super.getMentoId();
	}
	@Override
	public void setMentoId(String mentoId) {
		// TODO Auto-generated method stub
		super.setMentoId(mentoId);
	}
	
	@Override
	public String getNickname() {
		return super.getNickname();
	}
	@Override
	public void setNickname(String nickname) {
		super.setNickname(nickname);
	}
	@Override
	public String getPw() {
		return super.getPw();
	}
	@Override
	public void setPw(String pw) {
		super.setPw(pw);
	}
	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	@Override
	public String getGender() {
		return super.getGender();
	}
	@Override
	public void setGender(String gender) {
		super.setGender(gender);
	}
	@Override
	public String getBirth() {
		return super.getBirth();
	}
	@Override
	public void setBirth(String birth) {
		super.setBirth(birth);
	}
	@Override
	public String getLocation() {
		return super.getLocation();
	}
	@Override
	public void setLocation(String location) {
		super.setLocation(location);
	}
	@Override
	public String getComment() {
		return super.getComment();
	}
	@Override
	public void setComment(String comment) {
		super.setComment(comment);
	}
	@Override
	public Date getRegdate() {
		return super.getRegdate();
	}
	@Override
	public void setRegdate(Date regdate) {
		super.setRegdate(regdate);
	}
	@Override
	public Date getLogdate() {
		return super.getLogdate();
	}
	@Override
	public void setLogdate(Date logdate) {
		super.setLogdate(logdate);
	}
	@Override
	public byte[] getProfileimg() {
		return super.getProfileimg();
	}
	@Override
	public void setProfileimg(byte[] profileimg) {
		super.setProfileimg(profileimg);
	}
	public int getMenteeNo() {
		return menteeNo;
	}
	public void setMenteeNo(int menteeNo) {
		this.menteeNo = menteeNo;
	}
	
	public String getMentoNo() {
		return mentoNo;
	}
	public void setMentoNo(String mentoNo) {
		this.mentoNo = mentoNo;
	}
	
	
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	@Override
	public String toString() {
		return "MenteeVO [menteeNo=" + menteeNo + ", edu_level=" + ", MentoNo=" + mentoNo + "]";
	}
	
	
	
	

	
}
