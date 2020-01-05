import java.util.*;

/**
 * @author student
 * this class tracks students details,teachers details,total fee recived 
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
		
		if(cheakTeacherID(id)) {
			Teacher teacher=new Teacher();
			for(int i=0;i<teachers.size();i++){
				if(teachers.get(i).getId()==id){
					teacher= teachers.get(i);
					return teacher;
				}
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
		if(cheakStudentID(id)) {
			Student student=new Student();
			for(int i=0;i<students.size();i++){
				if(students.get(i).getId()==id){
					student= students.get(i);
					return student;
				}
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

	public static void main(String[] args){
		Admin admin=new Admin();
		admin.addTeacher("Hamza",12000);
		System.out.println(admin.getTeacher(2018));
	}
	
}
