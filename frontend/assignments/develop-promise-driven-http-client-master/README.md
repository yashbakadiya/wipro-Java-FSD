## Practice

### Develop Promise Driven HTTP Client

#### Context

One of the ways of making web applications interactive, is by making calls to access data to external apis.

This operation has to be performed asynchronously to allow non-blocking execution

The XMLHttpRequest object helps to make asynchronous calls and provides responses.

However to retrieve response event handlers are required that invoke on events being raised as the response is generated

For multiple nested calls the code becomes too complex

Better approach would be to create a promise object that makes XHR requests and returns promise with response.

The resulting response can be consumed by calling then( ) and catch( ) methods

#### Problem Statement

Develop Promise driven HTTP client that uses XMLHttpRequest object to make HTTP calls and returns promise to resolve or reject for the request made to provided url

#### Instructions

1. Download and unzip the boilerplate code.  
2. Run the command `npm install` to install the dependencies required for automated testing.  
3. Open the boilerplate code in VSCode to develop the assignment solution.
4. Provide the solution code inside the respective `.js` file for each problem.
5. Each function should return the resultant which can then be tested through automated test cases.
6. First, test the solution locally by running the command `npm run test`.  
7. Refactor the solution to ensure all test cases are passing.  
8. DO NOT MODIFY THE PROVIDED CODE, ELSE THIS MAY IMPACT THE TEST CODE EXECUTION.

## Submitting your solution for preliminary automated review  

 1. Open https://codereview-wipro.stackroute.in/#/app and login into the platform  
 2. Under Assignment repository select `develop-promise-driven-http-client`, and branch master  
 3. Under Your solution repository select your own repository and branch  
 4. Press Submit  
 5. Evaluation will take around 2 mins to complete after which you need to refresh your browser and get the updated status    
 6. Press click here for the feedback 
 7. Watch out for your total score and detailed status on each test and eslint errors in the coloured blocks on the screen  
 8. Fix failing test cases as well as eslint errors and re-submit your solution until you get 100%
