package Assignments;

public class Assignment3 {

	public static void main(String[] args) {
		
		        Student1 s = new Student1();
		        Teacher t=new Teacher();
		        Batch b=new Batch();
		        s.setName("Mahesh");
		        s.setAge(22);
		        s.setEmail("gmreddy020@gmail.com");
		        s.setAddress("Banglore");
		        System.out.println("Student name is:"+s.getName());
		        System.out.println("Student age is:"+s.getAge());
		        System.out.println("Student email is:"+s.getEmail());
		        System.out.println("Student address is:"+s.getAddress());

		        t.setTeacherName("Thanish");
		        t.setTeacherAge(22);
		        t.setTeacherEmail("thanish@gmail.com");
		        t.setTeacherAddress("Hyd");
		        System.out.println("Teacher name is:"+t.getTeacherName());
		        System.out.println("Teacher age is:"+t.getTeacherAge());
		        System.out.println("Teacher email is:"+t.getTeacherEmail());
		        System.out.println("Teacher address is:"+t.getTeacherAddress());

		        Batch b1 = new Batch();
		        
		        Student1[] students = {s};
				b.setStudents(students);
				b1.setTeacher(t);
				b1.setBatchName("JAN-2022");
			
				
		        
		    
		}
}
		class Student1
		{
		    private String name;
		    public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			private int age;
		    private String email;
		    private String address;
		     Student1()
		    {
		        System.out.println("student default constructor");
		    }
		     
		   		}

		class Teacher
		{
		    public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}
			private String name;
		    private int age;
		    private String email;
		    private String address;
		    Teacher()
		    {
		        System.out.println("teacher default constructor");
		    }
		     
		    public void setTeacherName(String name)
		    {
		        this.name=name;
		    }
		    public void setTeacherAge(int age)
		    {
		        this.age=age;
		    }
		    public void setTeacherEmail(String email)
		    {
		        this.email=email;
		    }
		    public void setTeacherAddress(String address)
		    {
		        this.address=address;
		    }

		    public String getTeacherName()
		    {
		        return name;
		    }
		    public int getTeacherAge()
		    {
		        return age;
		    }
		    public String getTeacherEmail()
		    {
		        return email;
		    }
		    public String getTeacherAddress()
		    {
		        return address;
		    }

		}
		class Batch
		{
		    public char[] getTeacher;
			private String name;
		    private int size;
		    private Student1[] students;
		    private Teacher teacher;
		    
			public Student1[] getStudents() {
				return students;
			}
			public void setStudents(Student1[] students) {
				this.students = students;
			}
			public Teacher getTeacher() {
				return teacher;
			}
			public void setTeacher(Teacher teacher) {
				this.teacher = teacher;
			}
			
		public Batch()
		{
		    System.out.println("batch class default constructor");
		}
		    public void setBatchName(String name)
		    {
		        this.name=name;

		    }
		    public void setBatchSize(int size)
		    {
		        this.size=size;
		    }
		    public String getBatchName(String name)
		    {
		        return name;

		    }
		    public int getBatchSize(int size)
		    {
		        return size;
		    }


		}

	


