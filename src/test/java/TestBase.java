import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public static void setUp() {
        app.init();
    }

    @AfterClass
    public static void tearDown() {
        app.stop();
    }
}
