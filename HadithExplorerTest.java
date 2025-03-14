import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HadithExplorerTest {
    private HadithExplorer hadithExplorer;

    @BeforeEach
    void setUp() {
        hadithExplorer = new HadithExplorer();
    }

    @Mock
    private Hadith hadithMock;

    @InjectMocks
    private HadithExplorer hadithExplorer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        hadithExplorer = new HadithExplorer();
    }


    @Test
    void testAddHadith() {
        Hadith newHadith = new Hadith("Kindness is a mark of faith.", "Muslim", "Morals");
        hadithExplorer.addHadith(newHadith);  // This method should exist in HadithExplorer

        assertFalse(hadithExplorer.getHadithList().isEmpty());
        assertEquals(1, hadithExplorer.getHadithList().size());
        assertEquals("Muslim", hadithExplorer.getHadithList().get(0).getSource());
    }

}






