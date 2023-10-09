package com.labourform.test;

import org.testng.annotations.Test;

import com.labourform.baselayer.TestBase;
import com.labourform.pagelayer.LabourFrom;

public class ValidateSearchEmployeeButton extends TestBase {

	@Test
	public void ValidateSearchBox() throws InterruptedException {
		labour_form_page = new LabourFrom();
		Thread.sleep(10000);
		labour_form_page.SearchEmployeeNameAndIdTextBox("Abhi");
		labour_form_page.ClickOnSearchEmployeeButton();
		labour_form_page.EnterAdharNumber("222212344321");
		labour_form_page.EnterEmployeeName("Rajesh");
		labour_form_page.EnterFathersName("Sanjay");
		labour_form_page.EnterGender();
		labour_form_page.EnterMarritalStatus();
		labour_form_page.EnterMobileNumber("123456789");
		labour_form_page.EmergencyContactNumber("1122334455");
		labour_form_page.EnterAddress("101,Rachna Apartment, Thane");
		labour_form_page.EnterdateOfBirthDropdown("21-09-1995");

		Thread.sleep(2000);
	}
}