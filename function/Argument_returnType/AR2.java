public class AR2 {
    static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        int result = maximum(3, 4);
        System.out.println("maximum value : "+result);
    }
    
}
