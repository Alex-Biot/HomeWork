package data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Execute {
    public void exec() {
        ex();
    }

    private static void ex() {
        ExecWithSetName a = new ExecWithSetName();
        List<String> listName = new ArrayList<String>();
        List<String> listRemovName;
        List<String> listGetName ;
        String[] strArray = {"Ivan", "Alex", "Maria", "Piotr", "Anna", "Maria", "Ivan", "Alex"};

        System.out.print("Input massiv: { ");
        IntStream.range(0, strArray.length).forEach(i -> {
            listName.add(strArray[i]);
            System.out.print(listName.get(i) + " ");
        });
        System.out.println("}");

        listRemovName = a.removeDuplicates(listName);
        System.out.println("Add into set " + listRemovName.size()+" elements" );
        System.out.print(" { ");
        for (int i = 0; i < listRemovName.size(); i++) {
            System.out.print(listRemovName.get(i) + " ");
        }
        System.out.println("}");
       listGetName = a.getDuplicates(listName);
        System.out.println("Don't add into set " + listGetName.size()+" elements" );
        System.out.print(" { ");
        for (int i = 0; i < listGetName.size(); i++) {
            System.out.print(listGetName.get(i) + " ");
        }
        System.out.println("}");

    }
}
