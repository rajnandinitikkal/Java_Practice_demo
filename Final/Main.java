// if we want that not to override method or class then you can simply use final keyword that
// no one can access it. or we don't want any changes in that case you can use that


public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.USA();
        child.India2();

//        Child child= new Child();
//        System.out.println(child.x);
//        Child child2 = new Child(104);
//        System.out.println(child.x);
    }
}