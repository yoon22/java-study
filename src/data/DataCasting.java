package data;

public class DataCasting {
	public static void main(String[]args) {
		Byte b = new Byte((byte)10);
		Short s = new Short((short)10);
		Integer i = new Integer(10); //
		Long l = new Long(10);
		
		Float f = new Float(1.2f);
		Double d = new Double(1.2);
		Character c = new Character('c');
		Boolean bl = new Boolean(true);
		
		String numStr = "123.5";
		d = Double.parseDouble(numStr);		
		int num = d.intValue();
		System.out.println(num+1);
		
		System.out.println(d+1);
	}
}
