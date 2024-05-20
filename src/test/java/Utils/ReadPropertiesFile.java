package Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {


    public Properties getProperty() throws IOException {
         String projectPath = System.getProperty("user.dir")+"/data.properties";
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(projectPath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }
}