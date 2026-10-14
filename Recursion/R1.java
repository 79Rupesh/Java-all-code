// Print numbers from 1 to N using recursion.
public class R1{

    public static void number(int n){
        if(n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        number(5);

    }
}