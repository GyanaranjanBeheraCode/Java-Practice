package MOCK.numbRP;

public class Dec_Bin {
    public static void main(String[] args) {
        int n=12;
        String bin="";

        while(n>0){
            bin=(n%2) + bin;
            n/=2;
        }
        System.out.println(bin);


//        int n=12;
//        int bin=0;
//        int i=1;
//        while(n>0){
//            int d=n%2;
//            bin=(d*i)+bin;
//            i*=10;
//            n/=2;
//        }
//        System.out.println(bin);
    }
}
