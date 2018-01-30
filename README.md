# Data Republic QA Automation Test

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

============================================== output log reference =====================================================
C:\development\SeleniumJavaProject\seleniumTest>mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building seleniumTest 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ seleniumTe
st ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ seleniumTest --
-
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ se
leniumTest ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\development\SeleniumJavaProject\se
leniumTest\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ seleniu
mTest ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.16:test (default-test) @ seleniumTest ---
[INFO] Surefire report directory: C:\development\SeleniumJavaProject\seleniumTes
t\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Starting ChromeDriver 2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73) on
port 25544
Only local connections are allowed.
1517294721256   geckodriver     INFO    geckodriver 0.19.1
1517294721267   geckodriver     INFO    Listening on 127.0.0.1:45167
1517294721954   mozrunner::runner       INFO    Running command: "C:\\Program Fi
les\\Mozilla Firefox\\firefox.exe" "-marionette" "-profile" "C:\\Users\\xxxxxx\
\AppData\\Local\\Temp\\rust_mozprofile.HmjX5Iw0itJb"
1517294723042   Marionette      INFO    Enabled via --marionette
Jan 30, 2018 5:45:23 PM org.openqa.selenium.remote.ProtocolHandshake createSessi
on
INFO: Detected dialect: OSS
1517294724895   Marionette      INFO    Listening on port 54338
1517294725177   Marionette      WARN    TLS certificate errors will be ignored f
or this session
Jan 30, 2018 5:45:25 PM org.openqa.selenium.remote.ProtocolHandshake createSessi
on
INFO: Detected dialect: W3C
Unable to read VR Path Registry from C:\Users\xxxxx\xxxxx\xx\xx\xxxx
rpaths.vrpath
[Parent 6760, Gecko_IOThread] WARNING: pipe error: 109: file z:/build/build/src/
ipc/chromium/src/chrome/common/ipc_channel_win.cc, line 346
Unable to read VR Path Registry from C:\Users\billxin\AppData\Local\openvr\openv
rpaths.vrpath
[Child 8224, Chrome_ChildThread] WARNING: pipe error: 109: file z:/build/build/s
rc/ipc/chromium/src/chrome/common/ipc_channel_win.cc, line 346
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 35.321 sec - in
TestSuite

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 38.065 s
[INFO] Finished at: 2018-01-30T17:45:55+11:00
[INFO] Final Memory: 13M/217M
[INFO] ------------------------------------------------------------------------

