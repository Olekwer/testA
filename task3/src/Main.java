
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItCompany company=new ItCompany();
		Employ vitia=new Employ();
		Employ tolik=new Employ();
		Employ lena=new Employ();
		Employ vika=new Employ();
		
		company.getDepertaments()[2].addEmployee(vitia);
		company.getDepertaments()[2].addEmployee(tolik);
		company.getDepertaments()[2].addEmployee(lena);
		company.getDepertaments()[2].addEmployee(vika);
		
		vitia.addSalary(new Salary(Month.April, 156));
		tolik.addSalary(new Salary(Month.April, 133));
		lena.addSalary(new Salary(Month.April, 124));
		vika.addSalary(new Salary(Month.April, 176));
		
		
		for (int i = 0; i < company.getDepertaments()[2].getEmploys().length; i++) {
			System.out.println(company.getDepertaments()[2].getEmploys()[i]);
		}
		
		System.out.println(company.vychPoluchku(Month.April));
		
	}

}
