import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		if(students.length>0) {
			for(int i=0;i<students.length;i++)
				return students[i];
		}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		try {
			if(students==null)
				throw new IllegalArgumentException;
			else {
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<students.length;i++) {
					students[i].id=sc.nextInt();
					students[i].fullName=sc.next();
					students[i].birthDate=sc.next();
					students[i].avgMark=sc.nextDouble();
				}
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		try {
			if(index<0||index>=students.length)
				throw new IllegalArgumentException;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		try {
			if(student==null||index<0||index>=students.length)
				throw new IllegalArgumentException;
			students[index]=student;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		try {
			if(students==null||index<0||index>students.length)
				throw new IllegalArgumentException;
			students.length=students.length+1;
			for(int i=students.length-1;i>0;i--)
				students[i]=students[i-1];
			students[0]=student;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		try {
			if(students==null)
				throw new IllegalArgumentException;
			students.length=students.length+1;
			students[students.length]=student;
		}
		catch(IllegalArgumentException e) {
			System.out.println("caught"+e.getMessage());
		}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		try {
			if(students==null||index<0||index>students.length)
				throw new IllegalArgumentException;
			students.length=students.length+1;
			for(int i=students.length-1;i>index;i--)
				students[i]=students[i-1];
			students[index]=student;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		try {
			if(students==null||index<0||index>students.length)
				throw new IllegalArgumentException;
			for(int i=0;i<students.length;i++) {
				if(i==index) {
					while(i<students.length-1)
						students[i]=students[i+1];
			}
			
		}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		try {
			if(student==null)
				throw new IllgealArgumentException;
			for(int i=0;i<students.length-1;i++) {
					students[i]=students[i+1];
			}
			students.length=students.length-1;
		}
		catch(IllegalArgumentException e)
			System.out.println("student not exist" + e.getMessage())
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		try {
			if(index<0||index>students.length)
				throw new IllegalArgumentException;
			for(int i=0;i<students.length;i++) {
				if(i==index) {
					students.length=students.length-i;
					while(i<students.length-1)
						students[i]="";
			}
			
		}
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught"+e.getMessage());
		}
	}
		// Add your implementation here
	@Override
	public void removeFromElement(Student student) {
		try {
			if(student==null)
				throw new IllegalArgumentException;
			for(int i=0;i<students.length;i++) {
				if(students[i]==student) {
					students.length-=i;
					break;
				}
		}
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		int k=index;
		try {
			if(index<0||index>=students.length)
				throw new IllegalArgumentException;
			for(int i=0;i<students.length-index;i++)
				students[i]=students[index++];
			students.length=students.length-k;
		}
		catch(IllegalArgumentException e)
			System.out.println("caught"+e.getMessage())
	
		
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		int f,k;
		try {
			if(student==null)
				throw new IllegalArgumentException;
			for(int i=0;i<students.length;i++) {
				if(students[i]==student) {
					f=i;
					k=i;
					break;
				}
		}
		for(int i=0;i<students.length-f;i++)
			students[i]=students[f++];
		students.length=students.length-k;
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());

		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int ex=0,temp=0;
		
		for(int i=0;i<students.length-1;i++) {
			for(int j=0;i<students.length-i-1;j++)
			{
				if(students[j].id>students[j+1]) {
					temp=students[j].id;
					students[j].id=students[j+1].id;
					students[j+1].id=temp;
					ex++;
				}
			}
		
		if(ex==0)
			break;
		}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		try {
			if(date==null)
				throw new IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		try {
			if(firstDate==null||lastDate==null)
				throw new IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		try {
			if(date==null)
				throw new IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		try {
			if(indexOfStudent==null)
				throw new IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("Caught"+e.getMessage());
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		try {
			if(student==null)
				throw new IllegalArgumentException;
		
		double max=0.0;
		for(int i=0;i<students.length;i++) {
			if(students[i].avgMark>students[i+1].avgMark) {
				max=students[i].avgMark;
				return students[i];
			}
			if(students[i].avgMark==max)
				return students[i];
		}
		
		}
		catch(IllegalArgumentException e)
			System.out.println("caught"+e.getMessage());
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
