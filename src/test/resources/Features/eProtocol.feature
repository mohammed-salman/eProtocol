Feature: Test eProtocol App

  Background: Login to eProtocol
    Given I navigate to eProtocol application "Chrome"


  @TC_1 @C1 @e1
  Scenario Outline: Verify the Vendor functionality "<vendor>"
    When Enter "Username" and "Password"
    And Click Submit Button
    And I click "eAnimal Ordering" button
    And I click "Procurement Staff" button
    And I click "Print Cage Card" button
    And I Select "Vendor" checkbox
    And I Select "<vendor>" from "Vendor" dropdown
    And I Select "<delivery date>" from "Delivery date" dropdown
    And I Select "<PO number>" from "PO Number" dropdown
    And I click "Get Cage Cards" button
    And I Verify the list
    And I Select "all" checkbox
    And I Select "DMP" radio button
    And I click "Print" button
    And I verify the PDF
      |key|
      |  Notify            |
      | Phone              |
      |   Animal Id        |
      |  Investigator       |
      |   Dept              |
      |     Strain          |
      |    Vendor/Age/Wt    |
      |  Delivery Date      |
      |  Protocol #         |
      |  Housing Loc        |
      | Comments :          |
      | PO #                |
      | Order #             |
    Then I close the Browser
    Examples:
      | vendor                                         |delivery date   |PO number    |
      |  All                                           |     Allss        |      O-28   |
#      |  CHARLES D SULLIVAN                            |    All         |      O-28   |
#      |  CHARLES RIVER                                 |    05/10/2024  |      5551234|
#      |  CHARLES RIVER                                 |    05/10/2024  |      5551234|
#      |  CHARLES RIVER - NCI (National Cancer Institute) |     12/17/2019 |   PO-#####  |



  @TC_2
  Scenario Outline: Verify the PI dropdown "<PI>"
    When Enter "Username" and "Password"
    And Click Submit Button
    And I click "eAnimal Ordering" button
    And I click "Procurement Staff" button
    And I click "Print Cage Card" button
    And I Select "PI" checkbox
    And I Select "<PI>" from "PI" dropdown
    And I Select "<protocol>" from "Protocol" dropdown
    And I Select "<Barcode>" from "PO Number" dropdown
    And I click "Get Cage Cards" button
    And I Verify the list
    And I Select "all" checkbox
    And I Select "DMP" radio button
    And I click "Print" button
    And I verify the PDF

      |key|
      |  Notify            |
      | Phone              |
      |   Animal Id        |
      |  Investigator       |
      |   Dept              |
      |     Strain          |
      |    Vendor/Age/Wt    |
      |  Delivery Date      |
      |  Protocol #         |
      |  Housing Loc        |
      | Comments :          |
      | PO #                |
      | Order #             |
    Then I close the Browser
    Examples:
      | PI                                         |protocol            |Barcode    |
      |  All                                       |     All        |         |
      |  All                                       |    19-1077         |     0000004494   |
      |  All                                       |    19-1077         |     0000004494   |

  @TC_3
  Scenario Outline: Verify the Vendor and PI dropdown <vendor>
    When Enter "Username" and "Password"
    And Click Submit Button
    And I click "eAnimal Ordering" button
    And I click "Procurement Staff" button
    And I click "Print Cage Card" button
    And I Select "PI" checkbox
    And I Select "Vendor" checkbox
    And I Select "<vendor>>" from "PI" dropdown
    And I Select "<PI>>" from "PI" dropdown
    And I Select "<protocol>" from "Protocol" dropdown
    And I Select "<Barcode>" from "PO Number" dropdown
    And I click "Get Cage Cards" button
    And I Verify the list
    And I Select "all" checkbox
    And I Select "DMP" radio button
    And I click "Print" button
    And I verify the PDF

      |key|
      |  Notify            |
      | Phone              |
      |   Animal Id        |
      |  Investigator       |
      |   Dept              |
      |     Strain          |
      |    Vendor/Age/Wt    |
      |  Delivery Date      |
      |  Protocol #         |
      |  Housing Loc        |
      | Comments :          |
      | PO #                |
      | Order #             |
    Then I close the Browser
    Examples:
    |  vendor| PI                                         |protocol            |Barcode    |
    |All     |  All                                       |     All        |         |
    |All     |  All                                       |    19-1077         |     0000004494   |
    |All     |  All                                       |    19-1904         |        |


  @TC_4
  Scenario Outline: Verify the multi filter dropwdown functionlaity
    When Enter "Username" and "Password"
    And Click Submit Button
    And I click "eAnimal Ordering" button
    And I click "Procurement Staff" button
    And I click "Print Cage Card" button
    And I Select "PI" checkbox
    And I Select "Vendor" checkbox
