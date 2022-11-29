package n1exercici2;

import n1exercici1.NoGenericsMethods;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Milla", 33);

        GenericMethods.printArguments(persona1, "hola", 14);

        GenericMethods.printArguments("adios", persona1, false);
    }
}
