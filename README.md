
# Objective​:
Create 2 automated test: an End to End and an API.
1.​ ​End​ ​to​ ​End​ ​Automation:
eBay (https://www.ebay.com.au/) is a popular ecommerce web site.
The test consists in searching for 2 different products, add them in the shopping cart and
validate if the shopping cart contains the selected products.
The test must validate the UI in Chrome and Firefox. Tests must be executed in parallel.

# Introduction:
1) run "mvn test" on root path, can be easily integrated with Jenkins, Teamcity and other CI server.
2) run both chrome and firefox browser in parallel (Environment: has chrome and firefox installed)
3) First Ebay test : Ebay search product "google home mini black", add into shopping cart , verify item has been added (chrome browser)
4) Second Ebay test: Ebay search product "nintendo switch console", add into shopping cart , verify item has been added (firefox browser)
5) configure: user can update "testng.xml" to switch browser
6) follow page object pattern
