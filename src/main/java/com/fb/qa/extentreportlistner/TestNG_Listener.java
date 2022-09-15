package com.fb.qa.extentreportlistner;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener {
	@Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test case is failed and name of that test case : "+ result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test case is skipped and name of that test case : "+ result.getName());
    }
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test case is started and name of that test case : "+ result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test case is Passed and name of that test case : "+ result.getName());
    }
}