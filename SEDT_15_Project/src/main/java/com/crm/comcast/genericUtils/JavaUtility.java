package com.crm.comcast.genericUtils;
//import java.time.LocalDateTime;
import java.util.Random;

import java.util.Date;
public class JavaUtility {
	
	Date dateobj=new Date();
	public int getRandomNumber() {
	Random random=new Random();
	int ran=random.nextInt(1000);
	return ran;
	}
	public String getCurrentDate() {
		
		String todaysdate=dateobj.toString();
		return todaysdate;
	}
	public String getCurrentYear() {
		String todaysdate= dateobj.toString();
		String[] arr = todaysdate.split(" ");
		return arr[5];

	}
	
}
