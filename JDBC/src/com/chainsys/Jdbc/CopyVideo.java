package com.chainsys.Jdbc;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyVideo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	
	        FileSystem fileSys = FileSystems.getDefault();
	        Path srcPath = fileSys.getPath("D:\\WIN_20220505_16_57_03_Pro.mp4");
	        Path destPath = fileSys.getPath("C:\\app\\WIN_20220505_16_57_03_Pro.mp4");
	        try {
	            // TO COPY file1.txt from source to destination folder
	            Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("file copied");
	        } catch (IOException ioe) {
	            System.out.println("file not copy");
	        }
	    }
	}


