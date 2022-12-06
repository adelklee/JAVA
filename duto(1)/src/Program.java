/*	
public class Program {

	public static void main(String[] args) {
		System.out.println("HelloWorld");

	}

}
*/

/*
static class A{
	private static int i1;
	public static void main() {
		C a, b, c; // class C의 각 객체가 만들어짐
	} // a = new C()(동적할당)로 초기화 or a=new C(i)초기화
}
	
static class B{
	public static int i2(){
		return 3;
	}
	public static int i5;
} // B a, b, c; a.i5 = 5하면 b.i5 = 5가 됨.

class C{
	public int i3(){
		return i4;
	}
	public int i4;
	public C(int i) {
		i4 = i;
	}
}
*/

// class는 일종의 트리
// int i = int[] is = {4,5,6} b.i5=5
//               is = new int[i]

class Cycle{
	private int maximum;
	private int value;
	private Cycle next;
	public Cycle(int m, int v, Cycle n) {
		maximum = m;
		value = v;
		next = n;
	}
	public void count() {
		value++;
		if(value == maximum) {
			next.value++;
			value = 0;
		}
	}
	public int get() {
		return value;
	}
	public static void main(String[] args){
		Cycle d = new Cycle(9999,0,null),
				h = new Cycle(24,0,d),
				m = new Cycle(60,0,h),
				s = new Cycle(60,0,m);
		while(true) {
			s.count();
			System.out.println(d.get()+":"+h.get()+":"+m.get()+":"+s.get());
		}
	}
}

