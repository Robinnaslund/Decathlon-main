Feature: Decathlon

  I want to use this template for my feature file

  Scenario Outline: All program
    Given I want to write the athletes <name>
    And   I have selected <discipline>
    When  I enter the <result> 
    Then  I verify the <score> for <discipline> and <result>


    Examples:
      | name    | | discipline       | result | score | errormessage |
      |Dunia    |    Long Jump"      |    220 |     0 |              |
      |Tommi    |   "Long Jump"      |    250 |    16 |              |
      |Camilla  |   "Long Jump"      |   1000 |  1606 |              |
      |Robin    |  "Decathlon 100M"  |    250 |    16 |              |
      |Bella    | "Decathlon 100M"   |    220 |     0 |              |
      |Christer |  "Decathlon 100M"  |   1000 |  1606 |              |
