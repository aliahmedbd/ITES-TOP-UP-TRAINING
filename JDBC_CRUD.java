import java.sql.*;
import java.util.*;

class Demo{
	public static void main(String ... s) throws Exception
	{
		//Load Driver
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","");
		//create statement
		Statement st=con.createStatement();
		//Execute statement
		boolean flag=true;
		
		int check;
		while(flag){
			System.out.println("1.Create\n2.Retrieve\n3.Update\n4.Delete\n5.Exit");
			Scanner scan=new Scanner(System.in);
			check=scan.nextInt();
			ResultSet rs;
			switch(check){
				case 1:
					String name;
					int id,age;
					System.out.println("Please enter ID:");
					id=scan.nextInt();
					System.out.println("Please enter Name:");
					name=scan.next();
					System.out.println("Please enter age:");
					age=scan.nextInt();
					
					st.executeUpdate("INSERT into Student (student_id,student_name,student_age) values ("+id+",'"+name+"',"+age+")");
					System.out.println("Success Insert");
					break;
					
				case 2:
					rs=st.executeQuery("Select * from Student");
					while(rs.next()){
						
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
					}
					break;
				case 3:
					int std_id;
					String std_name;
					int std_age;
					scan=new Scanner(System.in);
					System.out.println("Please enter ID:");
					std_id=scan.nextInt();
					System.out.println("Please enter Name:");
					std_name=scan.next();
					//System.out.println("Please enter Age:");
					//std_age=scan.nextInt();
					st.executeUpdate("UPDATE Student SET student_name ='"+std_name+"' where student_id="+std_id);
					System.out.println("Success Update");
					break;
				case 4:
					int studentID;
					studentID=scan.nextInt();
					st.executeUpdate("DELETE from Student where student_id="+studentID);
					System.out.println("Success Delete");
					break;
				case 5:
					flag=false;
					break;
				
					
			
			}
		}
		
		
	}
	
}
