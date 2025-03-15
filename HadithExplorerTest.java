import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
    @Test
    void testMockitoHadithBehavior() {
        when(hadithMock.getText()).thenReturn("Mock Hadith");
        when(hadithMock.getSource()).thenReturn("Muslim");
        when(hadithMock.getCategory()).thenReturn("Morals");

        hadithExplorer.hadithList.add(hadithMock);

        assertFalse(hadithExplorer.hadithList.isEmpty());
        assertEquals("Mock Hadith", hadithExplorer.hadithList.get(0).getText());
        assertEquals("Muslim", hadithExplorer.hadithList.get(0).getSource());
    }

    @Test
    void testMockitoVerify() {
        hadithExplorer.displayMessage("Test Message");
        verify(hadithExplorer).displayMessage("Test Message");
    }

}






