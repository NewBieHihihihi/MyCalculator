package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class ViDu_Border_LayOut extends JFrame{
	public ViDu_Border_LayOut()
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
		BorderLayout borderlayout = new BorderLayout();
		BorderLayout borderlayout_1 = new BorderLayout(15,15);
  
		//thêm latout vào Gui
		this.setLayout(borderlayout);
		
		//Tạo nút
		JButton button_1 = new JButton("Tiến Đạt");
		JButton button_2 = new JButton("L.Messi");
		JButton button_3 = new JButton("C.Ronaldo");
		JButton button_4 = new JButton("Neymar J");
		JButton button_5 = new JButton("R.Lewandowski");


        
		//thêm nút vào GUI
		this.add(button_1, BorderLayout.NORTH);
		this.add(button_2, BorderLayout.SOUTH);
		this.add(button_3, BorderLayout.WEST);
		this.add(button_4,BorderLayout.EAST);
		this.add(button_5, BorderLayout.CENTER);
		
		//thoát chương trình
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//cho phép tạo cửa sổ
		this.setVisible(true);
	}
	public static void main(String[] args) {
	  new ViDu_Border_LayOut();	
	}

}
