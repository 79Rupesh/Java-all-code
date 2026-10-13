public class a5 {
    public static void main(String[] args) {
        int n=153;
        int k=n;
        int temp = 0;
        int reverse = 0;
        while (n>0) {

            temp = n%10;
            reverse = reverse+(temp * temp *temp);
            n=n/10;
        }
        if(k==reverse){
            System.out.println("Armstong number");
        }else{
            System.out.println("Not Armstong number");
        }
    }
    
}
