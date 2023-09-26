package org.stepdefinition.belltelme;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.BeforeClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
    @Before()
	public void BeforeScenario() {

		chromebrowser();
		urllaunch("https://belltelme.om/");
		maximize();
		implicitywait(20);
	}
	@After()
	public void AfterScenario(Scenario sc) throws IOException {

		System.out.println(".....AfterScenario....");
		System.out.println("ending................."+new Date());
		if (sc.isFailed()) {
			screenshotwithbyte(sc);
		}
	}
}
