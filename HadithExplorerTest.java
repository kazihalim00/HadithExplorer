import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HadithExplorerTest {
    private HadithExplorer hadithExplorer;

    @BeforeEach
    void setUp() {
        hadithExplorer = new HadithExplorer();
    }

    @Test
    void testHadithListOperations() {
        // Check if list is initially empty
        assertTrue(hadithExplorer.hadithList.isEmpty());

        // Add a new Hadith
        Hadith newHadith = new Hadith("Example Hadith", "Muslim", "Morals");
        hadithExplorer.hadithList.add(newHadith);

        // Check if the list contains one Hadith
        assertFalse(hadithExplorer.hadithList.isEmpty());
        assertEquals(1, hadithExplorer.hadithList.size());
    }
}
