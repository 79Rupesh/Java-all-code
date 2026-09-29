// Student Result Analyzerpublic class A16 
public static void main(String args[]) {
    int marks = 88;
    if (marks > 85) {
        System.out.println(" Distinction :" + marks);
    } else if (marks < 85 && marks >= 75) {
        System.out.println("Frist class : " + marks);

    } else if (marks < 75 && marks >= 65) {
        System.out.println("second  class : " + marks);
    } else if (marks < 65 && marks >= 55) {
        System.out.println("trith  class : " + marks);
    } else if (marks < 55 && marks >= 45) {
        System.out.println("pass : " + marks);
    } else {
        System.out.println("Faill");
    }

}
