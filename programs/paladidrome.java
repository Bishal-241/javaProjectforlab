import java.util.Scanner;


class paladidrome{
	public static void main(String[] args) {
		int reversed = 0;
		Scanner get = new  Scanner(System.in);
		System.out.println("Enter a number");
		int num  = get.nextInt();
		int numForTest = num;
		while(num>0){
			int temp = num%10;
			reversed = reversed*10+temp;
			num = num/10;
		}
		if(numForTest == reversed){
			System.out.println("Paladidrome");
		}
		else{
			System.out.println("NOt paladidrome");
			System.out.println(numForTest+"  "+reversed);
		}
	}
}