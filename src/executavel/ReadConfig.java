package executavel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import menssagem.TelaErro;

public class ReadConfig {
	private static String host;
	private static String port;
	private static String base;
	private static String user;
	private static String password;
	private static String icon;
	
	public static String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public static String getPort() {
		return port;
	}
	
	public void setPort(String port) {
		this.port = port;
	}
	
	public static String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	public static String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public static String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/Config.properties");
		props.load(file);
		return props;
	}

	public static void openConfig() {
		
		String host;
		String port;
		String base;
		String user;
		String password;
		
		try{
			Properties prop = getProp();
			
			host = prop.getProperty("prop.server.host");
			port = prop.getProperty("prop.server.port");
			base = prop.getProperty("prop.server.base");
			user = prop.getProperty("prop.server.user");
			password = prop.getProperty("prop.server.password");
	
			ReadConfig config = new ReadConfig();
			String dir = System.getProperty("user.dir"); // Obtem o endereço da aplicação.
			
			config.setIcon(dir);
			config.setHost(host);
			config.setPort(port);
			config.setBase(base);
			config.setUser(user);
			config.setPassword(password);
		
		}catch(Exception E){
			E.printStackTrace();
			TelaErro p = new TelaErro("Erro ao ler o arquivo config. \n" + E.getMessage());
		}
	}
}
