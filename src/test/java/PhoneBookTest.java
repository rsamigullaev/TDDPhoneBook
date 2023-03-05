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
        Assertions.assertEquals("John", pb.findByNumber("89037438233"));
    }

    @Test
    public void test_not_found() {
        Assertions.assertNull(pb.findByNumber(""));
    }

    @Test
    public void test_find_john_by_name() {
        pb.add("John", "89037438233");
        Assertions.assertEquals("89037438233", pb.findByName("John"));
    }

    @Test
    public void test_not_found_by_name() {
        Assertions.assertNull(pb.findByName(""));
    }

    @Test
    public void test_print_all_one() {
        pb.add("John", "89037438233");
        Assertions.assertEquals("John",pb.printAllNames());
    }

    @Test
    public void test_print_all_names_three() {
        pb.add("John", "89037438233");
        pb.add("Doe", "89037438233");
        pb.add("Mark", "89037438233");
        Assertions.assertEquals("Doe, John, Mark", pb.printAllNames());
    }

    @Test
    public void test_print_all_names_null() {
        Assertions.assertNull(pb.printAllNames());
    }
}