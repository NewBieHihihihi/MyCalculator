package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class vidu {
	public static void copyAll(File f1,File f2)
	{
		try {
			Files.copy(f1.toPath(), f2.toPath(),StandardCopyOption.REPLACE_EXISTING );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory())
		{
			File[] mangcon = f1.listFiles();
			for(File file : mangcon)
			{
				File nw = new File(f2.getAbsoluteFile()+"/"+file.getName());
				copyAll(file,nw);
			}
		}
	}
	public static void main(String[] args) {
		File f1 = new File("E:\\anhyêem.txt");
		File f2 = new File("E:\\anhyeuem.txt");
		File f3 = new File("E:\\anhyeuemVERY_MUCH.txt");
		// Thay đổi tên tập tin hoặc thư mục
		// Sử dụng file để thay đổi tên
//		/*
		// f1.renameTo(f2); 
		 //Sử dụng files để thay đổi tên 
//		 try {
//		 Files.move(f2.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		 }catch(IOException e) 
//		 { 
//			 e.printStackTrace(); 
//		 }
//		// Di chuyển file
		
		 /* File f4 = new File("E:\\XoaToiDi\\anhyeuemVERY_MUCH.txt"); try {
		  Files.move(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING); }
		  catch (IOException e) { 
			  e.printStackTrace(); } 
		  }
	*/
		//Copy file
		File xoatoidi = new File("E:\\XoaToiDi");
		File xoatoidi_copy = new File("E:\\XoaToiDi_Copy");
		/*
		 * try { Files.copy(xoatoidi.toPath(), xoatoidi_copy.toPath(),
		 * StandardCopyOption.REPLACE_EXISTING); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		vidu.copyAll(xoatoidi, xoatoidi_copy);

}
}

