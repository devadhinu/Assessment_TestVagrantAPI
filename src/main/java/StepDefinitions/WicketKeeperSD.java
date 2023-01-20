package StepDefinitions;

import DesignandImplementation.TeamValidatorImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class WicketKeeperSD extends TeamValidatorImpl
{
    @Then("Verify whether the response has more than one wicketKeeper")
    public void testNoOfWicketKeeperPlayers()
    {
        Assert.assertEquals(true,findWicketKeeperPlayers(1));
    }

}
