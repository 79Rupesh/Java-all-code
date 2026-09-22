public class R8 {
    public static void main(String args[]){
        int a=-9;
        if(a<0){
            a=-a;
            System.out.print("absolute value : "+a);
        }else{
            System.out.print("not absolute value : "+a);
        }

    }
}
