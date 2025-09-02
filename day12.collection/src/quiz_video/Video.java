package quiz_video;

import java.time.LocalDate;

public class Video {
	private int no,nocnt = 1;
	private String title, category, lendName;
	private boolean lend;
	private LocalDate lendDate;
	public Video(){ }
	public Video(String title, String category, String lendName) {
		this.no = nocnt++;
		this.title = title;
		this.category = category;
		this.lendName = lendName;
		this.lend = false;
		this.lendDate = LocalDate.now();
	}
	@Override
	public String toString() {
		
		return "비디오 번호 : "+ no + " 비디오 제목 : " + title + " 비디오 장르 : " + category + 
					" 비디오 대여 여부(빌린사람) : " + lend + lendName + " 대여일자 : " + lendDate;
		}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public LocalDate getLendDate() {
		return lendDate;
	}
	public void setLendDate(LocalDate lendDate) {
		this.lendDate = lendDate;
	}
	public boolean isLend() {
		return lend;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}
	
}