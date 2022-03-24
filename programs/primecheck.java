import java.util.Scanner;

class primecheck{
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = get.nextInt();
		for(int i = 2;i<num;i++){
			if (num %i == 0){
				System.out.println("Not prime");
				break;

			}
			else{
				if (i==(num-1)){
					System.out.println("Prime number");
				}

			}
		}
	}
}