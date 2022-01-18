
public class studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] studentids=new int[]{1001,1002,1003};
student student1=new student(studentids[0],"ananth",new char[]{'A','B'});
student1.gender="male";
student student2=new student(studentids[1],"Kumar",new char[]{'A','B'});
student2.gender="male";
student student3=new student(studentids[2],"Aiswarya",new char[]{'A','B'});
student3.gender="female";
System.out.println("Student name1:"+student1.name);
System.out.println("Student grades:"+student1.grades);
System.out.println("Student name2:"+student2.name);
System.out.println("Student name3:"+student3.name);
student1.updateprofile("Ananth");
System.out.println("Upadted name:"+student1.name);
student student4=student1;
System.out.println(student4.name);
student4.updateprofile("Aanath");
System.out.println(student4.name);
System.out.println("Upadted name:"+student1.name);
	}

}
