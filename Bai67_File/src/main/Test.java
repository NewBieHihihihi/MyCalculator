package main;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		//Creating folder.
		File folder = new File("E:\\input.txt");
		System.out.println("File E:\\\\input.txt có tồn tại: "+folder.exists());
        File d1 = new File("E:\\output.txt\\oput.txt");
        d1.mkdir();//method create a folder
        
        File d2 = new File("E:\\nhatdeptrai\\nhatlmao\\nhatJAVA");
        d2.mkdirs();//method of creating multiple folders
        
        //Creating file
        File d3 = new File("E:\\inputt.txt");
        try {
			d3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
			System.out.println("Created a file successfully");
		}
        File d4 = new File("E:\\lienquan.exe");
        try {
			d4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
			System.out.println("Created a file successfully");
		}
	}

}
