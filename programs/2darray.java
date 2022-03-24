import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int i,j;
		System.out.println("Enter len of arr(i,j)");
		i = get.nextInt();
		j = get.nextInt();
		int [][] myarr = new int[i][j];

		for(int l = 0;l<i;l++){
			for(int k = 0;k<j;k++){
				System.out.println("Enter ("+l+","+k+")th value");
				myarr[l][k] = get.nextInt();
			}
		}
		for(int l = 0;l<i;l++){
			for(int k = 0;k<j;k++){
				System.out.print(myarr[l][k]+"	");
			}
			System.out.println("");
		}
	}
}