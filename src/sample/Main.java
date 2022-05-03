package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folderIn = new File("E:\\java_test");
	    File folderOut = new File("E:\\java_doc_only");
	    folderOut.mkdirs();
		
		try {
			DocFileCopyService.copyFolder(folderIn, folderOut);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
