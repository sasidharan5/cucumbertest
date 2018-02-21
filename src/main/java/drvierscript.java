import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;


public class drvierscript {

    public static ExtentReports extent;
    public static ExtentTest Report;

@BeforeClass
public static void beforetest() {
    extent = new ExtentReports("C:\\Users\\sasid\\IdeaProjects\\cucumbertest\\src\\test\\out\\report\\testresult.html",true);

}

@Test
public void testA(){

Report = extent.startTest("test1");

Report.log(LogStatus.PASS,"result pass");


extent.endTest(Report);



    Report = extent.startTest("test2");

    Report.log(LogStatus.FAIL,"result pass");


    extent.endTest(Report);
    int a = 10;

    Assert.assertTrue(a==10);

    extent.flush();
    extent.close();

}







}
