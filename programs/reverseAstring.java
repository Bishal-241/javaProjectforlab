import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a string");
		String myString = get.nextLine();
		int len = myString.length();
		int i;
		String reversedString = "";
		for(i = len-1;i>=0;i--){
			reversedString = reversedString+myString.charAt(i);
		}
		System.out.println("String : "+myString+" reversedString: "+reversedString);
	}
}