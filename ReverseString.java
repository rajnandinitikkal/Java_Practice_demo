public class ReverseString {
    public static void main(String[] args){

        String str ="abcd";
        int length = str.length();

        for (int i=length-1; i>=0; i--){
            
                System.out.print(str.charAt(i));
            
        }
    }
}
