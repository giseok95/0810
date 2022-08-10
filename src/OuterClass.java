/*
 * static Inner Class
 * 1.생성법 : OuterClass.InnerClass 참조변수 =new OuterClass.Innerclass()
 * 2.제한사항: Static Inner Class는 OuterClass의 멤버변수/메소드 접근 불가
 */
public class OuterClass {
	private String name = "한지민"; //Outer class member variable
	private static int age=26; //Outer class Static variable
	public void display() {//Outer class member method
		System.out.println("name="+this.name);
	}
	public static void print() {
		System.out.println("Age="+age);//Outer class static variable
	}
	public static class InnerClass{ //static inner class
		public double avg=89.5; // inner class member variable		
		public static boolean flag = true;//Inner class static variable
		public void show() {//Inner class member method
		//	display(); //static은 member에 연결할 수 없다
			print(); //static은 static 연결할 수 있다.
			System.out.println("나이="+age);
		//	System.out.println("이름="+name); //static은 member에 연결할 수 없다
		}
		public static void 출력하다() {//inner class static meethod
			System.out.println("나이="+age);
			//System.out.println("이름="+name);
		}
	}
	
}
