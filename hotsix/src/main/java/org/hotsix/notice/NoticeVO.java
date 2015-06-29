package org.hotsix.notice;

import java.util.Date;

public class NoticeVO {

		private int noticeNo;
		private int viewCnt;
		private String title;
		private String filename;
		private String contents;
		private Date regdate;
		
		
		public int getNoticeNo() {
			return noticeNo;
		}
		public void setNoticeNo(int noticeNo) {
			this.noticeNo = noticeNo;
		}
		public int getViewCnt() {
			return viewCnt;
		}
		public void setViewCnt(int viewCnt) {
			this.viewCnt = viewCnt;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getFilename() {
			return filename;
		}
		public void setFilename(String filename) {
			this.filename = filename;
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
		
		@Override
		public String toString() {
			return "NoticeVO [noticeNo=" + noticeNo + ", viewCnt=" + viewCnt
					+ ", title=" + title + ", filename=" + filename
					+ ", contents=" + contents + ", regdate=" + regdate + "]";
		}
		
		
		
		
		
		
	
}
