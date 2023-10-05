
public class Main {
	public static void main(String[] args) {
		String s1 = "NhatBlue.vn.vn"; 
		String s2 = "vn";
		char c1 = 'v';
		//ham indexOf tim tu trai sang phai
		System.out.println("s2 trong s1 la: "  + s1.indexOf(s2));
		System.out.println("s2 trong s1 tu vi tri thu 4: " + s1.indexOf(s2,4));
		System.out.println("C1 trong s1 la: " + s1.indexOf(c1));
		
		//ham lastindexof tim tu phai sang trai
		System.out.println("s2 trong s1 la: "  + s1.lastIndexOf(s2));
		
		String file = "FiFa.garena.exe";
		String check = ".exe";
		System.out.println(file.lastIndexOf(check));

		

	}

}
