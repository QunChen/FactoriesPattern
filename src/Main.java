
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator creator=new ConcreteCreator();
		
		creator.factoryMethod(1).showDescription();
		creator.factoryMethod(2).showDescription();
	}

}
