package com.MovieStructure.MovieStructure;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources",
        glue = "StepDef" )


public class RunCucumberTest {
}
