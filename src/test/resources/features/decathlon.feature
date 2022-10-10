Feature: Decathlon

  I want to use this template for my feature file

  Scenario Outline: All program
    Given I want to write the athletes <name>
    And   I have selected <discipline>
    When  I enter the <result> 
    Then  I verify the <score> for <discipline> and <result>


    Examples:
      | name | | discipline       | result | score  errormessage  |
      |      |    Long Jump"      |    220 |     0 |              |
      |      |   "Long Jump"      |    250 |    16 |              |
      |      |   "Long Jump"      |   1000 |  1606 |              |
      |      |  "Decathlon 100M"  |    250 |    16 |              |
      |      | "Decathlon 100M"   |    220 |     0 |              |
      |      |  "Decathlon 100M"  |   1000 |  1606 |              |
