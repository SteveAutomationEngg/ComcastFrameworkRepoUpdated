package Pac1;

import org.testng.annotations.Test;




public class OrgTest  {

	@Test
	public void createOrgtest() {
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");         
		String USERNAME = System.getProperty("username");  
		String PASSWORD = System.getProperty("password");   
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("Execute createOrgtest ");
	}
	
	
	@Test
	public void modifyOrgtest() {
		System.out.println(" Execute modifyOrgtest ");
	}
	
	
	
}
