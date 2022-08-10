/*
 * member는 static에 연결할 수 있으나,
 * static은 member에 연결할 수 없다. 연결하려면 
 * 주소를 이용해서 member에 연결할 수 있다.
 */
public class StaticInnerClassDemo {
	public static void main(String[] args) {
	OuterClass1 out = new OuterClass1();//바깥 클래스의 참조변수
	OuterClass1.InnerClass1 inner = out.new InnerClass1();
	System.out.println(inner.avg);
	inner.show();
	}
}
