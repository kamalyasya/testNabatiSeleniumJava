package com.nabati.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = "stepDefinition",
    plugin = {"json:target/cucumber.json"}
)
public class TestRunner {
    
}