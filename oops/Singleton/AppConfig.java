package oops.Singleton;

public class AppConfig {
	private AppConfig() {
		
	}
//	private static AppConfig obj = new AppConfig();
//	public static AppConfig getIntance(){
//		return obj;
//	}
	
	private static AppConfig obj = null;
	public static AppConfig getIntance(){
		if(obj == null)
		{
			obj = new AppConfig();  
		}      
		return obj;
	}
}
