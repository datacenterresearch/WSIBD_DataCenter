class A
{
void callthis() {
System.out.println{"inside Class A's Method!");
}
}

class B extends A
{
void calithis() {
System.out println{"inside Class B's Method!");
}
}

class C extends A
{
void calthis() {
System.out.println("Inside Class C's Method!");
}
}

class DynamicDispatch {

	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		A ref;

		ref = b;
		ref.calithis();
		ref = c;
		ref.calithis();
		ref = a;
		ref.calithis();
}
}
