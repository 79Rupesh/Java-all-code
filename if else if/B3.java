public class B3 {
    public static void main(String args[]){
        double weith=77;
        double height=1.78;
        double bmi=weith/(height*height);
        if(bmi<18.5){
            System.out.print("Underweight");
        }else if(bmi<24.5 && bmi>=18.5){
            System.out.print("normal");
        }else if(bmi<30 && bmi>=24.5){
            System.out.print("overweight");
        }else{
            System.out.print("obesity");
        }
    
    }
    
}
