package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

//json - customized JVM report
public class ReportingClass {

	public static void convertJsonToCustomizedJVMReport(String json) {
		// File class- customized JVM Report
		File f = new File("C:\\Users\\Susithrta\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse workspace\\CumcumberSample\\target");
		//configuration - user defined fields
		Configuration con = new Configuration(f, "FaceBook Automation");
		con.addClassifications("sprint", "2.0");
		con.addClassifications("storyNo", "TC23");
		con.addClassifications("TcNo", "23");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("OS", "Windows");
		con.addClassifications("version", "10");
		
		List li = new ArrayList();
		li.add(json);
		
		ReportBuilder reportBuilder = new ReportBuilder(li, con);
		reportBuilder.generateReports();
		
	}
}
