This Framework is Java based code using Rest Assured Library for parsing the Json data and identifying IPL players details. Based on the requirement.

# TestVagrantAPI_Assessment

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
      <td><b>Cucumber Junit</b></td>
      <td><b>7.11.0</b></td>
      <td><b>Create & Parse JSON Files for API</b></td>
    </tr>
	   <tr>
      <td><b>Cucumber Java</b></td>
      <td><b>7.11.0</b></td>
      <td><b>To have cucumber for Java</b></td>
    </tr>
    <tr>
      <td><b>JSON Simple</b></td>
      <td><b>1.1.1</b></td>
      <td><b>Create & Parse JSON Files for API</b></td>
    </tr>
    <tr>
      <td><b>Junit </b></td>
      <td><b>4.12</b></td>
      <td><b>To do compile and execute using Junit</b></td>
    </tr>
      <tr>
      <td><b>extentreports-cucumber7-adapter</b></td>
      <td><b>1.9.2</b></td>
      <td><b>To create extent reports for cucumber project</b></td>
    </tr>
   </tbody>
</table>


<h2>Project Setup </h2>
<ul>
<li>Created a Maven project added dependencies for JSon-Simple, TestNG, Cucumber, Extend Report Adapter for Cucumber in POM. XML</li>
<li>Folder Structure  :</li>
<li>Under src/main/java/DesignImplementation ->Created Interface "ITeamVaidator" and "TeamValidatorImpl" class</li>
<li>Under src/main/java/Runner->Created runner class for execution </li>
<li>Under src/main/java/StepDefinitions->Created step Definition classes</li>
<li>Under src/main/resources->Created cucumber.properties file and added "TeamRCBResponse" json File</li>
<li>Under src/test/java/Features->Created feature files </li>	
<li>Under src/test/resources->Created extent.properties file </li>	
<li>"TeamValidatorImpl" class has reusable methods listed below:</li>
	<ul>
	<li>readJsonSchema(String fileName)  - Read the JSON file,parse and get JSONObject</li>
	<li>findForeignPlayers(int foreignCount) - Checks how many Foreign Players from JSON Array</li>
        <li>findWicketKeeperPlayers(int wicketKeeperCount) - Checks how many Wicket Keeper from JSON Array</li>
	</ul>
	

	
<h2>Cucumber Runner Execution</h2>
<li>Under src/main/java/Runner->"CucumberTestRunner.java" has cucumber options which will run all the feature files</li>
<li>Run the Cucucmber runner file as Junit and to execute and generate the report</li>
<li>Report-->/test-output/RCBResultReport/Report/Results.html</li>	
<li>Configured "extent.properties" to capture the extent report in test-output folder to have different folder with timeof execution captured </li>


<h2>Feature file Execution</h2>
<li>Under src/test/java->"features" package-> has feature file created using gherkin language which will have run as feature file option to execute</li>
<li>"ValidateRCBPlayersCountry" Positive Test Case - To Validate the team has only 4 foreign players:</li>
<li>"ValidateRCBRoles" Positive Test Case - To Validate there is at least 1 wicket keeper:</li>

<h2>Report Generation</h2>
<li>Report-->/test-output/RCBResultReport/Report/Results.html</li>	
<li>Configured "extent.properties" to capture the extent report in test-output folder to have different folder with timeof execution captured </li>
	

<h2>Command Line Execution</h2>
<li>Navigate to project directory(./TestVagrantAPI_Assessment) and execute "mvn clean test"</li>
<li>Note: make sure Java and maven are installed in the machine</li>
</ul> 
	
<h2>Scope of further optimisation</h2>
<li>To have a pojo class created or using LOmbok Annotatons to get the values from the JSON intead of using simple JSONObject</li>
<li>Note: Made use of JSONObject as the response body is provided</li>
</ul> 




