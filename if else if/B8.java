public class B8 {
    public static void main(String args []){
        int unit =250;
        int bill;
        if(unit>=0 && unit <=100){
            bill = 5*unit;
            System.out.println(" 5 rupey priti unit : "+bill);

        }else if(unit>=101 && unit<200){
            bill = unit*7;
            System.out.println(" 7 repey priti unit : "+ bill);
        }else if(200<unit){
            bill = unit*10;
            System.out.println("10 repey priti unit = "+bill);
        }else{
            System.out.print("koi unit nhi hai ");
        }
    }
    
}
