import java.util.*;

public class NamesIterator {

    public static void iterateUsingFor (List<String> names) {
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    public static void iterateUsingForEach (List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void iterateUsingIterator (List<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ishwar");
        names.add("akash");
        names.add("srishti");
        names.add("ifrah");
        names.add("prachi");
        names.add("sreejit");

        iterateUsingFor(names);
        System.out.println("================");
        iterateUsingForEach(names);
        System.out.println("================");
        iterateUsingIterator(names);
    }
}
