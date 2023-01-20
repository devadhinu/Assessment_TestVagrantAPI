package DesignandImplementation;

import javax.xml.parsers.ParserConfigurationException;

public interface ITeamValidator {
	

	/**
	 * This method used to read the JSON file 
	 * @param fileName - helps to load the team details`
	 * @return type void 
	 * @author Devasena 
	 * @throws ParserConfigurationException 
	 */	
	public void readJsonSchema(String fileName) throws ParserConfigurationException;
	
	/**
	 * This method used to check how many foreign player in a team 
	 * @param foreignCount - helps to check the condition number of foreign player in a team
	 * @return type boolean  
	 * @author Devasena
	 */
	public boolean findForeignPlayers(int foreignPlayerCount);
	
	/**
	 * This method used to check how many wicket keepers are found in a team
	 * @param foreignPlayerCount - helps to check the condition number of wicket keeper in a team
	 * @return type boolean
	 * @author Devasena
	 */
	public boolean findWicketKeeperPlayers(int wicketKeeperCount);

}
