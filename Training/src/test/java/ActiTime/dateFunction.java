package ActiTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class dateFunction {
	
	/* public static String timestamp() {
		    return new SimpleDateFormat("dd-MM-YYYY HH-mm-hh a").format(new Date());
		}
*/
	public static String returnAddDate(String format, int days) {
		Calendar c = Calendar.getInstance();
		
	
		c.add(Calendar.DATE, days);
		int day =c.get(Calendar.DAY_OF_WEEK);
		
		if ((c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)   || (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
		    System.out.println("true");
		} else {
		    System.out.println("FALSE");
		}
		
		
		// DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = c.getTime();
		String dat = dateFormat.format(date);
		return dat;

	}

	

	  private boolean isWorkingDay(Date date, Calendar calendar) {
          // set calendar time with given date
          calendar.setTime(date);
          int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
          // check if it is Saturday(day=7) or Sunday(day=1)
          if ((dayOfWeek == 7) || (dayOfWeek == 1)) {
              return false;
          }
          return true;
       }
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		String start_date = returnAddDate("dd-MMM-yyyy", 4);
		System.out.println(start_date);
	
	
		
		
		/*System.out.println(timestamp());*/
		
		//Calendar c = Calendar.getInstance();
	/*	
		cal.add(cal.DAY_OF_WEEK, +1);
		cal.get(Calendar.DATE);
		System.out.println(cal.get(Calendar.DATE));
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = cal.getTime();
		String dat = dateFormat.format(date);
 int dat2 = Integer.parseInt(dat);*/
 
 c.add(Calendar.DAY_OF_WEEK, +1);
 System.out.println(c.get(Calendar.DATE));
		
	/*		 
		if (dat2 == Calendar.SUNDAY  && dat2  == Calendar.SATURDAY)
		    
         {
		    System.out.println("Weekend");
		}
		    else
		    	
		 System.out.println("Mon-Fri");
		    	
		}*/
		
	/*	c.add(Calendar.DAY_OF_WEEK, -(c.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.println(c.get(Calendar.DATE));
		DateFormat dateFormat = new SimpleDateFormat();
		Date date = c.getTime();
		String dat = dateFormat.format(date);
      	System.out.println(dat);
*/
		
		 
		  
		  
		  
	/*	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = new Date();
		String dat = dateFormat.format(date);
		System.out.println(dat);// system current date will print

		String[] splitArray = dat.split("-");
		int day = Integer.parseInt(splitArray[0]);
		String month =splitArray[1];
		int year = Integer.parseInt(splitArray[2]);
		
	System.out.println(day);
		
	System.out.println(month);
	System.out.println(year);
	
	
	int fdate= day+1;
	System.out.println(fdate);
	
	System.out.println(fdate + "-" + month + "-" + year);*/

	
		/*	Calendar cal=Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.DAY_OF_MONTH, -cal.get(Calendar.DAY_OF_WEEK));
			if(cal.getTimeZone())
			cal.add( Calendar.DAY_OF_WEEK,-(cal.get(Calendar.DAY_OF_WEEK)-1)); 
			System.out.println(cal.get(Calendar.DATE));*/
			//System.out.println(date);
			
			// Calendar calendar = Calendar.getInstance();
		/*
		        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		        
		        System.out.println(Calendar.SUNDAY);
		        
		        if(cal.get(Calendar.DAY_OF_WEEK)== cal.SUNDAY)
		        		{
		        	System.out.println("pass");
		        		}
		        else
		        {
		        	System.out.println("fail");
		        }
		
		
			 DateFormat simpleDateformat = new SimpleDateFormat("EEE");
			 Date date = cal.getTime(); 
			 String day= simpleDateformat.format(date);*/
			 
			   //System.out.println(simpleDateformat.format(now));
	
	
	
		
		/*
		 * int today =Integer.parseInt(dat); int fdate= today+1;
		 * System.out.println(fdate);
		 */
	}
}

