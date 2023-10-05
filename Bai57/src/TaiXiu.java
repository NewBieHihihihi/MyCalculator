import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double tk = 5000;
	    Scanner sc = new Scanner(System.in);
	    int choice;
	    do
	    {
	    	System.out.println("Chọn 1 để tiếp tục chơi.");
	    	System.out.println("Nhấn phím bất kỳ để thoát");
	    	System.out.print("Chọn: ");
	    	choice = sc.nextInt();
	    	if(choice == 1)
	    	{
	    		System.out.println("----BẮT ĐẦU CHƠI----");
	    		//Đặt cược
	    		System.out.println("Tài Khoản Của Bạn Có: " + tk);
	    		double datcuoc;
	    		do
	    		{
	    			System.out.println("Bạn Muốn Đặt Cược: ");
	    			datcuoc = sc.nextDouble();
	    		}while(datcuoc <= 0 || datcuoc > 5000);
	    		//Chọn Tài Hoặc Xỉu
	    		int chontx;
	    		do
	    		{
	    		System.out.println("Chọn Số 1 Là Tài 2 Là Xỉu");
	    		System.out.println("Chọn: ");
	    		chontx = sc.nextInt();
	    		if(chontx == 1)
	    		{
	    			System.out.println("Bạn đã chọn tài.");
	    		}
	    		else
	    		{
	    			System.out.println("Bạn đã chọn xỉu.");
	    		}
	    		}while(chontx < 1 || chontx > 2);
	    	}
	    	else
	    	{
	    		System.out.println("Exit.6");
	    		break;
	    	}
	    }while(choice == 1);
	}

}
