/*
A
B C
C D E
D E F G
E F G H I
*/

/*
public class p9 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            char ch = (char) +('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

}
*/

public class p9{
    public static void main(String args[]){
        int n=4;
        int i=1;
        while(i<=n){
            char ch = (char)('A'+i-1);
            int j=1;
            while(j<=i){
                System.out.print(ch+" ");
                ch=(char)(ch+1);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}