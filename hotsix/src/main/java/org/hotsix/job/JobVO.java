package org.hotsix.job;

public class JobVO {
	private int jobNo;
	private String jobName;
	private int parent;
	private String depth;
	
	private int realParent;
	private String realDepth;
	
	public int getRealParent() {
		return realParent;
	}
	public void setRealParent(int realParent) {
		this.realParent = realParent;
	}
	public String getRealDepth() {
		return realDepth;
	}
	public void setRealDepth(String realDepth) {
		this.realDepth = realDepth;
	}
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "JobVO [jobNo=" + jobNo + ", jobName=" + jobName + ", parent="
				+ parent + ", depth=" + depth + ", realParent=" + realParent
				+ ", realDepth=" + realDepth + "]";
	}
}