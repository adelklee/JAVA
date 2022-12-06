
public class Add extends Calculate {
	public Add(int a, int b) {
		super(a, b);
    }

    @Override
    public int calculate() {
        return super.a + super.b;
    }
}
