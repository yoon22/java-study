package db.board2;
//이러한 클래스를 ntt vo dto   alt+g // alt+t
public class BoardInfoVO {
	private Integer biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCreTim;
	private Integer biCnt;
	private String biIsactive;
	private int uiNum;
	private String uiName;
	public int getUiNum() {
		return uiNum;
	}
	public void setUiNum(int uiNum) {
		this.uiNum = uiNum;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	
	
	@Override
	public String toString() {
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCreTim=" + biCreTim + ", biCnt=" + biCnt + ", biIsactive=" + biIsactive + ", uiNum="
				+ uiNum + ", uiName=" + uiName + "]";
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
	public String getBiCredat() {
		return biCredat;
	}
	public void setBiCredat(String biCredat) {
		this.biCredat = biCredat;
	}
	public String getBiCreTim() {
		return biCreTim;
	}
	public void setBiCreTim(String biCreTim) {
		this.biCreTim = biCreTim;
	}
	public Integer getBiCnt() {
		return biCnt;
	}
	public void setBiCnt(Integer biCnt) {
		this.biCnt = biCnt;
	}
	public String getBiIsactive() {
		return biIsactive;
	}
	public void setBiIsactive(String biIsactive) {
		this.biIsactive = biIsactive;
	}
	
}