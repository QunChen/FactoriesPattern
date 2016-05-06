
public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod(int type) {
		Product product = null;
		
		if(type==1){
			product=new ConcreteProduct1();
		}
		
		if(type==2){
			product=new ConcreteProduct2();
		}
		
		return product;
	}

}
