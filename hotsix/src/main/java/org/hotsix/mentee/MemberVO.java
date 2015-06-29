package org.hotsix.mentee;

import java.util.Arrays;
import java.util.Date;

public class MemberVO {

	private int memberNo;
	private String id;
	private String mentoId;
	private String nickname;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String location;
	private String comment;
	private Date regdate;
	private Date logdate;
	private byte[] profileimg;
	private String edu_level;
	
	
	public String getEdu_level() {
		return edu_level;
	}
	public void setEdu_level(String edu_level) {
		this.edu_level = edu_level;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMentoId() {
		return mentoId;
	}
	public void setMentoId(String mentoId) {
		this.mentoId = mentoId;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getLogdate() {
		return logdate;
	}
	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}
	public byte[] getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(byte[] profileimg) {
		this.profileimg = profileimg;
	}
	

	@Override
	public String toString() {
		return "MemberVO [memberNo=" + memberNo + ", id=" + " nickname="
				+ nickname + ", pw=" + pw + ", name=" + name + ", gender="
				+ gender + ", birth=" + birth + ", location=" + location
				+ ", comment=" + comment + ", regdate=" + regdate
				+ ", logdate=" + logdate + ", profileimg="
				+ Arrays.toString(profileimg) + "]";
	}
	
	
}
