package org.runner;

import org.base.BaseClass;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="org.stepdefinition.belltelme",monochrome=true,
dryRun=false,
tags= {"@E2E"},
plugin= {"pretty:pretty.txt",
       "usage:usage.txt",
       "html:src\\test\\resources\\Reports\\htmlReport",
       "json:src\\test\\resources\\Reports\\jsonrep.json",
       "junit:src\\test\\resources\\Reports\\junitrep.xml",
       "rerun:src\\test\\resources\\failedscenarions.txt"}

		
		
		)
public class TestRunnerBelltelme{

	@AfterClass
	public static void reportgen() {
		JVMReport.generateReport("src\\test\\resources\\Reports\\jsonrep.json");
	System.out.println("ReportGenerated.............");
	}
}
