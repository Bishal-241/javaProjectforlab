class SingleInheritance extends Rectangle{
	public static void main(String[] args) {
		SingleInheritance example = new SingleInheritance();
		example.Area();

	}
}
class Rectangle{
	int length = 10;
	int bredth = 5;

	void Area(){
		System.out.println("Area is"+(length*bredth));
	}
	
}
