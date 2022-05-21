package org.login;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.ReportingClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\src\\test\\resources\\FacebookLogin.feature",
                    glue = "org.stepDefinition",
                    dryRun = false,
                    monochrome= true,
                    snippets=SnippetType.CAMELCASE,
                 //   plugin="html:C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\target")
                  //   plugin="junit:C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\target\\output.xml")
                    plugin = "json:C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\target\\outputjson.json")

public class TestRunnerClass {

	@AfterClass
	public static void tc0() {
		ReportingClass.convertJsonToCustomizedJVMReport("C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\target\\outputjson.json");
		
	}
	
}
