package org.hotsix.contents;

import java.util.Date;

import org.hotsix.job.JobVO;

/*
 * 
 * create table tbl_contents(

     contentsNo int not null auto_increment,

     link text not null,

     regdate CURRENT_TIMESTAMP not null default NOW,

     primary key(contentsNo),

     
     )
 */


public class ContentsVO{
	
	private int jobNo;
	private int contentsNo;
	private String title;
	private String link;
	private Date regdate;
	
	public Integer getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	
	public int getContentsNo() {
		return contentsNo;
	}
	public void setContentsNo(int contetnsNo) {
		this.contentsNo = contetnsNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "ContentsVO [contetnsNo=" + contentsNo + ", title=" + title
				+ ", link=" + link + ", regdate=" + regdate + "]";
	}

	
	
	
}
