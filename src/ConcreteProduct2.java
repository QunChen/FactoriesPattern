
public class ConcreteProduct2 implements Product {

	private String description;
	
	public ConcreteProduct2(){
		description="ConcreteProduct2";
	}
	
	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		System.out.println(description);
	}

}
