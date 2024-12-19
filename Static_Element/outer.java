package Static_Element;

public class Outer {
    NonStaticInner nonstaticinner = new NonStaticInner();
    private int  x=10;

public static class brand {
    public static String brandName = "Punch";
    public static void TagLine() {
        System.out.println("Reliable Car");
    }
}
    public class NonStaticInner{
    public void model(String model){
        System.out.println("Mkae of the car" +model);
        System.out.println("Brand name:" + brand.brandName);
        System.out.println("Value of x is " +x);
    }
}
    public NonStaticInner getNonstaticinner() {
        return nonstaticinner;
    }
}
