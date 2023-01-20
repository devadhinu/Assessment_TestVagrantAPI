package StepDefinitions;
import DesignandImplementation.TeamValidatorImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.xml.parsers.ParserConfigurationException;
//
//  Given <Team> player details submitted
//    Then validate that team has only <playerCount> of <countryOrigin> players
public class ForiegnPlayerSD extends TeamValidatorImpl {
   // @Given("RCB player details submitted")
//    public void preSetUp(String fileName) throws ParserConfigurationException {
//
//    }
//
//
//   // @Then("validate that team has only  of foriegn players")
//    public void testNoOfForeignPlayersInATeam(int foreignPlayerCount)
//    {
//        findForeignPlayers(foreignPlayerCount);
//    }
    @Given("^(.*) player details submitted$")
    public void rcb_player_details_submitted(String filename) {
        try {
            readJsonSchema(filename);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("Validate that team has only {int} of foriegn players")
    public void validate_that_team_has_only_of_foriegn_players(int foreignPlayerCount) {
        findForeignPlayers(foreignPlayerCount);
    }

}
