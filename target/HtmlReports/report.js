$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/eProtocol.feature");
formatter.feature({
  "name": "Test eProtocol App",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login to eProtocol",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to eProtocol application \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iNavigateToEProtocolApplication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Login functionlaity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC_1"
    }
  ]
});
formatter.step({
  "name": "Enter \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.enterAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"eAnimal Ordering\" button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Procurement Staff\" button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Print Cage Card\" button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select \"Vendor\" checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectCheckbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select \"CHARLES D SULLIVAN\" from \"Vendor\" dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectFromDropdown(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//li[normalize-space()\u003d\u0027CHARLES D SULLIVAN\u0027]\"}\n  (Session info: chrome\u003d124.0.6367.158)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027Mohameds-MacBook-Air.local\u0027, ip: \u00272405:201:e06d:4038:a5b0:257e:2e1c:73ae%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [418194b9c90e610b3d3d9a2d27a8fa5a, findElement {using\u003dxpath, value\u003d//li[normalize-space()\u003d\u0027CHARLES D SULLIVAN\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 124.0.6367.158, chrome: {chromedriverVersion: 124.0.6367.201 (46cf136d27d..., userDataDir: /var/folders/2y/wf5jx2dn2hg...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50990}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:50990/devtoo..., se:cdpVersion: 124.0.6367.158, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 418194b9c90e610b3d3d9a2d27a8fa5a\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\n\tat pages.eProtocol.dynamicClick(eProtocol.java:186)\n\tat pages.eProtocol.selectDropdown(eProtocol.java:108)\n\tat StepDefinitions.eProtocolSteps.iSelectFromDropdown(eProtocolSteps.java:118)\n\tat ✽.I Select \"CHARLES D SULLIVAN\" from \"Vendor\" dropdown(file:///Users/salman/Documents/Selenium/sbafrmwrk/SeleniumCucumberBDD_New/CucumberJava/src/test/resources/Features/eProtocol.feature:15)\n",
  "status": "failed"
});
formatter.step({
  "name": "I Select \"All\" from \"Delivery date\" dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectFromDropdown(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Select \"O-28\" from \"PO Number\" dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectFromDropdown(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Get Cage Cards\" button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Verify the list",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iVerifyTheList()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Select \"all\" checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectCheckbox(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Select \"DMP\" radio button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iSelectRadioButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Print\" button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the PDF",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iVerifyThePDF(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.eProtocolSteps.iCloseTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
});