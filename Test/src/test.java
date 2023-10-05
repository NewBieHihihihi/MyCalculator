import java.util.Random;

public class test {
    public static void main(String[] args) {
    	Random random = new Random(System.currentTimeMillis());
		int xx1_min = 1,xx1_max = 6;
		int xx1 = random.nextInt(xx1_max - xx1_min + 1) + xx1_min;
		System.out.println(xx1);
        }
}