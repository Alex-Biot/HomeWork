package data;


import java.util.Random;

public class MainSet {
    public static void main(String[] args) {
        String[] nameIn = {"ivan", "anna", "piotr"};
        String[] nameIn1 = {"Ivan", "Anna", "Piotr", "Maria"};
        int countN;
        Execute a = new Execute();
        MapPartHW b = new MapPartHW();
        a.exec(); // # Set Ex 1&2
        b.mapEx(); // # Map Ex 1
        b.mapExBool();// # Map Ex 2
        // # Map Ex 3
        for (int i = 0; i < nameIn.length; i++) {
            b.findAnnagram(nameIn[i]);
        }
// # Map Ex 4
        for (int i = 0; i < nameIn1.length;
        i++){
            countN = b.countName(nameIn1[i]);
            System.out.println("Count " + nameIn1[i] + " = " + countN);
        }
        b.countWord(); // # Map Ex 5

    }


}
