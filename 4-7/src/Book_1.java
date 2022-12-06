class Book_1
{
	private String title;
	private String author;
	
	public Book_1(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	public Book_1(String title)
	{
		this(title, "작자미상");
	}
	
	public Book_1()
	{
		this("", "");
	}
	
	public void show()
	{
		System.out.println("제목은 "+this.title + "이고, " + "작자는 "+this.author+"이다.");
	}
}