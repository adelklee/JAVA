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
		this(title, "���ڹ̻�");
	}
	
	public Book_1()
	{
		this("", "");
	}
	
	public void show()
	{
		System.out.println("������ "+this.title + "�̰�, " + "���ڴ� "+this.author+"�̴�.");
	}
}