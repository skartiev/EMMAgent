package org.wso2.emm.agent.automate;

import org.wso2.emm.agent.defaults.ConfigProperties;

/**
 * Automaton of registration
 * @author develop
 *
 */
public class AgentAutomator {
	public static void defaultsIP(String ipsaved, final int tenant){
		if(ipsaved != null && ipsaved==""){
			ConfigProperties props = new ConfigProperties();
			ipsaved = props.serverProperty(tenant);
		}
	}
	
	public static void defaultsClientKey(String clientkey, final int tenant){
		if(clientkey != null && clientkey==""){
			ConfigProperties props = new ConfigProperties();
			clientkey = props.getKey(tenant);
		}		
	}
	
	public static void defaultsClientSecret(String clientsec, final int tenant){
		if(clientsec != null && clientsec==""){
			ConfigProperties props = new ConfigProperties();
			clientsec = props.getKey(tenant);
		}		
	}
	/**
	 * Check to exists of default configuration
	 * @param server
	 * @param clientkey
	 * @param clientsecret
	 * @param tenant
	 */
	public static void defaultsClient(String server, String clientkey, String clientsecret, final int tenant){
		defaultsIP(server, tenant);
		defaultsClientKey(clientkey, tenant);
		defaultsClientSecret(clientsecret, tenant);
	}
}
