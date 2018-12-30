package com.tt.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features"},
		glue = {"com.tt.StepDef"},
		tags = {"@sampleFeature"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