#    And I Select "PI" checkbox
    And I Select "Location" checkbox
    And I Select "Species" checkbox
    And I Select "<vendor>" from "Vendor" dropdown
    And I Select "<PI>" from "PI" dropdown
    And I Select "<Location>" from "Location" dropdown
    And I Select "<Species>" from "Species" dropdown
#    And I Select "<protocol>" from "Protocol" dropdown
#    And I Select "<Barcode>" from "PO Number" dropdown
    And I click "Get Cage Cards" button
    And I Verify the list
    And I Select "all" checkbox
    And I Select "DMP" radio button
    And I click "Print" button
    And I verify the PDF

      |key|
      |  Notify            |
      | Phone              |
      |   Animal Id        |
      |  Investigator       |
      |   Dept              |
      |     Strain          |
      |    Vendor/Age/Wt    |
      |  Delivery Date      |
      |  Protocol #         |
      |  Housing Loc        |
      | Comments :          |
      | PO #                |
      | Order #             |
    Then I close the Browser
    Examples:
      |  vendor| PI                                         |Location            |Species    |
      |All     |  All                                       |     MEDICAL        |      Cat   |
      |All     |  All                                       |    All        |     0000004494   |
      |All     |  Admin, KSI                                |    All         |      Cat  |


  @TC_6 @C1
  Scenario Outline: Verify the PDF content for the specific filter
    When Enter "Username" and "Password"
    And Click Submit Button
    And I click "eAnimal Ordering" button
    And I click "Procurement Staff" button
    And I click "Print Cage Card" button
    And I Select "PI" checkbox
    And I Select "Vendor" checkbox
#    And I Select "PI" checkbox
    And I Select "Location" checkbox
    And I Select "Species" checkbox
    And I Select "<vendor>" from "Vendor" dropdown
    And I Select "<delivery date>" from "Delivery date" dropdown
    And I Select "<PO number>" from "PO Number" dropdown
    And I Select "<PI>" from "PI" dropdown
    And I Select "<Protocol>" from "Protocol" dropdown
    And I Select "<Barcode>" from "barcode" dropdown
    And I Select "<Location>" from "Location" dropdown
    And I Select "<Species>" from "Species" dropdown
    And I Select "No" radio button
#    And I Select "<protocol>" from "Protocol" dropdown
#    And I Select "<Barcode>" from "PO Number" dropdown
    And I click "Get Cage Cards" button
    And I Verify the list
    And I Select "all" checkbox
    And I Select "DMP" radio button
    And I click "Print" button
    And I verify the PDF

      |key|
      |  Notify :Krall, Bonita          |
      | Phone : 5104564500             |
      |   Animal Id : 0  0  0  0  0  0  5  7  8  9        |
#      |  Investigator : Seven, Tester       |
      |   Dept : Engineering 229              |
#      |     Strain : Test         |
#      |    Vendor/Age/Wt : CHARLES RIVER/20-30D/20-30Lb   |
#      |  Delivery Date : 05/09/2024      |
#      |  Protocol # : 23-01-002        |
#      |  Housing Loc : 4511FP/000H4        |
#      | Comments :          |
#      | PO # : 879               |
#      | Order # : O-000000191            |
    Then I close the Browser
    Examples:
      |  vendor          | PI               |Protocol  |Location            |Species    |delivery date|PO number|Barcode     |
      |CHARLES RIVER     |  Seven, Tester   |23-01-002 |    MEDICAL        |      All  |05/09/2024   |  879    |  0000005789|
