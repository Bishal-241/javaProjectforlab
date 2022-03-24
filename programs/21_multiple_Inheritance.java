class Multiple_Inheritance extends B,A{ 
	public static void main(String[] args) {
		Multiple_Inheritance example = new Multiple_Inheritance();
		example.x();
		example.y();
	}
}
class B{
	void x(){
		System.out.println("Hello world by B");
	}
}
class A{
	void y(){
		System.out.println("Hello world by A");
	}
}


// sorry sorry sorry java doesn't support's multiple inheritance