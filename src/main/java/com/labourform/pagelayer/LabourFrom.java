package com.labourform.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labourform.baselayer.TestBase;

public class LabourFrom extends TestBase {
	@FindBy(xpath = "//input[@id='mui-1']")
	private WebElement search_employee_name_and_id_textBox;
	@FindBy(xpath = "(//button)[1]")
	private WebElement search_employee_button;
	@FindBy(xpath = "//input[@id='mui-2']")
	private WebElement addhar_number_textBox;
	@FindBy(xpath = "(//span[text()='Click to upload'])[1]")
	private WebElement upload_adhar_card_button;
	@FindBy(xpath = "//input[@id='mui-3']")
	private WebElement name_textBox;
	@FindBy(xpath = "//input[@id='mui-4']")
	private WebElement father_or_husband_name_textBox;
	@FindBy(xpath = "//input[@value='MALE']")
	private WebElement MALE_radioButton;
	@FindBy(xpath = "//input[@value='FEMALE']")
	private WebElement FEMALE_radioButton;
	@FindBy(xpath = "(//div[@tabindex='0'])[1]")
	private WebElement maritalStatus_dropdown;
	@FindBy(xpath = "//li[text()='Single']")
	private WebElement single_maritalStatusDropdown_option;
	@FindBy(xpath = "//input[@id='mui-5']")
	private WebElement contact_number_textBox;
	@FindBy(xpath = "//input[@id='mui-6']")
	private WebElement emergency_contact_number_textBox;
	@FindBy(xpath = "//input[@id='mui-7']")
	private WebElement address_textBox;
	@FindBy(xpath = "//input[@id='mui-8']")
	private WebElement dateOfBirth_dropdown;
	@FindBy(xpath = "//input[@id='mui-9']")
	private WebElement age_textBox;
	@FindBy(xpath = "//input[@id='mui-10']")
	private WebElement dateOfJoining_dropdown;
	@FindBy(xpath = "(//div[@tabindex='0'])[2])")
	private WebElement labourOwnership_dropdown;
	@FindBy(xpath = "//li[text()='VJ']")
	private WebElement VJ_labourOwnershipDropdown_option;
	@FindBy(xpath = "(//div[@tabindex='0'])[3])")
	private WebElement projectName_dropdown;
	@FindBy(xpath = "//li[text()='new Test Peoject']")
	private WebElement newTestPeojectNameDropdown_option;
	@FindBy(xpath = "(//div[@tabindex='0'])[4])")
	private WebElement labourCategory_dropdown;
	@FindBy(xpath = "//li[text()='Skilled']")
	private WebElement SkilledLabourCategoryDropdown_option;
	@FindBy(xpath = "//input[@id='mui-11']")
	private WebElement bankName_textBox;
	@FindBy(xpath = "//input[@id='mui-12']")
	private WebElement account_number_textBox;
	@FindBy(xpath = "//input[@id='mui-13']")
	private WebElement IFSC_code_textBox;
	@FindBy(xpath = "//input[@id='mui-14']")
	private WebElement branch_textBox;
	@FindBy(xpath = "(//input[@tabindex='-1'])[5]")
	private WebElement workHours_dropdown;
	@FindBy(xpath = "//li[text()='8 hours']")
	private WebElement hours_workHoursDropdown_option;
	@FindBy(xpath = "(//input[@tabindex='-1'])[6]")
	private WebElement overTime_dropdown;
	@FindBy(xpath = "//li[text()='NA']")
	private WebElement NA_overTimeDropdown_option;
	@FindBy(xpath = "(//input[@tabindex='-1'])[7]")
	private WebElement IDcardType_dropdown;
	@FindBy(xpath = "//li[text()='Passport']")
	private WebElement Passport_IDcardTypeDropdown_option;
	@FindBy(xpath = "//input[@id='mui-15']")
	private WebElement ID_card_number_textBox;
	@FindBy(xpath = "(//span[text()='Click to upload'])[2]")
	private WebElement upload_ID_card_button;

	public LabourFrom() {
		PageFactory.initElements(driver, this);
	}
	public void SearchEmployeeNameAndIdTextBox(String Name) {
		search_employee_name_and_id_textBox.sendKeys(Name);
	}
	public void ClickOnSearchEmployeeButton() {
		search_employee_button.click();
	}
	public void EnterAdharNumber(String AdharNo) {
		addhar_number_textBox.sendKeys(AdharNo);
	}
	public void EnterEmployeeName(String EmployeeNamee) {
		name_textBox.sendKeys(EmployeeNamee);
	}
	public void EnterFathersName(String FathersName) {
		father_or_husband_name_textBox.sendKeys(FathersName);
	}
	public void EnterGender() {
		MALE_radioButton.click();
	}
	public void EnterMarritalStatus() throws InterruptedException {
		Thread.sleep(1000);
		maritalStatus_dropdown.click();
		Thread.sleep(1000);
		single_maritalStatusDropdown_option.click();
		Thread.sleep(1000);
	}
	public void EnterMobileNumber(String MobNo) throws InterruptedException {
		contact_number_textBox.sendKeys(MobNo);
		Thread.sleep(1000);
	}
	public void EmergencyContactNumber(String EmergencyContactNo) throws InterruptedException {
		emergency_contact_number_textBox.sendKeys(EmergencyContactNo);
		Thread.sleep(1000);
	}
	public void EnterAddress(String Address) {
		address_textBox.sendKeys(Address);
	}
	public void EnterdateOfBirthDropdown(String Dob) {
		dateOfBirth_dropdown.sendKeys(Dob);
	}
}
