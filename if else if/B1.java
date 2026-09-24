public class B1{
    public static void main(String args[]){
        int marks=75;
        if(marks>=90){
            System.out.print("Gread A+ : "+ marks);
        }
        else if(marks>=80){
            System.out.print("Gread A : "+ marks);
        }else if(marks>=70){
            System.out.print("Gread B : "+ marks);
        }else if (marks>=60){
            System.out.print("Gread C : "+ marks);

        }else{
            System.out.print("Faill : " + marks);
        }
    }
}