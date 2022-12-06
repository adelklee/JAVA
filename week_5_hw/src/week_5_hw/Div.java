package week_5_hw;

public class Div {
	private int a1, a2;

    public Div() {}

    public void setValue(int a1, int a2)
    {
        this.a1 = a1;
        this.a2 = a2;
    }

    public double calculate()
    {
        return this.a1 / (double)this.a2;
    }
}
