package SampleJSP;
/**
 * 
 */

import javax.persistence.Entity;

/**
 * @author Gary
 *
 */
@Entity
public class SampleJavaBean implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int testID;
	private int testAge;
	/**
	 * @return the testID
	 */
	public int getTestID() {
		return testID;
	}
	/**
	 * @param testID the testID to set
	 */
	public void setTestID(int testID) {
		this.testID = testID;
	}
	/**
	 * @return the testAge
	 */
	public int getTestAge() {
		return testAge;
	}
	/**
	 * @param testAge the testAge to set
	 */
	public void setTestAge(int testAge) {
		this.testAge = testAge;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + testAge;
		result = prime * result + testID;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleJavaBean other = (SampleJavaBean) obj;
		if (testAge != other.testAge)
			return false;
		if (testID != other.testID)
			return false;
		return true;
	}
	public SampleJavaBean(){
		// TODO Auto-generated constructor stub
	}

}
