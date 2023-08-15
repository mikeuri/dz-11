import org.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "minimalTest")
public class TestPersonsCreation extends TestData
{
    @Test(groups = "smokeTest")
    public void testManParameters() {

        Assert.assertEquals(man1.getLastName(), "Gardner");
        Assert.assertEquals(man1.getFullName(), "Kelsey Gardner");
        Assert.assertEquals(man1.getAge(), 43);
        Assert.assertEquals(man1.getGender(), "male");
    }

    @Test (priority = 1)
    public void testWomanParameters() {

        Assert.assertEquals(woman2.getLastName(), "Gardner");
        Assert.assertEquals(woman2.getFullName(), "Belinda Gardner"); //name was modified when setting partner
        Assert.assertEquals(woman2.getAge(), 42);
        Assert.assertEquals(woman2.getGender(), "female");
    }

    @Test (priority = 2)
    public void testPartnersAfterInitialisation() {

        Assert.assertEquals(woman2.getPartner(), man1);
        Assert.assertEquals(man1.getPartner(), woman2);
        Assert.assertNull(man5.getPartner());
    }
}
