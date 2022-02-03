import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testConcat(){
        assertEquals("haHA", SkillDemo.concat("ha", "fails"));
    }
}
