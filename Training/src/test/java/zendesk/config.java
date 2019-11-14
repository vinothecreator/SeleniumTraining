package zendesk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class config {
	public static Properties prop = new Properties();;
	InputStream inputStream;

	public void getPropValues() throws IOException {

		try {
			String propFileName = "credentials.properties";
			inputStream = this.getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			Date time = new Date(System.currentTimeMillis());

			String user = prop.getProperty("users");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}

	}

}
