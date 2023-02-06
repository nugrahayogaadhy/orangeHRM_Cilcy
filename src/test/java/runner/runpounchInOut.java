package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TS 4 - punchIn punchOut.feature",
        glue = "stepDefinitions"
)

public class runpounchInOut {
}