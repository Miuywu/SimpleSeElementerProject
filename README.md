# SimpleSeElementerProject
## Original Repositories:
SimpleSe:

https://github.com/RationaleEmotions/SimpleSe

Elementer:

https://github.com/email2vimalraj/elementer

## How to use
2. Open up the SimpleSe project
3. Run SimpleSeElementerProject\SimpleSe\src\test\java\amazonTest\amazonBuyTest.java

## AmazonBuyTestSimpleSe..

- Test script is at src/test/java/amazonBuyTest.java
- The test script uses the amazonBuyNow.java and amazonLogin.java classes inside src/main/java/.
- The test operates using page objects created using the ElementerMod Browser Plugin.

## elementerMod..

Modified version of elementer that changes the JSON output.
1. Locator field changed to be the highest priority locator available(id > name > class name > xpath > etc).
2. AllLocatorsList field added which is a List containing every available locator for the current web element.

