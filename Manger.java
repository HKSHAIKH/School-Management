
/**
 * @author ubuntu
 * This class is created to run the application.
 */
public class Manger {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.addStudent("hamza", 2, 200000);
		admin.addStudent("musab", 2, 2000);
		admin.addStudent("talha", 1, 300000);
		admin.addStudent("usaid", 12, 20000);
		admin.addStudent("anas", 9, 1000);
		admin.addTeacher("abbu", 2000000000);
		admin.addTeacher("ammi", 2000000000);
		for(int i=0;i<5;i++) {
			System.out.println(admin.getStudent(i+1));
		}
		
		for(int i=0;i<2;i++) {
			System.out.println(admin.getTeacher(i+1));
		}
		System.out.println(admin.getExpectedEarning());
		admin.receiveFees(4, 12000);
		admin.receiveFees(2, 100);
		admin.receiveFees(1, 100000);
		System.out.println(admin.getTotalFeeRecived());
		admin.paySalary(1, 2000000000);
		System.out.println(admin.getTotalSalaryPaid());
		System.out.println(admin.removeTeacher(1));
		GUI gui =new GUI(admin);
	}

}
