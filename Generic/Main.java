
import java.util.LinkedList;
import java.util.List;



// class Data{
//    private Object object;

//    public Data(Object object) {
//        this.object = object;
//    }
//    @Override
//    public String toString() {
//        return object.toString();
//    }
//    public Object getObject() {
//        return object;
//    }
// }

class Data<T>{
    private T object;

    public Data(T object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return object.toString();
    }
   public Object getObject() {
       return object;
   }
}

class Name{
   private String name;

   public Name(String name) {
       this.name = name;
   }

   @Override
   public String toString() {
       return name;
   }
}

class GenericData<T>{
   private T somedata;

   public GenericData(T somedata) {
       this.somedata = somedata;
   }

   public T getSomedata() {
       return somedata;
   }
}


public class Main {
    public static void main(String[] args) {

        List<Data<Object>> elements = new LinkedList<>();
        elements.add(new Data<>("Tuhsar"));
       elements.add(new Data<>(54));
       elements.add(new Data<>(78.9));
        elements.add(new Data<>("Rutuja"));

    //     for(Data data:elements){
    //         System.out.println(data);
    //     }
    //    System.out.println(elements);

//        *********** using simple method ******************

    //    Data data = new Data("Some data");
    //    String x = (String) data.toString();
    //    System.out.println(x);


//        **************** Using Generic Type **************
       GenericData<String> gendata = new GenericData<>("some generic data");
       String y = gendata.getSomedata();
       System.out.println(y);
    }
}
