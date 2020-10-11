package timhortons.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"features/calorieMatch.feature"}, glue ={"timhortons.steps"})

public class calorieMatchTest {}
