public class ANR4 {
    static void Armstrong(int n) {
        int original = n;
        int temp = n;
        int digit = 0;
        int sum = 0;

        while (temp>0) {
            digit++;
            temp = temp/10;
            
        }
        for(int i=0;i<digit;i++){
            int digits = original%10;
            sum = sum+(digits*digits*digits);
            original = original/10;
        }

        if(n==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not Armstrong number");
        }

    }
    public static void main(String[] args) {
        Armstrong(370);
    }

}
