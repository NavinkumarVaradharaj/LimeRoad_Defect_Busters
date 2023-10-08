package com.limeroad_Defect_Busters.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunner {
	@RunWith(Cucumber.class)

	@CucumberOptions(features ="D:\\Vaishnavi\\cucumber_pro\\src\\test\\java\\com\\feature\\lime.feature",
	                      glue = "com.stepdef",
	                      monochrome= true,
	                     dryRun=false,
	                     strict= true,
	                      tags = "@tag2",
	                      plugin= {"pretty",
	                    		  "json:Resources/lime.json",
	                    		  "html:Res/limeroad.html",
	                    		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	                      }
	                      )
	public class Runner_class extends Base_class{
		@BeforeClass
		public static void browserLaunch() {
			lauchBrowser("chrome");
		}
		
		
}
