package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer1 = new ThreeDPrinter<Plastic>();
		printer1.setMaterial(new Plastic());
		Plastic plastic1 = printer1.getMaterial();
		System.out.println(printer1);
		
	
		printer1.printing();
		printer.printing();
	}

}
