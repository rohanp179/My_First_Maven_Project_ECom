package com.ecom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.ecom.base.BaseClass;

public class Excel_Data_Read extends BaseClass{
	
	FileInputStream fis;
	
	public Excel_Data_Read() throws FileNotFoundException {
		fis = new FileInputStream(projectPath+"\\src\\test\\resources\\data\\bankingweb.xlsx");
	}
}
