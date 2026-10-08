// Check if number is palindrome
//  Input: 121 → Output: Palindrome
package do_while_loop;
public class d5 {
    public static void main(String args[]){
        int num=121;
        int temp=num;
        int a=0;
        int rev=0;

        do{
            a=num%10;

            rev=rev*10+a;
            num=num/10;

        }while(num>0);
        if(rev==temp){
            System.out.println("palindrom number");
        }else{
            System.out.println("not palindrom number");
        }
    }
    
}
