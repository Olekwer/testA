
public class Employ {
	private Salary[]salaries= new Salary[12];

	public Salary[] getSalaries() {
		return salaries;
	}

	public void setSalaries(Salary[] salaries) {
		this.salaries = salaries;
	}
	
	public void addSalary(Salary salary){
		for(int i=0;i<salaries.length;i++){
			if(salaries[i]==null){
				salaries[i]=salary;
				break;
			}
		}
	}
	
}
