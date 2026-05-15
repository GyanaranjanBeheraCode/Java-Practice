package MOCK.numbRP;
//alternative strong number in range
public class Alternative_Strongnum {
    public static void main(String[] args) {
        int st = 1;
        int end = 1000;
        int count = 0;

        for (int n = st; n <= end; n++) {
            if (isStrong(n)) {
                count++;

                if (count % 2 == 1) //print alternative
                    System.out.println(n);
                
            }
        }
    }
   static boolean isStrong(int n){
       int temp=n;
       int sum=0;
       while(temp>0){
           int digit=temp%10;

           int fact=1;
           for(int i=1;i<=digit;i++){
               fact*=i;
           }
           sum+=fact;
           temp/=10;
       }
       return sum==n;
   }
}
