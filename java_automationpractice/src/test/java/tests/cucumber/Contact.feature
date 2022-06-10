Feature: Contact feature
sasaas
    asasaasas

Background:
    Given Login to Page

@bdd @regression @deleteUser
Scenario: titulo 1
    Given navigate to contact page
    When fill contact information with following data:
    |Field|Value|
    |name |randomName|
    And click submit button
    Then confirmation message 'is' displayed

Scenario Outline:  titulo 2
    Given navigate to contact page
    And On Contact page, click header
    When fill contact information with following data:
    |Field|Value|
    |<field> |<Value1>|
    And click 'submit' button
    Then confirmation message is displayed

    Examples:
        |testid|field|Value|
        |tc1|name |name1|
        |tc2|name |name2|
        |tc3|name |name3|
        |tc4|name |name4|