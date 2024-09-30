package StepsDefinitonsRandom;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"StepsDefinitonsRandom"},
//monochrome= true,
//plugin={"pretty","junit:target/JUnitReports/report.xml",
//"json:target/JSONReport/report.json",
//"html:target/HtmlReports"},
tags="@Smoke and @regression"

		)

public class RandomTestRunner_RunWithTags {

}


//plugin={"pretty","json:target/JSONReport/report.json"}

//plugin={"pretty","html:target/HtmlReports"}
// plugin={"pretty","junit:target/JUnitReports/report.xml"}

