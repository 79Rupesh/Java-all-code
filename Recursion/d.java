
public class d{
    public static int power(int x,int index){
        if(index==0){
            return 1;
        }
        int result = x * power(x, index-1);
        return result;
    }

    public static void main(String[] args) {
        System.out.print(power(3,4));
    }
}