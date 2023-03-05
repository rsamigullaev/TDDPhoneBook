import java.util.*;

public class PhoneBook {
    private final SortedMap<String, String> book = new TreeMap<>();

    public int add(String name, String number) {
        if (!book.containsKey(name)) {
            book.put(name, number);
        }
        return book.size();
    }

    public String findByNumber(String number) {
        String name = null;
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (Objects.equals(entry.getValue(), number)) {
                name = entry.getKey();
                break;
            }
        }
        return name;
    }

    public String findByName(String name) {
        return book.get(name);
    }

    public String printAllNames() {
        if (book.isEmpty()) return null;
        return book.keySet().toString();
    }
}
