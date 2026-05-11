package String_Array.Array;

public class SecondMax {
    public static void main(String[] args) {

        int []a={1,5,13,41,21};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            } else if (a[i]>secondMax && a[i]!=max) {
                secondMax=a[i];


            }
        }
        System.out.println(max);
        System.out.println(secondMax);

    }
}
