package com.tmb.constants;

public class Notes {

	
	//never hardcode
	//keep the thing in right place 

	//Class or interface name -> RaviSeleniumTesting 
	//Final constants values -> RAVIVSELENIUMTESTING or  RAVI_SELENIUM_TESTING
	//method name -> raviSeleniumTesting 
	//package name -> raviseleniumtesting 
	//method access modifier -> Try to use private,prodcted,defalut --- no cases then use "public"
	
	Short vut keys
	Control+A+I    	 - > 	 Aglinment code 
	Contorl+Shift+O	 - >	 Remove unused imports from class 
	Contorl+D        - >     Entire line will be removed
	
Understanding Thread Safety Issues
	1.My test scripts working fine when running sequentially but failing when ran in parallel.Have you faced this issue? What is causing this issue?
	2.All local variables of primitive types are stored in thread stack 
	itself
	3.All local variables of non primitive types are stored stack itself  but the objects itself in heap
	4.An objects member variable is stored in heap along with the object it self.(primitive and Reference).If the thread has access to object, it also has access to its members
	5.Static class variables are also stroed in the heap

New page validation
	Validate whether the title is contains Google Search or google search
	Validate whether the title is not null and length of title is geater than 15 and less than 100
	check for the links in the page -> test mini bytes - youtube
	number of links displayed is exactly 10 or 15 
	
}
