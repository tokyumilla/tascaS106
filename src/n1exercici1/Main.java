package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        NoGenericsMethods collection1 = new NoGenericsMethods("hola","qué tal","cómo estamos");

        NoGenericsMethods collection2 = new NoGenericsMethods("qué tal", "hola", "cómo estamos");

        NoGenericsMethods collection3 = new NoGenericsMethods(3,4,5);

        NoGenericsMethods collection4 = new NoGenericsMethods(5,4,3);

        System.out.println(collection1);
        System.out.println(collection2);
        System.out.println(collection3);
        System.out.println(collection4);












    }
}