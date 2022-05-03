package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DocFileCopyService {
	
	public static void copyFile (File fileIn, File fileOut) throws IOException {
		try (InputStream is = new FileInputStream(fileIn);
				OutputStream os = new FileOutputStream(fileOut)) {
				long copyByte = is.transferTo(os);
				System.out.println(copyByte + " байт скопировано");
		}
	}
	
	public static void copyFolder(File folderIn, File folderOut) throws IOException {
		
			File[] listOfFiles = folderIn.listFiles();
				for (File f : listOfFiles) {
					if (f.isFile() && f.getName().endsWith(".doc")) {
						File fileOut = new File (folderOut, f.getName());
						System.out.println(f.getName());
						copyFile(f, fileOut);
					}
				}
		}
}
