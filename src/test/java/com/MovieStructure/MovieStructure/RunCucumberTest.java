package com.MovieStructure.MovieStructure;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources",
        glue = "src/test/java/com/MovieStructure/MovieStructure/AddFilmTest.java" )
public class RunCucumberTest {
}
