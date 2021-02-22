package patterns;

public class Singleton {

	public static void main(String[] args) {

		A.getinstance();

	}
}

class A {

	// object will be created if it s required or not so will go for lazy
	// initilization
	// static A obj = new A();
	static A obj;

	private A() {

		System.out.println("Instance created");
	}

	// To avoid multiple threads accessing getinstance method at same time
	public synchronized static A getinstance() {

		// Lazy initlization , object is created only when its required.
		if (obj == null) {

			obj = new A();

		}
		return obj;

	}

	// Synchronized : Some time will be lost so going for Double Checked locking.
	public static A getInstance1() {

		if (obj == null) {
			
			synchronized(A.class) {
				if (obj == null) {
					obj = new A();
				}
			}

		}
		return obj;

	}

}