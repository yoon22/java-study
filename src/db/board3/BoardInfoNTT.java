package db.board3;

public class BoardInfoNTT {
	private Integer biNum;
	private String biTitle;
	private String biContent;
	@Override
	public String toString() {
		return "BoardInfoNTT [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + "]";
	}
	public Integer getBiNum() {
		return biNum;
	}
	public void setBiNum(Integer biNum) {
		this.biNum = biNum;
	}
	public String getBiTitle() {
		return biTitle;
	}
	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}
	public String getBiContent() {
		return biContent;
	}
	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}

}
