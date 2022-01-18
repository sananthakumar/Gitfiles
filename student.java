
public class student {
int id;
String name;
String gender="male";
char[] grades;
student(String name){
	this.name=name;
}
student(int id,String name,char[] grades){
	this(name);
	this.id=id;
	this.grades=grades;
	System.out.println(grades);
}
boolean updateprofile(String name){
	String oldval=this.name;
	System.out.println("old name:"+oldval);
	this.name=name;
   return true;
}
}
