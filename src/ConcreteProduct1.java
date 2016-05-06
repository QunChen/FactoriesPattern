
public class ConcreteProduct1 implements Product {

	private String description;
	
	public ConcreteProduct1(){
		description="ConcreteProduct1";
	}
	
	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		System.out.println(description);
	}

}
