import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> book = new HashMap<>();

    public int add(String name, String number) {
        if (!book.containsKey(name)) {
            book.put(name, number);
        }
        return book.size();
    }
}
