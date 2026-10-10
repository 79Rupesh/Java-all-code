// check is number armstrong .

public class ss16 {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int n = 0;
        while (temp > 0) {
            int a = temp % 10;
            n = n + (a * a * a);
            temp = temp / 10;

        }
        if(num==n){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong ");
        }
    }

}
