package com.intabella.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "com/intabella/step_definitions",
        tags = "@INN-1492"

)

public class CukesRunner {

}
