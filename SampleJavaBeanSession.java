package SampleJSP;
import javax.ejb.Stateless;

/**
 * 
 */

/**
 * @author Gary
 *
 */
@Stateless
public class SampleJavaBeanSession implements SampleJavaBeanRemote {
	public String GetIDAndAgeTest(){
	SampleJavaBean newSample = new SampleJavaBean();
	newSample.setTestID(1);
	newSample.setTestAge(15);
	return "TestID is: " + newSample.getTestID() + ". Age is : " + newSample.getTestAge();
	}
}

