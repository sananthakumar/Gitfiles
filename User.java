
public class User {
	int id;
	String name;
	int salary;
	
	User(int userId,String userName){
		id=userId;
		name=userName;
	}
	User(int userId,String userName,int userSalary){
		this(userId,userName);
		salary=userSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User i=new User(1002,"Ananth",25000);
System.out.println("Name:"+i.name);
System.out.println("salary:"+i.salary);
	}

}
