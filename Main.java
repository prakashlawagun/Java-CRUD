package MyPackage;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
    	while(true) {
    		System.out.println("\n Employee Management");
    		System.out.println("1= Create , 2= Read  ,3= Update, 4= Delete");
    		Scanner sc = new Scanner(System.in);
    		int choice = sc.nextInt();
    		
    		if(choice<1 || choice >5) break;
    		switch(choice) {
	    		case 1: System.out.println("id,name,email,salary");
	    				int id = sc.nextInt();
	    				sc.nextLine();
	    				String name = sc.nextLine();
	    				String email = sc.nextLine();
	    				int salary = sc.nextInt();
	    				Employee emp = new Employee(id,name,email,salary);
	    				Doa.createEmployee(emp);
	    				break;
	    		case 2: ArrayList<Employee> List = Doa.readAllEmployee();
			    		for(Employee employee:List) {
			    			System.out.println(employee);
			    		}
			    		break;
	    		case 3: System.out.println("Id and Name");
	    				id = sc.nextInt();
	    				sc .nextLine();
	    				name = sc.nextLine();
	    				Doa.updateEmployee(id, name);
	    				break;
	    		case 4:System.out.println("id");
	    				id = sc.nextInt();
	    				Doa.deleteEmployee(id);
	    				break;
	    		default:
	    			System.out.println("Invalid option selected");
    		
    		}
    	}

    }

}



//Student st = new Student();
////st.createDatabase();
////st.createTable();
////st.createData();
//st.readData();