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
      @Test
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid Input");
        });
    }

    @Test
    void testAssertTimeout() {
        assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(500));  // Should not exceed 1 second
    }
}
