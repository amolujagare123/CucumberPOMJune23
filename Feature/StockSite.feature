Feature: stock management application scenarios


  Background: user is logged in
    Given stock user url is opened
    And user does login

    @addCustomer
    Scenario Outline: user adds multiple records of client
      Given user is on add customer page
      When user adds <name>,<address>,<contact1>,<contact2>
      Then user should be added successfully
      Examples:
        | name       | address            | contact1 | contact2 |
        | John Doe   | 123 Main Street    | 5551234  | 5555678  |
        | Jane Smith | 456 Elm Avenue     | 5559876  | 5554321  |
        | Alex Chen  | 789 Oak Lane       | 5552468  | 5551357  |
       | Lisa Wong  | 321 Pine Boulevard | 5558642  | 5557913  |
        | Mark Davis | 987 Maple Drive    | 5553197  | 5556284  |



