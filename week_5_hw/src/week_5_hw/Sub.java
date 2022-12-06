package week_5_hw;

public class Sub {
	private int a1, a2;

    public Sub() {}

    public void setValue(int a1, int a2)
    {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int calculate()
    {
        return this.a1 - this.a2;
    }   
}
