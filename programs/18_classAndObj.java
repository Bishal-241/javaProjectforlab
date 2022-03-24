
class Main{
	public static void main(String[] args) {
		int l = 10;
		int b = 5;
		Rectangle rect1 = new Rectangle();
		rect1.getData(12,3);
		rect1.Area();
		rect1.Perimeter();

	}
}

class Rectangle{
	int length;
	int bredth;

	void Rectangle(){
		System.out.println("Initilized");
	}
	void getData(int l,int b){
		length = l;
		bredth = b;
	}
	void Area(){
		System.out.println("Area is"+(length*bredth));
	}
	void Perimeter(){
		int peri ;
		peri = 2*(length+bredth);
		System.out.println("Perimeter is "+peri);
	}
}
