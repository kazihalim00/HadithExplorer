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
    @ParameterizedTest
    @ValueSource(strings = {"Faith", "Morals", "Patience"})
    void testParameterizedCategory(String category) {
        Hadith hadith = new Hadith("Sample Hadith", "Bukhari", category);
        assertEquals(category, hadith.getCategory());
    }

    @ParameterizedTest
    @CsvSource({"Faith,Bukhari", "Morals,Muslim"})
    void testCsvSource(String category, String source) {
        Hadith hadith = new Hadith("Sample", source, category);
        assertEquals(category, hadith.getCategory());
        assertEquals(source, hadith.getSource());
    }

    static Stream<Hadith> hadithProvider() {
        return Stream.of(
                new Hadith("Hadith1", "Bukhari", "Faith"),
                new Hadith("Hadith2", "Muslim", "Morals")
        );
    }

    @ParameterizedTest
    @MethodSource("hadithProvider")
    void testMethodSource(Hadith hadith) {
        assertNotNull(hadith.getText());
        assertNotNull(hadith.getSource());
        assertNotNull(hadith.getCategory());
    }
}
