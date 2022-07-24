Feature: Contact feature
sasaas
    asasaasas

#Background:
#    Given Login to Page

@bdd @regression @deleteUser
#Scenario: titulo 1
    #Given navigate to contact page
    #When fill contact information with following data:
    #|Field|Value|
    #|name |randomName|
    #Then click 'contactUs' button
    #Then confirmation message 'is not' displayed
    #And confirmation message 'is' displayed
    #When User Selects "aaa", "qqqq", "2" and "2"

Scenario Outline:  titulo 2
    Given navigate to contact page
    And On Contact page, click header
    When fill contact information with following data:
    |ORDER_REFERENCE|MESSAGE|EMAIL_ADDRESS|SUBJECT_HEADING|
    |<orderReference>|<message>|asda@asds.com|<subjectHeading>|
    #Then click 'submit' button
    #And confirmation message 'is' displayed
    #Then On Contact page, validate the following values are displayed:
    Then On Contact page, the following values are displayed:
        |ORDER_REFERENCE|MESSAGE|EMAIL_ADDRESS|SUBJECT_HEADING|
        |<orderReference>|<message>|asda@asds.com|<subjectHeading>|
    #Then On Contact page, validate last saved values values are displayed:

    Examples:
        |testid|orderReference|message|subjectHeading|
        |tc1|reference1 |message1|Webmaster          |
        |tc2|reference2 |message2|Customer service   |