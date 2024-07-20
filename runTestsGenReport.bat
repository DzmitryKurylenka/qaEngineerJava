mvn clean test
allure generate target/allure-results -o target/allure-report
allure open target/allure-report