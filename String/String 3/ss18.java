// Calculation GCD of two number .
public class ss18 {
    public static void main(String[] args) {
        int a=15;
        int b=20;
        int GCD =0;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                GCD = i;
            }
        }
        System.out.println(GCD);
        
    }
    
}
