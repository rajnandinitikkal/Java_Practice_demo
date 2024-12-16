package Access_Modifier;

//default/no modifier: No modifier is trated as default modifier.
// The default modifier is accessible only within package.
//
//Protected: Protected modifier is accessible both within and outside
// the package but through inheritance only.

// public: The public modifier is accessible everywhere.
// It has the widest scope among all others modifier


public class Main {
    public static void main(String[] args) {

//        Other other = new Other();
//        System.out.println(other.x);
//        other.message();

        Sub sub = new Sub();
        System.out.println(sub.x);
    }
}