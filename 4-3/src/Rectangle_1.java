class Rectangle_1 {
	private int width;
	private int height;
	
	public Rectangle_1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public int getArea() {
		return this.width*this.height;
	}
}