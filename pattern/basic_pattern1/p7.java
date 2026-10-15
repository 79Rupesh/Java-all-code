/*

*
* *
* * *
* * * *

*//*
public class p7 {

    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

*/
public class p7{
    public static void main(String args[]){
        int n=4;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j=j+1;
            }
            System.out.println();
            i=i+1;

        }
    }
}


