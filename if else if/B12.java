public class B12 {
    public static void main(String args []){
        int a=3;
        int b=3;
        int c=3;
        if(a==b && b==c){
            System.out.println(" Equilateral triagle hai ");
        }else if(a==b || b==c || a==c){
            System.out.println("Isosceles Triangle hai");
        }else {
            System.out.println("Scalens Triangle hai");
        }
    }
    
}
