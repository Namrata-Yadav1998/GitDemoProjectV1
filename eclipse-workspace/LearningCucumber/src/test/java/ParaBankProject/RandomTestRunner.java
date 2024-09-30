package ParaBankProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/ParaBankFolder/ParaBank.feature",
glue= {"ParaBankProject"},
monochrome= true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
"json:target/JSONReport/report.json",
"html:target/HtmlReports"},
tags="@Test3"
		)

public class RandomTestRunner {

}


//plugin={"pretty","json:target/JSONReport/report.json"}

//plugin={"pretty","html:target/HtmlReports"}
// plugin={"pretty","junit:target/JUnitReports/report.xml"}

