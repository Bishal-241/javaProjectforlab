import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int [] myarr = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter "+i+"th term");
			myarr[i] = get.nextInt();
		}
		System.out.println("---OUTPUT----");
		for(int i = 0;i<5;i++){
			System.out.print(myarr[i]+"		");
		}
	}
}