package goncharuk.ross.Other;


import goncharuk.ross.Other.ImmutableMutable.ImmutableTest;
import goncharuk.ross.Other.ImmutableMutable.MutableTest;
import goncharuk.ross.Other.Serialization.Employee;
import goncharuk.ross.Other.Serialization.Test;

import java.io.*;

public class OthersMain {
    public static void main(String[] args) {
        MutableTest person = new MutableTest("Ross", "G", 28);
        ImmutableTest test = new ImmutableTest(1, person);

        System.out.println(person);
        System.out.println(test);

        test.getPerson().setAge(30);

        System.out.println(person);
        System.out.println(test);
        System.out.println("-------------------------------------- Format");

        //Format
        float floatVar = 10f;
        int intVar = 22;
        String stringVar = "test";
        System.out.printf("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println();
        System.out.println("-------------------------------------- Serialization");

        //Serialization
        Employee ross = new Employee("Ross","trainee",331211, new Test(3));
        String fileName = "C:/test";
        System.out.println(ross);
        try {
            serialize(ross,fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Deserialization
        Employee rossClone = null;
        try {
            rossClone = (Employee) deserialize(fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(rossClone);
    }

    private static void serialize(Object o, String fileName) throws IOException{
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        System.out.println("Successfully serialized");
    }
    private static Object deserialize(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("Deserialized from " + fileName);
        return ois.readObject();
    }
}
