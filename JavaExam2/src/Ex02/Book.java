package Ex02;

import java.text.DecimalFormat;

public class Book {

	private int isbn;
	private String title;
	private String writer;
	private String content;
	private int price;
	
	public Book() {
		this(0, "제목 없음", "저자 없음", "컨텐츠 없음", 0);
	}
	
	public Book(int isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("000000");
		if (title.length() > 5) return df.format(isbn) + " | " + title + "\t| " + writer + " | " + content + "\t| " + price;
		else return df.format(isbn) + " | " + title + "\t\t| " + writer + " | " + content + "\t\t| " + price;
	}
	
}
