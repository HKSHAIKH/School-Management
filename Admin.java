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
	
	/**
	 *constructor of admin.
	 */
	public Admin(){
		this.teachers=new ArrayList<>(1);
		this.students=new ArrayList<>(10);
		this.totalFeeRecived=0;
		this.expectedEarning=0;
		this.totalSalaryPaid=0;
	}
	
	
	public void addTeacher(int id,String name,int salary){
		teachers.add(new Teacher(id,name,salary));
	}
	
	public boolean cheakTeacher(int id) {
		for(int i=0;i<teachers.size();i++) {
			if(teachers.get(i).getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	public Teacher getTeacher(int id){
		
		if(cheakTeacher(id)) {
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
	
	public void updateSalary(int id,int salary){
		Teacher teacher=getTeacher(id);
		teacher.setSalary(salary);
	}
	
	public void addStudent(int id,String name,int std,int fee){
		students.add(new Student(id,name,std,fee));
	}
	
	public boolean cheakStudent(int id) {
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	public Student getStudent(int id){
		if(cheakStudent(id)) {
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
	
	public void updateStd(int id,int std){
		Student student = getStudent(id);
		student.setStd(std);
	}
	
	public void updateFee(int id,int fee) {
		Student student = getStudent(id);
		student.setFee(fee); 
	}
	
	

	
	public static void main(String[] args){
		Admin admin=new Admin();
		admin.addTeacher(2018,"Hamza",12000);
		admin.updateSalary(2018,15000);
		System.out.println(admin.getTeacher(2018));
	}
	
}
