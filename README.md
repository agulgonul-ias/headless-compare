# headless-compare
We can collect the three different logs of index.html by using this repo.

On the Test/Tests.java class, there are already configured tests to run as;

        /*
        Browser type:
                        chrome
                        chrome-headless
        Property Type:
                        getOwnPropertyLogs
                        getGlobalLogs
         */

Run this test on intelliJ to get the logs and added to the .txt file from advan/index.html
Example: logChecker("chrome-headless", "getGlobalLogs");


## java/advan folder structure

*advan/CompareTheLogs.java > to compare the logs of two different .txt file

*advan/Driver.java         > Chrome&firefox drivers' configuration is here.

*advan/index.html          > sample url to get the logs via
        * document.write(Object.keys( window ));
        * document.write(JSON.stringify(Object.getOwnPropertyNames(window)));
        * document.write(JSON.stringify(recur(navigator)));

*advan/SeleniumSpecificLogs.java > selenium specific logs to extract (ignore)

*advan/Utilities.java            > the helper methods

##test file
src/test/java/Test


##setup
1. get the project from the version control
2. refresh the pom.xml file and let it configure the dependencies
3. run the test on the src/test/java/Test.java file