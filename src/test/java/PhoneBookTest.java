import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private final PhoneBook pb = new PhoneBook();

    @Test
    public void test_new_two_contacts() {
        Assertions.assertEquals(2, pb.add());
    }
}