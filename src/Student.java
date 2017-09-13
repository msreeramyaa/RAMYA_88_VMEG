import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int id;        
        
	static int[] id=new int[100];

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
  	static String[] fullname=new String[100];

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;
	static String[] bithDate=new String[100];

	/**
	 * student average mark
	 */
	private double avgMark;
	static int[] avgMark=new int[100];

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
	System.out.println(" student id is ="+id[i]);
    
		return id;
	}

	public void setId(int id) {
	        System.out.print(" enter student marks  ");

	        id[temp]=sn.nextInt();
		this.id = id;
	}

	public String getFullName() {
	System.out.println("student name = "+fullName[i]);
	
		return fullName;
	}

	public void setFullName(String fullName) {
	Scanner sn=new Scanner(System.in);
        System.out.print(" enter full name  ");
        fullName[temp]=sn.next();
		this.fullName = fullName;
	}

	public Date getBirthDate() {
	System.out.println("student date of birth = "+dob[i]);

	
	return birthDate;
	}

	public void setBirthDate(Date birthDate) {
	System.out.print(" enter student date of birth  ");
	birthDate[temp]=sn.next();
	
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
	System.out.println(" avg marks =" +avgMarks);
	
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
	System.out.println(" enter avg mark ");
        avgMark[temp]=sn.next();
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
