/**
 * 
 */

/**
 * @author student 
 * This class tracks the record of teacher's salary,name and id.
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	
	public Teacher(){
		this.id=0;
		this.name=null;
		this.salary=0;
	}
	
	
	/**
	 * constructor of teacher
	 * @param id store id of teacher
	 * @param name store name of the teacher
	 * @param salary store Salary of the teacher
	 */
	public Teacher(int id, String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	/**
	 * @return the id of teacher
	 */
	public int getId() {
		return id;
	}
	
	/**
	 *  @return the name of teacher
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * update name of teacher
	 * @param name name of teacher
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * get the salary of teacher
	 * @return the salary of teacher
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * update the salary of teacher
	 * @param salary salary of teacher
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	

	public static void main (String[] args){
		Object teacher=new Teacher(2018,"Hamza",30000);
		System.out.println(teacher.getName());
	}
	

}
