import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = get.nextInt();
        int numberTocheckAtLast = num;
        int len = 0,temp = 0;
        while(true){    //to get number-ofdigits 
            if(num>0){
                num = num /10;
                len = len +1;
            }
            else{
                break;
            }
        }
        num = numberTocheckAtLast;
        for(int i = 0;i<len;i++){   //main process  
              int currentNumber = num%10;
            temp = temp + (currentNumber * currentNumber*currentNumber);
            System.out.println("value of temp at this moment currentNumber :"+temp+"  "+currentNumber);
            num = num/10;
        }
        if(temp == numberTocheckAtLast){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Len of number = "+len);
            System.out.println("number = "+numberTocheckAtLast);
            System.out.println("temp = "+temp);
        }

    }
}