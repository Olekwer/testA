
public class ItCompany extends AbstaractCompany {
	private IDepertament[] depertaments=new IDepertament[4];
	
	public ItCompany(){
		this.createDepertament();
		
	}
	
	protected void createDepertament(){
		IDepertament backend=new Backend();
		IDepertament design=new Design();
		IDepertament frontend=new Frontend();
		IDepertament testing=new Testing();
		
		this.getDepertaments()[0]=backend;
		this.getDepertaments()[1]=design;
		this.getDepertaments()[2]=frontend;
		this.getDepertaments()[3]=testing;
	}
	
	@Override
	public double vychPoluchku(Month month) {
		double result=0;
		for (int i = 0; i < depertaments[2].getEmploys().length; i++) {
			Employ employ= depertaments[2].getEmploys()[i];
			for(int j=0; j<employ.getSalaries().length;j++){
				if(employ.getSalaries()[j].getMonth()==month){
					result=result+employ.getSalaries()[j].getSumma();
					break;
				}
			}
		}
		return result;
				
	}
	
	public IDepertament[] getDepertaments() {
		return depertaments;
	}

	public void setDepertaments(IDepertament[] depertaments) {
		this.depertaments = depertaments;
	}
	
}
