This Framework is Java based code using Rest Assured Library for parsing the Json data and identifying IPL players details. Based on the requirement.

| Dependency       | Version | Feature                           |
|------------------|---------|-----------------------------------|
| Cucumber JUnit   | 6.9.1   | Shows the Test progress           |
| Json Simple      | 1.1.1   | For parsing the Json file         | 
| Cucumber Java    | 6.9.1   | Execute Steps in the feature file |


Features
1. We have validated whether the RCB team have 4 foreign players
2. We have validated whether the RCB team have 1 wicket keeper


Test Utils - files helps to convert the Json parsed Object into JSonObject and JSonArray

# TestVagrant_Assignment

<h2>Problem Statement:</h2>
<ul>
<li>1. Write test to validate that the team has only 4 foreign players and  atleast 1 wicket keeper</li>

 
## Software Dependencies

<table>
  <thead align="left">
    <tr border: 2 px;>
      <td><b>Dependency</b></td>
      <td><b>Version</b></td>
      <td><b>Feature</b></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Java</b></td>
      <td><b>1.8</b></td>
      <td><b>Programming languages</b></td>
    </tr>
    <tr>
      <td><b>TestNG</b></td>
      <td><b>7.4.0</b></td>
      <td><b>Test Runner to execute suite</b></td>
    </tr>
    <tr>
      <td><b>JSON Simple</b></td>
      <td><b>1.1.1</b></td>
      <td><b>Create & Parse JSON Files for API</b></td>
    </tr>
    <tr>
      <td><b>Junit </b></td>
      <td><b>4.12</b></td>
      <td><b>To do compile and execute</b></td>
    </tr>
      <tr>
      <td><b>Extent Grasshopper</b></td>
      <td><b>1.9.2</b></td>
      <td><b>To create extent reports for cucumber</b></td>
    </tr>
   </tbody>
</table>


<h2>Project Setup </h2>
<ul>
<li>Created a Maven project added dependencies for JSon-Simple, TestNG, Cucumber, Extend Report Adapter for Cucumber in POM. XML</li>
<li>Folder Structure  :</li>
<li>Under src/testd/resources->testdata->added "TeamRCBResponse" json File</li>
<li>Under src/main/java->com.iplteam->Created Interface "ITeamVaidator" class</li>
<li>Under src/main/java->com.iplteam->Created implementation class for IPLJsonService  "TeamValidatorImpl" class</li>
<li>"IPLJsonServiceImpl" class has reusable methods listed below:</li>
	<ul>
	<li>readJsonFile(String fileName)  - Read the JSON file,parse and get JSONObject</li>
	<li>checkForeignPlayers(int foreignCount) - Checks how many Foreign Players from JSON Array</li>
    <li>checkWicketKeeperPlayers(int wicketKeeperCount) - Checks how many Wicket Keeper from JSON Array</li>
	</ul>
	
<h2>Brute Force Approach</h2>
<li>Under src/main/java->"com.vanillascript" package-> has "ReadRCBJsonFile" class </li>
<li>"ReadRCBJsonFile" class has step by step approach in reading the Json file and validating how many foreign players and wicketkeeper :</li>
	
<h2>TestNG Execution</h2>
<li>Under src/test/java->"ipl.testcases" package-> has testcases based on testNG execution class</li>
<li>"TC001"Positive Test Case - To Validate the team has only 4 foreign players:</li>
<li>"TC002"Positive Test Case - To Validate there is at least 1 wicket keeper:</li>
<li>"TC003"Negative Test Case - Check the Negative input for RCB Team :</li>
<li>testng.xml --> contains parameter will  pass the foreignplayer  and wicketkeeper method to check count</li>
<li>Report-->/test-output/emailable-report.html</li>


<h2>Cucumber Execution</h2>
<li>Under src/main/java->"com.cumcumberstep" package-> Created "StepDefinitions" for each action</li>
<li>Under src/main/java->"com.cucumberrunner" package-> Created "RunCucumberTest" for running each feature</li>
<li>Under src/test/java->"features" package-> has testcases created as a feature file using gherkin language</li>

<li>"Test001"Positive Test Case - To Validate the team has only 4 foreign players:</li>
<li>"Test002"Positive Test Case - To Validate there is at least 1 wicket keeper:</li>

<li>Report-->/target/cucumber-results-feature-overview.html</li>
<li>In Console Report link will be generated -->https://reports.cucumber.io/reports/{id}</li>

<h2>Command Line Execution</h2>
<li>Navigate to project directory(./TestVagrant_Assessment) and execute "mvn clean test"</li>
<li>Note: make sure Java and maven are installed in the machine</li>
</ul> 




