package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayOut extends JFrame{
	public ViDu_FlowLayOut()
	{
		ImageIcon AnhFiFa = new ImageIcon("C:\\Users\\bluez\\OneDrive\\Pictures\\a662b37b1701adef68baa2fd7eefe394.jpg");
		//đặt tiêu đề cho GUI
		this.setTitle("FIFA 15");
		//kích thước cho GUI
		this.setSize(750, 500);
		//gắn icon vào GUI
		this.setIconImage(AnhFiFa.getImage());
		//căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//Tạo flowLayOut
		FlowLayout flowlayout = new FlowLayout();
		FlowLayout flowlayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowlayout_2 = new FlowLayout(FlowLayout.CENTER,50,10);

		//thêm latout vào Gui
		this.setLayout(flowlayout_2);
		
		//Tạo nút
		JButton button_1 = new JButton("Who is best?");
		JButton button_2 = new JButton("L.Messi");
		JButton button_3 = new JButton("C.Ronaldo");
        
		//thêm nút vào GUI
		this.add(button_1);
		this.add(button_2);
		this.add(button_3);
		
		//thoát chương trình
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//cho phép tạo cửa sổ
		this.setVisible(true);
	}
	public static void main(String[] args) {
	  new ViDu_FlowLayOut();	
	}

}
