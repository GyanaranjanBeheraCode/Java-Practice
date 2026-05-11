package MOCK.numbRP;

public class automorphicRN {
    public static void main(String[] args) {
        int num=25;
        int sq=num*num;
      if(isAutomorpic(num,sq))
          System.out.println("automorphic");
      else
          System.out.println("not an automorphic");


    }
    static boolean isAutomorpic(int num,int sq){
        if(num==0)
            return true;

        if(num%10 != sq%10)
            return false;
        return isAutomorpic(num/10,sq/10);
    }
}
