package com.springboot.parts.partsapp.util;

public class PartsAppConstants {
	
	static final String gethighSalesbyArea = "Select ";
	
	public static final String LastFiveYearSalesVehicle = "select " + 
			"	SUM(S.salevolume ) , " + 
			"	S.modelyr  " + 
			"from " + 
			"	sales S " + 
			"where " + 
			"	S.modelyr > (year(current_date()) - 5 )  "
			+ " and S.saletype = 'V'  " + 
			"group by " + 
			"	S.modelyr  " + 
			"order by S.modelyr ";
	
	public static final String LastFiveYearSalesAccy = "select " + 
			"	SUM(S.salevolume ) , " + 
			"	S.modelyr  " + 
			"from " + 
			"	sales S " + 
			"where " + 
			"	S.modelyr > (year(current_date()) - 5 )  "
			+ " and S.saletype = 'A'  " + 
			"group by " + 
			"	S.modelyr  " + 
			"order by S.modelyr ";
	

}
