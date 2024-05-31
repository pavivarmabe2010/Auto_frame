package com.tmb.reports;

import java.awt.Desktop;
import java.io.File;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tmb.constants.FrameworkConstants;

public final class ExtentReport {

	private ExtentReport() {}	

	private static ExtentReports extent;

	public static void initReports() throws Exception {
		if(Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportfilepath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("TMB Report");
			spark.config().setReportName("YouTube Training");
		}
	}

	public static void flushReports() throws Exception {
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentreportfilepath()).toURI());
	}

	public static void createTest(String testcasename) {
		ExtentManager.setExtentTest(extent.createTest(testcasename));
	}
}
