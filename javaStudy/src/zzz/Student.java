package zzz;

public class Student {
	private int stdId;
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private int stdScore;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public int getStdScore() {
		return stdScore;
	}
	public void setStdScore(int stdScore) {
		this.stdScore = stdScore;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdPhone=" + stdPhone
				+ ", stdScore=" + stdScore + "]";
	}
}
