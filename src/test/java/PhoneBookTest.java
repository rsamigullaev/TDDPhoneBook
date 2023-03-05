import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private final PhoneBook pb = new PhoneBook();

    @Test
    public void test_new_two_contacts() {
        int count;
        pb.add("John", "89037438233");
        count = pb.add("Doe", "89037438233");
        Assertions.assertEquals(2, count);
    }

    @Test
    public void test_new_two_contacts_with_duplicated_name() {
        int count;
        pb.add("John", "89037438233");
        pb.add("Doe", "89037438233");
        count = pb.add("Doe", "89037438233");
        Assertions.assertEquals(2, count);
    }

    @Test
    public void test_find_john() {
        pb.add("John", "89037438233");
        Assertions.assertEquals("Jonh", pb.findByNumber("89037438233"));
    }
}