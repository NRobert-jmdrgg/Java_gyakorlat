package zene;

public class Hanglemez {
	private String author;
	private String title;
	private int    length;
	
	public Hanglemez(String author, String title, int length) {
		super();
		this.author = author;
		this.title = title;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Hanglemez [author=" + author + ", title=" + title + ", length=" + length + "]";
	}
	
	public int longerThan(Hanglemez a) {
		if (this.length > a.length) {
			return 1;
		} else if (this.length < a.length) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public boolean isAuthor(String a) {
		return this.author.equalsIgnoreCase(a);
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	
}
