package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
	public static void xoaFile(File file)
	{
		if(file.isFile())//if file. then delete.
		{
			System.out.println("Xoa Tap Tin: " + file.getAbsolutePath());
			file.delete();
		}else if(file.isDirectory())
		{
			File[] con = file.listFiles();
			for(File x: con)
			{
				xoaFile(x);
			}
			System.out.println("Xoa Thu Muc: " + file.getAbsolutePath());
			file.delete();
		}
	}
	public static void main(String[] args) {
		//delete file by class File
		File f1 = new File("E:\\Garena-v2.0-VN");
        File f2 = new File("E:\\XoaToiDi");
//        f2.mkdirs();
       // test.xoaFile(f2);
		Path p = f1.toPath();
		Path p1 = f2.toPath();
		try {
			Files.deleteIfExists(p);
			Files.deleteIfExists(p1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
