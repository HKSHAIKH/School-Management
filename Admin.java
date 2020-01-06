import java.util.*;

/**
 * @author student
 * this class tracks students details,teachers details,total fee received.
 * and total salary paid
 */
public class Admin {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalFeeRecived;
	private int expectedEarning;
	private int totalSalaryPaid;
	private static int GRNo;
	private static int TeacherNo;
	
	/**
	 *constructor of admin.
	 */
	public Admin(){
		this.teachers=new ArrayList<>(1);
		this.students=new ArrayList<>(10);
		this.totalFeeRecived=0;
		this.expectedEarning=0;
		this.totalSalaryPaid=0;
		Admin.GRNo=0;
		Admin.TeacherNo = 0;
	}
	
	//to add teacher
	public void addTeacher(String name,int salary){
		teachers.add(new Teacher(++TeacherNo,name,salary));
	}
	
	/**
	 * To remove teacher form the list of teachers.
	 * @param id id of the teacher.
	 * @return If teacher is removed than return true.
	 */
	public boolean removeTeacher(int id) {
		for(int i=0;i<teachers.size();i++){
			if(teachers.get(i).getId()==id){
				teachers.remove(i);
				return true;
			}
		}
		System.out.println("id is not valid");
		return false;
	}
	
	//to check teacher's id is valid.
	public boolean cheakTeacherID(int id) {
		for(int i=0;i<teachers.size();i++) {
			if(teachers.get(i).getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	//to get teacher.
	public Teacher getTeacher(int id){
		
		Teacher teacher=new Teacher();
		for(int i=0;i<teachers.size();i++){
			if(teachers.get(i).getId()==id){
				teacher= teachers.get(i);
				return teacher;
			}
		}
		return null;
	}
	
	/**
	 * to get Id of teacher
	 * @param name name of teacher
	 * @return ID of teacher.
	 */
	public int getTeacherId(String name) {
		for(int i=0;i<teachers.size();i++){
			if(teachers.get(i).getName()==name){
				return teachers.get(i).getId();
			}
		}
		return 0;
	}
	
	
	/**
	 * to add student.
	 * @param id id of a student
	 * @param name name of a student
	 * @param std std of a student
	 * @param fee fee to be paid by student
	 */
	public void addStudent(String name,int std,int fee){
		students.add(new Student(++GRNo,name,std,fee));
		this.expectedEarning += fee;
	}
	
	/**
	 * To remove student form the list of students.
	 * @param id id of the student.
	 * @return If student is removed than return true.
	 */
	public boolean removeStudent(int id) {
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId()==id){
				students.remove(i);
				return true;
			}
		}
		System.out.println("id is not valid");
		return false;
	}
	
	//to check that id is valid or not.
	public boolean cheakStudentID(int id) {
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	//to get student.
	public Student getStudent(int id){
		
		Student student=new Student();
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId()==id){
				student= students.get(i);
				return student;
			}
		}
		
		return null;
	}
	
	/**
	 * to get id of student
	 * @param name name of student
	 * @return id of student
	 */
	public int getStudentID(String name) {
		for(int i=0;i<students.size();i++){
			if(students.get(i).getName()==name){
				return students.get(i).getId();
			}
		}
		return 0;
	}
	
	/**
	 * @return the totalFeeRecived
	 */
	public int getTotalFeeRecived() {
		return totalFeeRecived;
	}

	/**
	 * @return the expectedEarning
	 */
	public int getExpectedEarning() {
		return expectedEarning;
	}

	/**
	 * @return the totalSalaryPaid
	 */
	public int getTotalSalaryPaid() {
		return totalSalaryPaid;
	}
	
	/**
	 * To receive fees of student.
	 * @param id id of student.
	 * @param fee fee to be paid by student.
	 * @return If entered id is valid and entered fee is not greater than remaining fees than this method returns true.
	 */
	public boolean receiveFees(int id,int fee) {
		try {
			if(!this.getStudent(id).payFees(fee)) {
				System.out.println("Entered amount is more than fees.please enter valid amount");
				return false;
			}
			this.totalFeeRecived += fee;
			return true;
		}
		catch(NullPointerException e) {
			System.out.println("Fees is not received.Please enter valid id.");
			return false;
		}
	}
	
	/**
	 * To pay salary to teacher.
	 * @param id id of a teacher.
	 * @param salary salary of teacher.
	 * @return If entered id and salary is valid and salary is not paid previously only than this method return true.
	 */
	public boolean paySalary(int id,int salary) {
		try {
			Teacher teacher = this.getTeacher(id);
			if(teacher.getSalary()==salary && !teacher.isSalaryPaid()) {
				this.totalSalaryPaid += salary;
				teacher.setSalaryPaid(true);
				return true;
			}
			System.out.println("Salary is not paid.Please enter valid id or salary.");
			return false;
		}
		catch(NullPointerException e){
			System.out.println("Salary is not paid.Please enter valid id.");
			return false;
		}
	}
}
