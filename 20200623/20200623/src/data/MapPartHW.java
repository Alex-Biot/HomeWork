package data;

import java.lang.reflect.Array;
import java.util.*;

public class MapPartHW {
// # Map Ex 1
    public void mapEx() {

        Map<String, String> mapVar = new TreeMap<>();
        mapVar.put("a", "Hi");
        mapVar.put("b", "all");
        mapVar.put("c", "here.");
        mapVar = exNewMap(mapVar);
        for (Map.Entry<String, String> it : mapVar.entrySet()
        )
            System.out.println("key = " + it.getKey() + " value = " + it.getValue());
        System.out.println();
    }

    private static Map<String, String> exNewMap(Map<String, String> mapW) {
        Set<String> k = mapW.keySet();
        Collection<String> v = mapW.values();
        String connectK = "";
        String connectV = "";
        for (String it : k
        ) {
            connectK = connectK + it;
        }
        for (String it : v
        ) {
            connectV = connectV + " " + it;
        }
        mapW.put(connectK, connectV);
        return mapW;
    }
    // # Map Ex 2
    public void mapExBool() {
        Map<String, Boolean> execMapBool = new HashMap<>();
        String[] charAr = {"a", "b", "c", "b", "d", "e", "f", "c",};
        for (String it : charAr
        ) {
            execMapBool.put(it, execMapBool.containsKey(it));
        }
        for (Map.Entry<String, Boolean> it : execMapBool.entrySet()
        )
            System.out.println("key = " + it.getKey() + " value = " + it.getValue());
    }
    // # Map Ex 3
    public void findAnnagram(String inputName) {

        String[] annagName = {"ivan", "anna", "piotr", "navi", "riopt", "vina", "nana", "oiptr", "vnia", "naan"};
        Map<Integer, String> mapAnnag = new HashMap();
        for (int i = 0; i < annagName.length; i++) {
            mapAnnag.put(i, annagName[i]);
        }
        for (Map.Entry<Integer, String> it : mapAnnag.entrySet()
        ) {
            if (strArr(inputName).equals(strArr(it.getValue()))) {
                System.out.println(it.getValue() + " is annagram of " + inputName);
            }
        }
    }

    private static String strArr(String inputString) {
        char[] aChar, bChar = new char[inputString.length()];
        String tmpStr;
        aChar = inputString.toCharArray();
        Arrays.sort(aChar);
        tmpStr = new String(aChar);

        return tmpStr;
    }
    // # Map Ex 4
    public int countName(String inName) {
        int cName;
        String[] inputName = {"Ivan", "Piotr", "Maria", "Ivan", "Anna", "Piotr", "Piotr", "Piotr", "Maria", "Ivan", "Anna"};
        Map<String, Integer> mapAnnag = new HashMap();
        for (String nam : inputName
        )
            if (mapAnnag.containsKey(nam)) mapAnnag.put(nam, mapAnnag.get(nam) + 1);
            else mapAnnag.put(nam, 1);


        return cName = mapAnnag.get(inName);
    }
    // # Map Ex 5
    public void countWord() {
        String wordMax = "";
        int countMax = 0; //So quckly
        String[] prepositionsAndPunctuation = {"in ", "of ", "and ", "to ", "with ", "into ", "throw ", ",", ".", ";", ":", "+", "-", "=", "*"};
        String[] arWords;
        String inText = "she walks walks walks walks in beauty, like the night " +
                "of cloudless climes and starry skies; " +
                "and all that's best of dark and bright " +
                "meet in her aspect and her eyes: " +
                "thus mellowed to that tender light " +
                "which heaven to gaudy day denies.";

        for (int i = 0; i < prepositionsAndPunctuation.length; i++) {
            inText = inText.replace(prepositionsAndPunctuation[i], "");
        }

        arWords = inText.split(" ");
        Map<String, Integer> mapWord = new TreeMap<>();
        for (String nam : arWords
        )
            if (mapWord.containsKey(nam)) mapWord.put(nam, mapWord.get(nam) + 1);
            else mapWord.put(nam, 1);

        for (Map.Entry<String, Integer> it : mapWord.entrySet()
        )
            if (it.getValue() > countMax) {
                countMax = it.getValue();
                wordMax = it.getKey();
            }
        System.out.println("key = " + wordMax + " value = " + countMax);
    }
}


