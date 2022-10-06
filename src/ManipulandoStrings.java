
public class ManipulandoStrings {

	public static void main(String[] args) {
		
		String original = "AHDSFHAS sadhus aiiasISJA SAD asd";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		
		String s03 = original.trim();
		
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		
		String s06 = original.replace("A", "x");
		String s07 = original.replace("ABC", "xXx");
		
		String[] vect = original.split(" ");
		
		int i = original.indexOf("D");
		
			
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		
		System.out.println(i);
		
		System.out.println(vect);
		
	}

}
