package prob3;

public class Book {
	private int bookNum;
	private String title;
	private String genre;
	private int stateCode;
	
	public Book(int bookNum, String title, String genre) {
		this.bookNum = bookNum;
		this.title = title;
		this.genre = genre;
		this.stateCode = 1;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {	
		System.out.printf("책 제목:%s, 장르:%s, 대여 유무:%s", this.title, this.genre, (this.stateCode == 1 ? "재고있음" : "대여중" ));
		System.out.println();
	}
}
