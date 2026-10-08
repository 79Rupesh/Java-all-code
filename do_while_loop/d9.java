package do_while_loop;

public class d9 {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        int i=1;
        do{
            fact=fact*i;
            i++;
        }while(num>=i);
        System.out.println("factorial :  "+fact);
    }
    
}
