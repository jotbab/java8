package sec2;

import java.util.Date;

public class Board2 {
	private int idx;
	private String title;
	private String content;
	private String author;
	private Date date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void boardWrite(int idx, String title, String content, String author, Date date){
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;
	}
	
	public void boardUpdate(int idx, String title, String content){
		if(idx == this.idx){
			
			this.title = title;
			this.content = content;
			
		}
	}
	
	public void boardDelete(int idx){
		if(idx==this.idx){
			try{
				this.finalize();
			} catch (Throwable e){
				e.printStackTrace();
			}
		}
	}
	public void boardSearch(int idx){
		if(idx==this.idx){
			System.out.println(this.idx+"\t"+this.content+"\t"+this.author+"\t"+this.date);
		}
	}
}
