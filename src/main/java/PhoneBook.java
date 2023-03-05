import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    private final Map<String, String> book = new HashMap<>();

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
        return null;
    }
}
