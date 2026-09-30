package for_loop;
import java.util.Scanner;
public class f3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of natuaral numnber: "+sum);

    
    sc.close();
}
}
