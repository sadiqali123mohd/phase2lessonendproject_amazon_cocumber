package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
 features =
"C:\\Users\\sadiq\\eclipse-workspace\\phase2lessonendproject\\src\\test\\java\\feature\\amazon.feature",
 glue = "steps"
)
public class TestRunner {
 
} 