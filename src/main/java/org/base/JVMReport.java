package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	public static void generateReport(String json) {
           //file location
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
	    
		//some config if we want
		Configuration con=new Configuration(loc, "Belltelme");
	    con.addClassifications("Windows", "10");
	    con.addClassifications("Browser", "Chrome");
	    con.addClassifications("Sprint", "20");
	    con.addClassifications("Version", "107");
	    con.addClassifications("project", "belltelme");
	    
	    //add to list
	    List<String> jsons=new LinkedList<String>();
	    jsons.add(json);
	    
	    //Generate Report
	    ReportBuilder rb=new ReportBuilder(jsons, con);
	    rb.generateReports();
	    
	    
	    
	}

}
