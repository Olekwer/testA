
public class Frontend implements IDepertament {
	
	private Employ[] employs=new Employ[4];
	
	@Override
	public void addEmployee(Employ employ) {
		for(int i=0; i<this.getEmploys().length;i++){
			if(this.getEmploys()[i]==null){
				this.getEmploys()[i]=employ;
				break;
			}
			
		}
		
	}
	@Override
	public void dellEmployee() {
		// TODO Auto-generated method stub
		
	}
	public Employ[] getEmploys() {
		return employs;
	}
	public void setEmploys(Employ[] employs) {
		this.employs = employs;
	}
}
