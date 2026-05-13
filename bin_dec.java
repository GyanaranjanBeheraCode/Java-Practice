package MOCK.numbRP;

public class bin_dec {
    public static void main(String[] args) {
          int bin=1100;
          int dec=0;
          int pow=1;

          while(bin>0){
              int d=bin%10;
              dec +=d*pow;
              pow*=2;
              bin/=10;
          }
        System.out.println(dec);
    }
}
