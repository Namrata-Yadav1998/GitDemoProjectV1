package StepsDefinitonsRandom;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackGroundDemo",
glue= {"StepsForBackGround"},
monochrome= true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
"json:target/JSONReport/report.json",
"html:target/HtmlReports"}
////tags="@Test1"
		)
public class TestRunnerForBackGroundDemo {

}
