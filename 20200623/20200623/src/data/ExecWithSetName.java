package data;


import java.util.*;

public class ExecWithSetName {
    Set<String> addNameSet;

    public List<String> removeDuplicates(List<String> strArr) {
        List <String> newRemDuplicates= new ArrayList<>();

        addNameSet = new HashSet<String>();
        for (String name : strArr
        ) addname(name);
        Iterator <String> iterator = addNameSet.iterator();
        while (iterator.hasNext()) {newRemDuplicates.add(iterator.next()); ;
        }
        return  newRemDuplicates;
    }

    public List<String> getDuplicates(List<String> strArr) {
        List <String> newGetDuplicates= new ArrayList<>();
        addNameSet = new HashSet<>();
        for (String name : strArr
        ) if (!addname(name)) newGetDuplicates.add(name);
        return  newGetDuplicates;
    }
    public boolean addname(String str) {
        return addNameSet.add(str);
    }


}
