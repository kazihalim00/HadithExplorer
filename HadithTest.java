import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HadithTest {
    private Hadith hadith;

    @BeforeEach
    void setUp() {
        hadith = new Hadith("Test Hadith", "Bukhari", "Faith");
    }

    @Test
    void testHadithGetters() {
        // Basic assertions for Hadith class
        assertEquals("Test Hadith", hadith.getText());
        assertEquals("Bukhari", hadith.getSource());
        assertEquals("Faith", hadith.getCategory());

        assertNotEquals("Wrong Text", hadith.getText());
        assertTrue(hadith.getSource().contains("Bukhari"));
        assertFalse(hadith.getCategory().isEmpty());
    }

    @Test
    void testHadithToString() {
        assertNotNull(hadith.toString());
    }
}
