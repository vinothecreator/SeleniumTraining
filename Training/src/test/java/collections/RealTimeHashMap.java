package collections;

import java.util.HashMap;

public class RealTimeHashMap {
	
	public static void main(String[] args) {
		
		
	/*	Use Case:
			Different Users/Roles : Permission Based User Management System.

			~category manager user --go to the app--add all the products
			~customer user --go to the app-- buy a product --place an order
			~admin user --go to the app-- can see all the orders
			~Seller user --go to the app--see only those orders which are relevant
			~Distributor User - go to the app--can see the respective order
			~Delivery Boy User --go to the app--can see the order and deliver the product
			~customer care user --go to the app-- log a ticket*/
		
		
		//Printing the user details 
		
/*		String crendtials_QA = getCredentialsMap().get("STG");
		
		System.out.println(crendtials_QA.split(":")[0]);
		System.out.println(crendtials_QA.split(":")[1]);*/
		
		
		
		System.out.println(getUserName("PROD"));
		System.out.println(getPassword("PROD"));
		
		//System.out.println(getCredentialsMap().get("QA"));
		
	}
	
	
	public static HashMap<String, String> getCredentialsMap() {
		
		HashMap<String, String> usermap = new HashMap<String, String>();
		
		usermap.put("QA", "qatest@pchmail.com:Tester");
		usermap.put("STG", "STGtest@pchmail.com:Tester");
		usermap.put("PROD", "PRODtest@pchmail.com:Tester");		
		return usermap;
		
	}

	
	public static String getUserName(String uName)
	{
		String crendtial = getCredentialsMap().get(uName);
		return crendtial.split(":")[0];
		
	}
	
	
	public static String getPassword(String pwd)
	{
		String crendtial = getCredentialsMap().get(pwd);
		return crendtial.split(":")[1];
		
	}

}
