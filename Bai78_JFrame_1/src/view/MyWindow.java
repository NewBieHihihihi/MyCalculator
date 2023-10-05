package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void showGUI()//cho phép hiển thị cửa sổ
	{
		this.setVisible(true);
	}
    //@over_loading
	public void showGUI(String title)//cho phép hiển thị với tên tiêu đề
	{
		this.setTitle(title);
		this.setVisible(true);
	}
	//@over loading
	public void showGUI(String title,int x,int y)//cho phép hiển thị với tên tiêu đề và kích thước
	{
		this.setTitle(title);
		this.setSize(x, y);
		this.setVisible(true);
	}
	public void showGUIz(String title,int x,int y,int x1,int x2,String icons)//cho phép hiển thị với tên tiêu đề và kích thước
	{
		ImageIcon icon = new ImageIcon(icons);
		this.setTitle(title);
		this.setSize(x, y);
		this.setLocation(x1, x2);
		this.setIconImage(icon.getImage());
		this.setVisible(true);
	}

}
