# J_unit-TestNg

1. Created a Maven Project.

2. Added Junit dependey in pom.xml file.

3. Created a test class named test_consec
    - declared 3 arraylists  expectedstring ,actualString and actualConsecutiveLetterResult  
        - actualString consists of 3 input words which are passed to Consec class.  
        - expectedstring stores the expected result.   
        -  actualConsecutiveLetterResult stores the result returned by Consec class.   
 
 4. Created a class named Consec  which contains the main logic to filter out words with consecutive letters. 
 
    - created a method findConsecString which recieves an argument of type ArrayList from TestConsec class .  
    
         - The method iterates through the arraylist and and return type is ArrayList
