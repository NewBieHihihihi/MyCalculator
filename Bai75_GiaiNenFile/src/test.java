import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("compressed.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		File fileToZip = new File("E:\\input.txt");
		
		ZipEntry zipEntey = new ZipEntry(fileToZip.getName());
		zipOut.putNextEntry(zipEntey);
	}
}
