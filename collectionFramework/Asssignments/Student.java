import java.util.ArrayList;

public class Student {
	String name;
	int year_of_passout;
	double percentage;
	String qualification;
	
	public Student(String name, String qualification, int year_of_passout, double percentage) {
		this.name = name;
		this.qualification = qualification;
		this.year_of_passout = year_of_passout;
		this.percentage = percentage;
	}
	public String toString() {
		return (this.name+" "+this.qualification+" "+this.percentage+" "+this.year_of_passout);
	}
	public static void main(String[] args) {
		Student s1 = new Student("Rohit","Btech",2023,85);
		Student s2 = new Student("Mukesh", "Bca", 2022,50);
		Student s3 = new Student("Shweta", "Mba", 2021,96);
		Student s4 = new Student("Sonu", "Btech",2022,78);
		Student s5 = new Student("Sakshi", "Btech",2023,82);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1); al.add(s2); al.add(s4);
		al.add(s3); al.add(s5);
		
		//print the details of student 
		for(Student s:al) //METHOD 1
		{
			System.out.println(s.name+" "+s.qualification+" "+s.percentage+" "+s.year_of_passout);
		}
		for(int i=0; i<al.size(); i++) //METHOD 2
		{
			System.out.println(al.get(i).name+" "+al.get(i).qualification+" "+al.get(i).percentage+" "+al.get(i).year_of_passout);
		}
		for(Student s : al) //METHOD 3 
		{
			System.out.println(s);
		}
		
		//print the details who is from 2023 year_of_passout
		System.out.println();
		for(Student s : al) {
			if(s.year_of_passout == 2023) {
				System.out.println(s);
			}
		}
		
		//Qualification Btech or Bca
		System.out.println();
		for(Student s: al) {
			if(s.qualification.equalsIgnoreCase("BtecH") || s.qualification.equals("Bca")) {
				System.out.println(s);
			}
		}
		
		//From 2022 or 2023 passout Bca minimum 50%
		System.out.println();
		for(Student s : al) {
			if(s.year_of_passout==2022 || s.year_of_passout==2023) {
				if(s.qualification.equalsIgnoreCase("bca") && s.percentage >= 50) {
					System.out.println(s);
				}
			}
		}	
	}
}