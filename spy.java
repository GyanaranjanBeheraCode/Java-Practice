package MOCK.numbRP;

import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int sum=0;
        int prodt=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prodt*=d;
            n/=10;
        }
        if (sum==prodt){
            System.out.println("Spy");
        }else {
            System.out.println("Not");
        }
    }
}
