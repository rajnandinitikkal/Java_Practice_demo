package Static_Element;

public class Main {
    public static void main(String[] args) {

        Outer out = new Outer();
        Outer.brand.TagLine();
        out.nonstaticinner.model("corolla");

        //        System.out.print("Hello and welcome!");
        
                System.out.println("obj1:" + TestStatic.getStaticvar());
                TestStatic.setStaticvar(24);
                System.out.println("obj2:" +TestStatic.getStaticvar());
        
        
                System.out.println("obj2:" +TestStatic.getStaticvar());
                TestStatic.setStaticvar(29);
                System.out.println("obj2:" +TestStatic.getStaticvar());
            }
    
}
