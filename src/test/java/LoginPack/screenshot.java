package LoginPack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Basepack.Baseclass;
import io.cucumber.java.After;

import io.cucumber.java.Scenario;

public class screenshot extends Baseclass {

	@After
	public void captureScreenshot(Scenario scenario) {
	    System.out.println("After hook started for scenario: " + scenario.getName());

	    if (scenario.isFailed()) {
	        System.out.println("Scenario failed. Capturing screenshot...");

	        try {
	            File screenshotsDir = new File(System.getProperty("user.dir") + "/Screenshots");
	            if (!screenshotsDir.exists()) {
	                boolean created = screenshotsDir.mkdirs();
	                System.out.println("Created Screenshots directory: " + created);
	            }

	            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	            String screenshotName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + ".png";
	            File destFile = new File(screenshotsDir, screenshotName);

	            FileHandler.copy(srcFile, destFile);
	            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());

	            byte[] fileContent = Files.readAllBytes(destFile.toPath());
	            scenario.attach(fileContent, "image/png", screenshotName);

	            System.out.println("Screenshot attached to report.");

	        } catch (Exception e) {
	            System.out.println("Failed to capture screenshot: " + e.getMessage());
	            e.printStackTrace();
	        }
	    } else {
	        System.out.println("Scenario passed, no screenshot taken.");
	    }

	    driver.quit();
	}

	
}
