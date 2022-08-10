
public class AnnoymousInnerClassDemo2 {
	public static void main(String[] args) {
		Thread t =new Thread() {
		@Override
			public void run() {
			System.out.println("나는 쓰레드");
			}
		};
		t.run();
	}
}

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("나는 쓰레드");
//	}
//}
