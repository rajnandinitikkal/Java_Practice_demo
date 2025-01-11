public class Main {
    public static void main(String[] args) {
        int start = 2;
        int end = 8;
        for(int i=start; i<=end; i++) {
            if(i % 3 == 0 && i % 7 ==0){
                System.out.println("CLOUDNIX");
            }
            else if(i % 3 == 0 ){
                System.out.println("CLOUD");
            }
            else if(i % 7 == 0){
                System.out.println("NIX");
            }
            else{
                System.out.println(i);
            }

}
}
}