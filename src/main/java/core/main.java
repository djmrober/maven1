package core;

public class main {

	public static void main(String[] args) {
		System.out.println(helloBello());
	}
	
	public static String helloBello(){
		return "Hello Bello";		
	}
	
	public static HelloModel getModel(){
		HelloModel helloModel;		
		return new HelloModel("Tamas","Dávid");		
	}

	public static HelloModel getNullModel(){
		return null;		
	}
	
}
