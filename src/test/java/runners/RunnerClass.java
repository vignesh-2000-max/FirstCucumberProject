package runners;

import java.io.File;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/resources/features/CreateAccount.feature",
        glue= {"steps"}, plugin= {"json:target/Runner/cucumber.json","pretty",
       	"html:target/Runner/cucumber.html"}
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

	@BeforeClass
	public void setup() {
		
		Date d=new Date();
		String name=d.toString().replace(":", "_").replace(" ", "_");
		String fileName=System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+name+".html";
		File newFile=new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		ExtentCucumberFormatter.loadConfig(new File("srs/test/resources/extent-config.xml"));
		
		/*ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "v109.0.5414.74");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "v4.1.0");
		*/
		
	}
}
