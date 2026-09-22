import java.util.Scanner;
public class R7 {
    public static void main(String [] args){
        Scanner Rupesh=new Scanner(System.in);
        System.out.print("Enter your charecter ");

        char ch = Rupesh.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
            System.out.print("charecter is vowel = "+ch);
        }
        else{
            System.out.print("Charecter is the consunet = "+ch);
        }
        Rupesh.close();
    }
}