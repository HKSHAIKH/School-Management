/**
 * 
 */

/**
 * @author student
 * This class keep track of student id,name,std and fee.
 */
public class Student {
	
	private int id;
	private String name;
	private int std;
	private int fee;
	private int feespaid;
	
	public Student() {
		this.id = 0;
		this.name = null;
		this.std = 0;
		this.fee = 0;
		this.feespaid = 0;
	}
	
	public Student(int id,String name,int std,int fee) {
		this.id = id;
		this.name = name;
		this.std = std;
		this.fee = fee;
		this.feespaid = 0;
	}
	
	/**
	 * get id of the student.
	 * @return the id of student
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * get name of student.
	 * @return the name of student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * update the name of student.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name=name;
	}

	/**
	 * @return the std of student
	 */
	public int getStd() {
		return std;
	}

	/**
	 * @param std the std to set
	 */
	public void setStd(int std) {
		this.std = std;
	}

	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}

	/**
	 * @return the feespaid
	 */
	public int getFeespaid() {
		return feespaid;
	}

	/**
	 * @param feespaid the feespaid to set
	 */
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}

	public String toString() {
		return name;
	}
}
