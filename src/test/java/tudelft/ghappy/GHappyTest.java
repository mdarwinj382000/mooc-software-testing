package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    GHappy gh;

    @BeforeEach
    public void initialize() {
        this.gh = new GHappy();
    }

    @Test
    public void ghappytest1() {
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }
    @Test
    public void ghappytest2(){
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }
    @Test
    public void ghappytest3(){
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }

}
