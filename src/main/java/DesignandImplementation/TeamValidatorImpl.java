package DesignandImplementation;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TeamValidatorImpl implements ITeamValidator{

	public static JSONObject jobject;
	public void readJsonSchema(String fileName) throws ParserConfigurationException
	{
		JSONParser jparser = new JSONParser();

		try {
			Path directory = Paths.get("src", "main", "resources");
			String file = directory.toAbsolutePath().toFile().getCanonicalPath(); //"/src/test/resources
			String filePath = Arrays.stream(directory.toFile().list()).filter(flist -> flist.contains(fileName)).findAny().get().toString();
			FileReader fileReader = new FileReader(file+"/"+filePath);
		//	FileReader fileReader = new FileReader(filePath);
			jobject = (JSONObject) jparser.parse(fileReader);

		}
		catch (Exception e)
		{
			throw new RuntimeException("Unable to read provided json file " + fileName);
		}

	}

	public boolean findForeignPlayers(int foreignPlayerCount) {
		int foriegnPlayers=0;
		if(jobject!=null)
		{
			JSONArray players = new JSONArray();
			players=(JSONArray)jobject.get("player");
			for(int i=0;i<players.size();i++)
			{
				JSONObject player =(JSONObject)players.get(i);
				if(!player.get("country").toString().equalsIgnoreCase("India"))foriegnPlayers++;
			}
			if(foriegnPlayers==foreignPlayerCount) return true;
		}
		return false;
	}

	public boolean findWicketKeeperPlayers(int wicketKeeperCount)
	{
		int wicketKeepers=0;
		if(jobject!=null)
		{
			JSONArray players = new JSONArray();
			players=(JSONArray)jobject.get("player");
			for(int i=0;i<players.size();i++)
			{
				JSONObject player =(JSONObject)players.get(i);
				if(player.get("role").toString().equalsIgnoreCase("Wicket-keeper"))wicketKeepers++;
			}
			if(wicketKeepers>=wicketKeeperCount) return true;
		}
		return false;
	}

}
