package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterEndToEnd {

	public WebDriver driver;


	//Dynamic variables

	String firstNameValue="Pavan Kumar";
	String lastNameValue="Reddy";
	String streetAddressValue="Banaganapalli, Kurnool, Andhrapradesh";
	String aptNoValue="4-56/2";
	String stateValue="Andhra Pradesh";
	String cityValue="Banaganapalli";
	String pinCoddValue="518124";
	String countryValue="India";
	String emailIDValue="pavankumarreddy418@gmail.com";
	String dateOfDemoValue="01/01/2023";
	String hhValue="07";
	String mmValue="30";
	String mobileNumberValue= "7416410620";
	String enterYourQueryValue=" No Query's as per Now! Thank's";
	String expectedTitle="Demo Site – Registration Form – NxtGen A.I Academy";
	String expectedHeading="Register For Demo";
	String expectedSuccessfullMsg="Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465";

	@Test(priority = 1)

	public void launchApplication() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe" );

		driver=new ChromeDriver();
		String url="https://nxtgenaiacademy.com/";

		//Lunch URL
		driver.get(url);

		//MaxiMize the screen
		driver.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void navigateToRegistrationForm() {

		//Mousehover
		Actions action=new Actions(driver);

		WebElement qaAutomation=driver.findElement(By.xpath("//*[text()='QA Automation']"));
		action.moveToElement(qaAutomation).perform();


		WebElement practiceAutomation=driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		WebElement registrationFormDemo = driver.findElement(By.partialLinkText("Registration Form"));
		action.moveToElement(registrationFormDemo).perform();
		registrationFormDemo.click();
		

	}
	@Test(priority = 3)
	public void inputValuesAndValidation() {

		//Title
		String actualtitle=driver.getTitle();	
		if(actualtitle.equals(expectedTitle)) {
			Reporter.log("The Actual Title is equals to Expected Title ");
			Reporter.log("The Actual Title is :"+actualtitle);
		}
		else
		{
			Reporter.log("The Actual Title is not equals to Expected Title");
			Reporter.log("The Actual Title  is :"+actualtitle);
			Reporter.log("The Expected Title is :"+expectedTitle);
		}


		//Heading

		WebElement actualHeadingValue=driver.findElement(By.xpath("//*[text()='Register For Demo']"));
		String actualHeading =actualHeadingValue.getText();

		if(actualHeadingValue.isDisplayed()) {
			Reporter.log("The Heading of the form is Displayed");      
			Reporter.log("The Heading of the form is :"+actualHeading);
		}
		else
		{
			Reporter.log("The Heading of the form is not Displayed");
			Reporter.log("The Actual Heading is Disaplay "+actualHeading);
			Reporter.log("The Expected Heading is Disaplay "+expectedHeading);
		}

		//FirstName
		WebElement firstName=driver.findElement(By.xpath("//input[@id='vfb-5']"));


		// Verify the First name is Displayed
		if(firstName.isDisplayed()) {
			Reporter.log("First Name is Displayed");

		}
		else
		{
			Reporter.log("First Name is not Displayed");
		}

		// Verify the First name isEnabled
		if(firstName.isEnabled()) {
			Reporter.log("The First Name field is Enabled");
			firstName.sendKeys(firstNameValue);
			Reporter.log("First Name is :"+firstNameValue);
		}
		else
		{
			Reporter.log("The First Name field is not Enabled");
		}

		//LastName
		WebElement lastName=driver.findElement(By.xpath("//input[@id='vfb-7']"));

		// Verify the Last name is Displayed
		if(lastName.isDisplayed()) {
			Reporter.log("Last Name is Displayed");

		}
		else
		{
			Reporter.log("Last Name is not Displayed");
		}

		// Verify the Last name isEnabled
		if(lastName.isEnabled()) {
			Reporter.log("The Last Name field is Enabled");
			lastName.sendKeys(lastNameValue);
			Reporter.log("Last Name is :"+lastNameValue);
		}
		else
		{
			Reporter.log("The Last Name field is not Enabled");
		}

		//Gender

		WebElement gender=driver.findElement(By.xpath("//input[@id='vfb-8-1']"));

		// Verify the Gender Name is Displayed
		if(gender.isDisplayed()) {
			Reporter.log("Gender is Displayed");

		}
		else
		{
			Reporter.log("Gender is not Displayed");
		}

		// Verify the Gender Name isEnabled
		if(gender.isEnabled()) {
			Reporter.log("The Gender field is Enabled");

			// Verify the Gender Name isSelected
			if(gender.isSelected()) {
				Reporter.log("The Gender field is not Selected");
			}
			else
			{
				Reporter.log("The Gender field is Selected");
				gender.click();
				WebElement genderSelected=driver.findElement(By.xpath("//label[@for='vfb-8-1']"));
				String genderMale=genderSelected.getText();
				Reporter.log("The Gender Selected is :"+genderMale);
			}

		}
		else
		{
			Reporter.log("The Gender field is not Enabled");
		}



		//Address
		WebElement streetAddress=driver.findElement(By.xpath("//input[@id='vfb-13-address']"));

		// Verify the Address is Displayed
		if(streetAddress.isDisplayed()) {
			Reporter.log("Address is Displayed");

		}
		else
		{
			Reporter.log("Address is not Displayed");
		}

		// Verify the Address isEnabled
		if(streetAddress.isEnabled()) {
			Reporter.log("The Address field is Enabled");
			streetAddress.sendKeys(streetAddressValue);
			Reporter.log("The Address is :"+ streetAddressValue);

		}
		else
		{
			Reporter.log("The Address field is not Enabled");
		}


		WebElement aptNo=driver.findElement(By.xpath("//input[@id='vfb-13-address-2']"));
		aptNo.sendKeys(aptNoValue);

		// Verify the AptNo is Displayed
		if(aptNo.isDisplayed()) {
			Reporter.log("AptNo is Displayed");

		}
		else
		{
			Reporter.log("AptNo is not Displayed");
		}

		// Verify the AptNo isEnabled
		if(aptNo.isEnabled()) {
			Reporter.log("The AptNo field is Enabled");
			aptNo.sendKeys(aptNoValue);
			Reporter.log("The AptNo is :"+ aptNoValue);

		}
		else
		{
			Reporter.log("The AptNo field is not Enabled");
		}

		WebElement city=driver.findElement(By.xpath("//input[@id='vfb-13-city']"));

		// Verify the City is Displayed
		if(city.isDisplayed()) {
			Reporter.log("City is Displayed");

		}
		else
		{
			Reporter.log("City is not Displayed");
		}

		// Verify the City isEnabled
		if(city.isEnabled()) {
			Reporter.log("The City field is Enabled");
			city.sendKeys(cityValue);
			Reporter.log("The City is :"+ cityValue);

		}
		else
		{
			Reporter.log("The City field is not Enabled");
		}

		WebElement sate=driver.findElement(By.xpath("//input[@id='vfb-13-state']"));


		// Verify the State is Displayed
		if(sate.isDisplayed()) {
			Reporter.log("State is Displayed");

		}
		else
		{
			Reporter.log("State is not Displayed");
		}

		// Verify the State isEnabled
		if(sate.isEnabled()) {
			Reporter.log("The State field is Enabled");
			sate.sendKeys(stateValue);
			Reporter.log("The State is :"+ stateValue);

		}
		else
		{
			Reporter.log("The State field is not Enabled");
		}

		WebElement pinCode=driver.findElement(By.xpath("//input[@id='vfb-13-zip']"));

		// Verify the Pin Code is Displayed
		if(pinCode.isDisplayed()) {
			Reporter.log("Pin Code is Displayed");

		}
		else
		{
			Reporter.log("Pin Code is not Displayed");
		}

		// Verify the Pin Code isEnabled
		if(pinCode.isEnabled()) {
			Reporter.log("The Pin Code field is Enabled");
			pinCode.sendKeys(pinCoddValue);
			Reporter.log("The Pin Code is :"+ pinCoddValue);

		}
		else
		{
			Reporter.log("The Pin Code field is not Enabled");
		}

		WebElement country = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));

		// Verify the Country is Displayed

		if(country.isDisplayed()) {
			Reporter.log("Country is Displayed");

		}
		else
		{
			Reporter.log("Country is not Displayed");
		}

		// Verify the Country isEnabled
		if(country.isEnabled()) {
			Reporter.log("The Country field is Enabled");
			Select countryDD=new Select(country);
			countryDD.selectByValue(countryValue);
			Reporter.log("The Country field is :"+ countryValue);

		}
		else
		{
			Reporter.log("The Country field is not Enabled");
		}


		//Email
		WebElement email=driver.findElement(By.xpath("//input[@id='vfb-14']"));

		// Verify the Email is Displayed
		if(email.isDisplayed()) {
			Reporter.log("Email is Displayed");

		}
		else
		{
			Reporter.log("Email is not Displayed");
		}

		// Verify the Email isEnabled
		if(email.isEnabled()) {
			Reporter.log("The Email ID field is Enabled");
			email.sendKeys(emailIDValue);

			Reporter.log("The Email ID is :"+ emailIDValue);

		}
		else
		{
			Reporter.log("The Email ID field is not Enabled");
		}

		//Date of demo
		WebElement dateOfDemo=driver.findElement(By.xpath("//input[@id='vfb-18']"));


		// Verify the Date of Demo is Displayed
		if(dateOfDemo.isDisplayed()) {
			Reporter.log("Date Of Demo is Displayed");

		}
		else
		{
			Reporter.log("Date Of Demo is not Displayed");
		}

		// Verify the Date of Demo isEnabled
		if(dateOfDemo.isEnabled()) {
			Reporter.log("The Date Of Demo field is Enabled");
			dateOfDemo.sendKeys(dateOfDemoValue);

			Reporter.log("The Date Of Demo is :"+ dateOfDemoValue);

		}
		else
		{
			Reporter.log("The Date Of Demo field is not Enabled");
		}
		//Convenient Time
		WebElement convenientTimeHours=driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
		// Verify the Convenient Time is Displayed
		if(convenientTimeHours.isDisplayed()) {
			Reporter.log("Convenient Time Hours is Displayed");

		}
		else
		{
			Reporter.log("Convenient Time Hours is not Displayed");
		}

		// Verify the Convenient Time isEnabled
		if(convenientTimeHours.isEnabled()) {
			Reporter.log("The Convenient Time Hours field is Enabled");

			// Verify the Convenient Time isSelected
			if(convenientTimeHours.isSelected()) {
				Reporter.log("The Convenient Time Hours field is not Selected");
			}
			else {
				Reporter.log("The Convenient Time Hours field is Selected");
				Select hours=new Select(convenientTimeHours);
				hours.selectByValue(hhValue);
				Reporter.log("The Convenient Time Hours is "+hhValue );
			}

		}
		else
		{
			Reporter.log("The Convenient Time Hours field is not Enabled");
		}

		//Convenient Time
		WebElement convenientTimeMinutes=driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
		// Verify the Convenient Time is Displayed
		if(convenientTimeMinutes.isDisplayed()) {
			Reporter.log("Convenient Time Minutes is Displayed");

		}
		else
		{
			Reporter.log("Convenient Time Minutes is not Displayed");
		}

		// Verify the Convenient Time isEnabled
		if(convenientTimeMinutes.isEnabled()) {
			Reporter.log("The Convenient Time Minutes field is Enabled");

			// Verify the Convenient Time isSelected
			if(convenientTimeMinutes.isSelected()) {
				Reporter.log("The Convenient Time Minutes field is not Selected");
			}
			else {
				Reporter.log("The Convenient Time Minutes field is Selected");
				Select minutes=new Select(convenientTimeMinutes);
				minutes.selectByValue(mmValue);
				Reporter.log("The Convenient Time Minutes is "+mmValue );
			}

		}
		else
		{
			Reporter.log("The Convenient Time Minutes field is not Enabled");
		}

		//Mobile Number

		WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='vfb-19']"));

		// Verify the Mobile is Displayed

		if(mobileNumber.isDisplayed()) {
			Reporter.log("Mobile Number is Displayed");

		}
		else
		{
			Reporter.log("Mobile Number is not Displayed");
		}

		// Verify the Mobile is Enabled
		if(mobileNumber.isEnabled()) {
			Reporter.log("The Mobile Number field is Enabled");
			mobileNumber.sendKeys(mobileNumberValue);

			Reporter.log("The Mobile Number is :"+ mobileNumberValue);

		}
		else
		{
			Reporter.log("The Mobile Number field is not Enabled");
		}


		//Course Interested

		WebElement courseInterestedUFT =driver.findElement(By.xpath("//input[@id='vfb-20-1']"));


		// Verify the Course InterestedUFT is Displayed

		if(courseInterestedUFT.isDisplayed()) {
			Reporter.log("Course Interested UFT is Displayed");

		}
		else
		{
			Reporter.log("Course Interested UFT is not Displayed");
		}

		// Verify the course Interested UFT is Enabled
		if(courseInterestedUFT.isEnabled()) {
			Reporter.log("The Course Interested UFT field is Enabled");

			// Verify the Course Interested is Selected 
			if(courseInterestedUFT.isSelected()) {
				Reporter.log("The Course Interested UFT field is not Selected");
			}
			else {
				Reporter.log("The Course Interested field is Selected");
				courseInterestedUFT.click();
				WebElement course1=driver.findElement(By.xpath("//label[@for='vfb-20-1']"));
				String courseSelected1=course1.getText();

				Reporter.log("The Course Interested  is :"+courseSelected1);
			}
		}
		else
		{
			Reporter.log("The Course Interested UFT field is not Enabled");
		}


		WebElement courseInterestedTestNG =driver.findElement(By.xpath("//input[@id='vfb-20-2']"));

		// Verify the cousreInterested TestNG is Displayed
		if(courseInterestedTestNG.isDisplayed()) {
			Reporter.log("Course Interested TestNG is Displayed");

		}
		else
		{
			Reporter.log("Course Interested TestNG is not Displayed");
		}
		if(courseInterestedTestNG.isEnabled()) {
			Reporter.log("The Course Interested TestNG field is Enabled");

			// Verify the Course Interested is Selected 
			if(courseInterestedTestNG.isSelected()) {
				Reporter.log("The Course Interested TestNG field is not Selected");
			}
			else {
				Reporter.log("The Course Interested TestNG field is Selected");
				courseInterestedTestNG.click();
				WebElement course2=driver.findElement(By.xpath("//label[@for='vfb-20-2']"));
				String courseSelected2=course2.getText();
				Reporter.log("The Courses Interested  is :"+courseSelected2);
			}
		}
		else
		{
			Reporter.log("The Course Interested TestNG field is not Enabled");
		}

		//Enter your query
		WebElement enterYourQuery=driver.findElement(By.xpath("//textarea[@id='vfb-23']"));

		// Verify the Enter your query is Displayed

		if(enterYourQuery.isDisplayed()) {
			Reporter.log("Enter Your Query is Displayed");

		}
		else
		{
			Reporter.log("Enter Your Query is not Displayed");
		}

		// Verify the Enter your query is Enabled
		if(enterYourQuery.isEnabled()) {
			Reporter.log("The Enter Your Query field is Enabled");
			enterYourQuery.sendKeys(enterYourQueryValue);

			Reporter.log("The Enter Your Query is :"+ enterYourQueryValue);

		}
		else
		{
			Reporter.log("The Enter Your Query field is not Enabled");
		}


		//Verification
		WebElement verificationCode=driver.findElement(By.xpath("//*[contains(text(),'Example:')]"));

		// Verify the Verification is Displayed
		if(verificationCode.isDisplayed()) {
			Reporter.log("Verification Code is Displayed");


			// Verify the Verification is Enabled
			if(verificationCode.isEnabled()) {
				Reporter.log("The Verification Code field is Enabled");
				String example=verificationCode.getText();

				String[] twoDigits=example.split(":");

				WebElement verification=driver.findElement(By.xpath("//input[@id='vfb-3']"));

				String number=twoDigits[1].trim();

				verification.sendKeys(number);

				Reporter.log("The Verification Code is :"+ number);
			}
		}
		else
		{
			Reporter.log("The Verification Code field is not Enabled");
		}


		//Submit Button
		WebElement submiteButton=driver.findElement(By.xpath("//input[@id='vfb-4']"));

		// Verify the Submit Button is Displayed

		if(submiteButton.isDisplayed()) {
			Reporter.log("Submite Button is Displayed");

			//Verify the Submit Button is Enabled

			if(submiteButton.isEnabled()) {
				Reporter.log("The Submite Button is Enabled");
				submiteButton.click();
			}
			else
			{
				Reporter.log("The Submite Button is not Enabled");
			}

		}
		else
		{
			Reporter.log("Submite Button is not Displayed");
		}

	}

	@Test(priority = 4)

	public void outputCompression() {

		//Output Compression

		WebElement actualOutput=driver.findElement(By.xpath("//*[contains(text(),'Registration Form is Successfully Submitted')]"));
		String actualMsg=actualOutput.getText();

		// Verify the  Registration Form is Displayed

		if(actualOutput.isDisplayed()) {
			Reporter.log("The Registration Form is Displayed");
			if(actualMsg.contains(expectedSuccessfullMsg)) {
				Reporter.log("The Registration Form is Successfully Submitted");
				String[] msg=actualMsg.split(":");
				Reporter.log("The Expected Message is :"+expectedSuccessfullMsg);
				Reporter.log("The Actual Message is :"+actualMsg );
				Reporter.log("The Transaction ID is :"+msg[1]);
			}
			else 
			{
				Reporter.log("The Registration Form is not Successfully Submitted");
				Reporter.log("The Actual Successfull Message is :"+actualMsg );
				Reporter.log("The Expected Successfull Message is :"+expectedSuccessfullMsg);
			}

		}
		else
		{
			Reporter.log("The Registration Form is Successfully is not Displayed");

		}
	}
	@Test(priority = 5)
	public void closeApplication() {

		//Close the application
		driver.close();
		Reporter.log("Apllication is Successfully Closed!");
	}

}
