import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner get  = new Scanner(System.in);
		int[] mylist = {1,1};
		int temp;
		System.out.println("Enter len for fibonanci list");
		int round = get.nextInt();
		for(int i = 1;i<=round;i++){
			temp = mylist[0]+mylist[1];
			System.out.print(temp+"		");
			mylist[0] = mylist[1];
			mylist[1] = temp;
		}
	}
}