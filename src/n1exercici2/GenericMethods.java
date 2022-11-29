package n1exercici2;

public class GenericMethods {
    public static <T,U,K> void printArguments  (T t1,U u1, K k1) {
        System.out.println(t1);
        System.out.println(u1);
        System.out.println(k1);

    }
}
