package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TS2 - addEmployee.feature",
        glue = "stepDefinitions"
)

public class runaddEmployee {
}
