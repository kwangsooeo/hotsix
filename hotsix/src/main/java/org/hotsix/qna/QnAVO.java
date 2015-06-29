package org.hotsix.qna;

import java.sql.Date;

public class QnAVO {
	private int qnaNo;
	private int memberNo;
	private String title;
	private String contents;
	private Date regdate;
	private String qna_type;
	private int qna_status;
	private int parents;
	private String depth;

	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getQna_type() {
		return qna_type;
	}
	public void setQna_type(String qna_type) {
		this.qna_type = qna_type;
	}
	public int getQna_status() {
		return qna_status;
	}
	public void setQna_status(int qna_status) {
		this.qna_status = qna_status;
	}
	public int getParents() {
		return parents;
	}
	public void setParents(int parents) {
		this.parents = parents;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "QnAVO [qnaNo=" + qnaNo + ", memberNo=" + memberNo + ", title="
				+ title + ", contents=" + contents + ", regdate=" + regdate
				+ ", qna_type=" + qna_type + ", qna_status=" + qna_status
				+ ", parents=" + parents + ", depth=" + depth + "]";
	}
	
	
}
