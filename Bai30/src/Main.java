
public class Main {
	public static void main(String[] args) {
		Date a = new Date(8,5,2004);
		Date b = new Date(12,6,2001);
		Date c = new Date(8,5,2004);
		System.out.println("To String A: " + a);
		System.out.println("To String B: " + b);
		System.out.println("To String C: " + c);
		System.out.println("Hash Code(Ham Bam A): "+ a.hashCode());
		System.out.println("Hash Code(Ham Bam B): "+ b.hashCode());
		System.out.println("Hash Code(Ham Bam C): "+ c.hashCode());
		System.out.println("Date a == Date b: " + (a == b));
		System.out.println("Date a != Date b: " + (a != b));
		System.out.println("Date a == Date c: " + a.equals(c));
	}

}
