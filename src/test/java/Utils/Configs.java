package Utils;

public class Configs {

    public String getReportConfigPath() {
        String reportConfigPath = System.getProperty("user.dir") + "/target/ExtentReport/extent-config.xml";
        if (reportConfigPath != null)
            return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}