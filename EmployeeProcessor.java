package Flux;
import reactor.core.publisher.Flux;
class Employee{
	String employeeId;
    double salary;
    String department;

    Employee(String employeeId, double salary, String department) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }
    
    public String getemployeeId() {
    	return employeeId;
    }
    
    public double getsalary() {
    	return salary;
    }
    public String getdepartment() {
    	return department;
    }
}
public class EmployeeProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flux<Employee> stream1 = depart("E1", 50000.0, "IT", "E2", 60000.0, "HR");
        Flux<Employee> stream2 = depart("E3", 55000.0, "IT", "E4", 70000.0, "Finance");
        Flux.concat(stream1,stream2).filter(a->"IT".equals(a.getdepartment())).subscribe(result->System.out.println(result.getdepartment()+","+result.getemployeeId()+","+result.salary));

	}
	static Flux<Employee> depart(Object...objects){
		return Flux.create(emitter->{
			for(int i=0;i<objects.length;i+=3) {
				String employeeId=(String)objects[i];
				double salary=(double)objects[i+1];
				String department=(String)objects[i+2];
				emitter.next(new Employee(employeeId,salary,department));
				
			}
			emitter.complete();
		}
		);
	}

}
