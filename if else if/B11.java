public class B11 {
    public static void main(String args []){
        int paisa = 5000900;
        double tax;
        if(paisa<=500000){
            System.out.println("no tax "+ paisa);
        }else {
            tax=paisa*0.20;
                System.out.println("20 % tax : "+tax);
        }
    }
    
}
