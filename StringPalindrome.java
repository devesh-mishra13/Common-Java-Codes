import java.util.Scanner;

public class stringpalin {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
    ispalindrome(number);
    }
   static void ispalindrome(int num)
   {int copy=num;
    int length=count(num);
       int s=0;
    while(num>0)
    {
        int temp=num%10;
        s=((int)Math.pow(10,length)*temp)+s;
        num/=10;
        length--;
    }
    if(s==copy)
        System.out.println("this is palindrome");
    else
        System.out.println("not a palindrome");
   }
   static int count(int num)
   {int count1=0;
       while(num>0)
       {
           count1++;
           num/=10;
       }
       return (count1-1);
   }
}

