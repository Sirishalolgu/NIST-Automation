This is the project to automate the NIST 

Steps:
To run the test , run the following command
	mvn test
To access the allure reports
	mvn allure:serve -Dallure.results.directory=../allure-results
Screenshots are in the screenshot folder in the root director

Configuration:
Default number of loops is set to 100. To change the number of loops, change it in config.properties

baseScoreMetrics and temporalScoreMetrics arrays contain all possible values for Base Score Metrics and Temporal Score Metrics
The loop iterates through all combinations of metrics, selects each combination on the webpage, extracts the relevant values, and prints them.
