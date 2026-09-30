//  Print even factorials from 1 to N📥
//  Input: 6 → Output: factorials of 2, 4, 6

package for_loop;

public class f13 {
    public static void main(String args[]){
        int n=6;
        for(int i=1;n>=i;i++){
            if(i%2==0){
                int fact=1;
                for(int j=1;j<=i;j++){
                    fact=fact*j;
                    
                }
                System.out.println("factorial : "+fact);
            }
        }
    }
    
}
