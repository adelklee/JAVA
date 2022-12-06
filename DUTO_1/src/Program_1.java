class A
{
	public int field;
}

class B
{
	public static int field; 
}

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA1 = new A();
		A objA2 = new A();
		
		B objB1 = new B();
		B objB2 = new B();
		
		objA1.field = 3;
		objA2.field = 5;
		
		System.out.println(objA1.field + ", " + objA2.field);
		
		objB1.field = 3;
		objB2.field = 5;
		
		System.out.println(objB1.field + ", " + objB2.field);
		// objB1.field == objB2.field == B.field
	}

}
