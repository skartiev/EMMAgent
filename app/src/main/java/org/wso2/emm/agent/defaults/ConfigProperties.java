package org.wso2.emm.agent.defaults;

public class ConfigProperties {
	public static final boolean AUTO_MODE = true;
	public static final int TENANT_VALUE = ConfigTenants.SHOP_TENANT;
	private static final String _log_test = "testus";
	private static final String _log_taxi = "drivertaxi";
	private static final String _log_shop = "msmanager";
	private static final String _param_taxi = "cfcbjq";//  czFCcH
	private static final String _param_shop = "IpZaR5";
	private static final String _param_test = "tUAABz";
	private static final String _server_defs = "serv.ariz.su";
	private static final String _server_loco = "10.0.0.52";
	
	
	public static final String getKey(final int tenant){
		switch(tenant){
		case ConfigTenants.TAXI_TENANT: 
			return _log_taxi;
		case ConfigTenants.SHOP_TENANT:
			return _log_shop;
		case ConfigTenants.DEF_TENANT:
			return _log_test;			
		}
		return "";
	}
	
	public static final String getProperty(final int tenant){
		switch(tenant){
		case ConfigTenants.TAXI_TENANT: 
			return _param_taxi;
		case ConfigTenants.SHOP_TENANT:
			return _param_shop;
		case ConfigTenants.DEF_TENANT:
			return _param_test;			
		}
		return "";
	}
	
	public static final String serverProperty(final int tenant) {
		if(tenant == ConfigTenants.DEF_TENANT)
			return _server_loco;
		return _server_defs;
	}
	
	public static class ConfigTenants{
		public static final int DEF_TENANT = 0;
		public static final int TAXI_TENANT = 1;
		public static final int SHOP_TENANT = 2;
		
	}
}
