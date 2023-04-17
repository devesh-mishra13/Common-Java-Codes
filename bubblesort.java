import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array= ");
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <a.length-i; j++) {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for (int y :
                a) {
            System.out.print(y + " ");
        }
    }
}

