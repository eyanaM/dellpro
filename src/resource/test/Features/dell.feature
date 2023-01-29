Feature: This Feature file will cover Product feature



Scenario: Verify Server page 
Given launch application <"URL">
Then  MouseOver on Product to get Server
Then click Server
Then  Verify Server page dispaly


Scenario: Verify contact us page
Given launch application <"URL">
Then click contact us link
Then verify contact us page display
  
  	
 @test	
Scenario: Veify User can login
Given launch application <"URL">
Then MouseOver on sign in link
Then click sign in
Then enter Email address
Then ebter Password
Then click singin button
Then Verify user succesfully sign in



