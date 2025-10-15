package com.lumastore.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentListenerClass implements ITestListener{

	ExtentSparkReporter  htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	public void configureReport()
	{
		ReadConfig readConfig = new ReadConfig(); // ReadConfig class object created to read browser value from 'config.properties' file.
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestReport-" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		
		//add system information/environment info to reports
		report.setSystemInfo("Localhost", "Lenovo PC");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("user", "Vivek");
		report.setSystemInfo("browser:", readConfig.getBrowser());
		
		
		//configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("Extent Listener Report");
		htmlReporter.config().setReportName("Luma Store Extent Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		
	}

	// All the below methods are the abstract methods of ITestListener Interface.
	
	// onStart method is Invoked after the test class is instantiated and before any configuration method is called.
	public void onStart(ITestContext Result)					
	{		
		configureReport();
		System.out.println("On Start method invoked....");  		
	}	

	// onFinish method is called after all Tests are executed
	public void onFinish(ITestContext Result) 					
	{	
		System.out.println("On Finish method invoked....");  	
		report.flush();
		// flush() - Writes test information from the started reporters to their output view.
		// It is mandatory to call flush method to ensure information is written to the started reporter.	
	}		

	
	// When Test case get failed, this method is called.		

	public void onTestFailure(ITestResult Result) 					
	{		
		System.out.println("Name of test method failed:" + Result.getName() );  		
		test = report.createTest(Result.getName());//create entry in HTML report
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + Result.getName(), ExtentColor.RED));
	
	String screenShotPath = System.getProperty("user.dir") + "\\Screenshots\\" + Result.getName() + ".png";
	
	File screenShotFile = new File(screenShotPath);
	
	if(screenShotFile.exists())
	{
		test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
		
	}
	
	//	test.addScreenCaptureFromPath(null)
		
	}		

	// When Test case get Skipped, this method is called.		
	public void onTestSkipped(ITestResult Result)					
	{		
		System.out.println("Name of test method skipped:" + Result.getName() );  		

		test = report.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + Result.getName() ,ExtentColor.YELLOW));
	}			

	// When Test case get Started, this method is called.		

	public void onTestStart(ITestResult Result)					
	{		
		System.out.println("Name of test method started:" + Result.getName() );  		

	}		

	// When Test case get passed, this method is called.		

	public void onTestSuccess(ITestResult Result)					
	{		
		System.out.println("Name of test method sucessfully executed:" + Result.getName() );  		

		test = report.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + Result.getName() ,ExtentColor.GREEN));
	}		


	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	{		

	}		


	
}
