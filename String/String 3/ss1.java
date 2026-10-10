// Question: Find the Index of the First Occurrence in a String

// Tumhe do strings di gayi hain:

// haystack — main string
// needle — jis string ko search karna hai

// Tumhe needle ka haystack ke andar pehla occurrence kis index se start hota hai, wo return karna hai.

class ss1{
    public static int str(String hay,String need) {

        for(int i=0;i<= hay.length() - need.length();i++){
            int j=0;
            while(j<need.length() && hay.charAt(i+j)==need.charAt(j)){

                j++;
            }
            if(j== need.length()){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String hay = "sabutsad";
        String need = "sad";
        System.out.println(str(hay,need));

    }
}