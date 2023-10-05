import javax.swing.*;

public class test {
    public static void main(String[] args) {
        // Tạo một JFrame (cửa sổ)
        JFrame frame = new JFrame("GUI Nhấn vào đây hehehe");
        
        // Tạo một JButton (nút)
        JButton button = new JButton("Nhấn vào đây");
        
        // Đặt kích thước của nút
        button.setBounds(50,50,150,30);
        // Thêm nút vào cửa sổ
        frame.add(button);
        
        // Đặt kích thước của cửa sổ
        frame.setSize(300,200);
        
        // Đặt loại kết thúc mặc định khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hiển thị cửa sổ
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
