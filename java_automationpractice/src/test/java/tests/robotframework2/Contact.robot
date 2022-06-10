*** Settings ***
Library  src.main.java.ui.pageObjects.header.Contact
Library  src.main.java.ui.verifications.Verication
Suite Setup  Suite Setup
Force Tags  Contact_Suite
Library  Collections
Library  String
*** Variables ***
${expectedMessage}  value not found
${expectedCode}  ${404}

*** Test Cases ***
Verify string
     ${aaa}  Generate Random String  length=${5}

Verify collections 1
    @{list}  Create List  1  2  3  4
    FOR  ${i}  IN  ${list}
        Log  ${i}
    END
Verify collections 2
    &{dictionary}  Create Dictionary  key1=val1  key2=val2  key3=val3

    ${val}  Set Variable  ${dictionary['key1']}

Verify Can Navigate To Contact When Using Header Link
    #Assertions.assertTrue(mainHeader.isContactLink(), "contact is not visible");
    ${expectedLinkName}
    verifyContactLinkIsVisible
    #contact = mainHeader.clickOnContactLink();
    verifyUrlIsDisplayed

*** Keywords ***
Suite Setup
    Log  123
    ${var1}  Set Variable  456
    ${var2}  Set Variable  ${456}
    Set Suite Variable  ${var1}
