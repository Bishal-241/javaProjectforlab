
class C extends B{
	public void z(){
		super.y();
		System.out.println("Hello world by C");
	}
	public static void main(String[] args) {
		C example = new C();
		example.z();
	}
}

class A{
	public void x(){
		System.out.println("Hello world by A");
	}
}
class B extends A{
	public void y(){
		super.x();
		System.out.println("Hello world by B");
	}
}