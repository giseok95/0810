/*
 * 1.생성방법
 *  -지역클래스가 속해 있는 메소드가 호출되어야 하고,
 *  -해당 메소드내에서 클래스 선언이 먼저, 그 다음 생성자로 생성
 * 2.제한사항
 *  1)접근제한자(Access Modifier)를 사용할 수 없다.
 *  2)static 사용불가
 *  3)static 변수/static 메소드를 가질 수 없다.
 */
public class OuterClass2 {
	private String name = "한지민";//outerclass member variable
	private static int age=26;//outerclass static variable
	public void display() {//outerclass member method
		
	}
	public static void print() {//outerclass static variable
		
	}
	public void mymethod() {
		boolean flag =true;//local variable
		class InnerClass2{ //inner class		
			private double avg=89.5; //inner class member variable
		//  private static char grade ='C';//inner class static variable
			public void repair() {//inner class member method
				//System.out.println("나는 로컬 이너클래스의 멤버 메소드");
				System.out.println("name="+name);
				System.out.println("나이="+age);
				System.out.println("flag="+flag);
				
			}
		//	public static void sort() {};//inner class static method
		}
		InnerClass2 inner = new InnerClass2();
		System.out.println(inner.avg);
		inner.repair();
	}
}
