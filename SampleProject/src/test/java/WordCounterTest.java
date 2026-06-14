import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

public class WordCounterTest {

    @Test
    public void testCount()
    {
        WordCounter wordCounter= new WordCounter();
        Integer count =wordCounter.count("Dog");
        Assert.assertNotNull(count);
        Assert.assertEquals(new Integer(1),count);
        Integer count2 =wordCounter.count("Dog");
        Assert.assertEquals(new Integer(2),count2);
    }

}
