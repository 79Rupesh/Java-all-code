package for_loop;

public class f6 {
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n=6;
        while(n>0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
    
}
