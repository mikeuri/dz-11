import org.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "minimalTest")
public class TestIsRetired extends TestData
{
    @Test(groups = "smokeTest")
    public void testIsRetiredMan() {

        Assert.assertFalse(man1.isRetired()); //Man man1 = new Man("Kelsey", "Gardner", 43, null);
        Assert.assertTrue(man2.isRetired()); //Man man2 = new Man("Christopher", "Glisson", 89, null);
        Assert.assertTrue(man3.isRetired()); //Man man3 = new Man("Winston", "Cox", 65, null);
    }

    @Test(priority = 1)
    public void testIsRetiredWoman() {

        Assert.assertTrue(woman1.isRetired()); //Woman woman1 = new Woman("Penelope", "Marshall", 60, null);
        Assert.assertFalse(woman2.isRetired()); //Woman woman2 = new Woman("Belinda", "Stephens", 42, man1);
        Assert.assertTrue(woman3.isRetired()); //Woman woman3 = new Woman("Rebecca", "Blanton", 86, null);
    }
}
