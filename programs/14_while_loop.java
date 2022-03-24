import java.util.Scanner;
class whileLoop{
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a number");
		int a;
		a = get.nextInt();
		while(a>1){
			System.out.println("THe value of a is "+a+" now and decreasing for 1");
			a-=1;
		}
	}
}