// print Fibonacci series up to N terms
//  Input: 5 → Output: 0 1 1 2 3
package do_while_loop;
public class d10 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n=5;
        int i=0;
        do{
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            i++;

        }while(n>i);
    }
    
}
