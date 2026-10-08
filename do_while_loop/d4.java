//4. Count digits in a number
 //  Input: 9876 → Output: 4
package do_while_loop;

public class d4 {
    public static void main(String[] args) {
        int num=1234785;
        int count=0;
        do{
            num=num/10;
            count++;
        }while(num>0);
        System.out.println(count);
    }
    
}
