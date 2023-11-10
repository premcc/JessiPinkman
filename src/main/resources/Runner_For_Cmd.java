import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/OrangeHRM.feature",glue = "Step_Definitions.Class_For_Cmd.java",monochrome = true,
plugin = {"pretty","html:target/CMDrepo/repo.html"})
public class Runner_For_Cmd {

}
