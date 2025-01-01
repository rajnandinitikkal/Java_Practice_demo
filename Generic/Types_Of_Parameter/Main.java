package Types_Of_Parameter;

class Data<k extends Integer ,v extends Name>{
    private k key;
    private v value;

    public Data(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
    public <E, N extends Number> void display(E elements, N number){
        System.out.println("Elements: " + elements + " Number: " + number);
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class Name{
    private String name;

    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

Data <Integer, Name> data = new Data(10,new Name("Rutuja"));
        System.out.println(data);
        data.display("Tushar" , 20);
    }
}
