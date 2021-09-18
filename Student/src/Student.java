
public class Student {
	String name;
	String address;
	int age;
	
	public Student(String saddress,String sname,int sage) {
		name=sname;
		address=saddress;
		age=sage;
	}
		
		public Student() {
		// TODO Auto-generated constructor stub
	}

		public void setname(String name) {
			this.name=name;
		}
		public void setaddress(String address) {
			this.address=address;
		}
		public void setage(int age) {
			this.age=age;
		}
			public String getname(String name) {
				return this.name;
			}
			public String getaddress(String address) {
				return this.address;
			}
			public int getage(int age) {
				return this.age;
			}
			

}
class main{
	public static void main(String[] args) {
		Student s=new Student();
		s.setname("Student one");
		s.setage(20);
		s.setaddress("Address of student one");
		 System.out.println("Name of Student is : "+s.name);
		 System.out.println("Age of Student is : "+s.age);
		 System.out.println("Address of Student is : "+s.address);
	}
}