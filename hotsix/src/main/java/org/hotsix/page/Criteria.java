package org.hotsix.page;


public class Criteria {

	private int page = 1;
	private int perPageNum = 10;
	private int displayPageNum = 10;
	private int nextPage;
	
	private int qnaNo;
	private int mentoNo;
	private int NoticeNo;
	
	private int parent;
	private String searchType;
	private String keyword;
	
	
	public int getNoticeNo() {
		return NoticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		NoticeNo = noticeNo;
	}
	public int getMentoNo() {
		return mentoNo;
	}
	public void setMentoNo(int mentoNo) {
		this.mentoNo = mentoNo;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Criteria setPage(int page) {
		this.page = page;
		this.nextPage = (page-1)*10; 
		return this;
	}
	public int getPage() {
		return page;
	}
	public int getPageStart(){
		return (this.page-1)* perPageNum;
	}
	public int getPerPageNum() {
		return perPageNum;
	} 
	public Criteria setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
		return this;
	}
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	public Criteria setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
		return this;
	}
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum
				+ ", displayPageNum=" + displayPageNum + ", nextPage="
				+ nextPage + ", searchType=" + searchType + ", keyword="
				+ keyword + "]";
	}
	
}
