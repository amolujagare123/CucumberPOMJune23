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
        | John Doe   | 123 Main Street    | 555-1234 | 555-5678 |
        | Jane Smith | 456 Elm Avenue     | 555-9876 | 555-4321 |
        | Alex Chen  | 789 Oak Lane       | 555-2468 | 555-1357 |
        | Lisa Wong  | 321 Pine Boulevard | 555-8642 | 555-7913 |
        | Mark Davis | 987 Maple Drive    | 555-3197 | 555-6284 |



