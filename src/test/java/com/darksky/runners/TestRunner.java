package com.darksky.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"pretty",
                "html:target/site/cucumber-pretty.html",
                "json:target/cucumber-html-reports/cucumber.json",
                "junit:target/cucumber-xml-reports/cucumber.xml"},

        features = {"src/test/resources/features"},
        // path for future
        glue = {"com/saucelabs/stepdefinitions"}, //get the source root
        tags = "@login",
        monochrome = true, //makes the console output different
        dryRun = true //without running the browser, checks if there is a step which is not declared
)

public class TestRunner {



}

