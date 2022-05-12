package com.chainsys.Collecions;
/*prav3109
 * created on 28/04/2022
 * Fileoperations
 * createFile
 * renameFile
 * appendToFileUsingFileWriter
 * deleteFile
 * readFileName
 * copyFile
 * moveFile
 * modifyFile
 */ 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileOperations {
    public static void main(String[] args) throws IOException {
        //createFile();
        //renameFile();
        //appendToFileUsingFileWriter();
        //deleteFile();
        //readFileName();
        //copyFile();
        //moveFile();
         modifyFile();
    }
    public static void createFile()
    {
    try {  
    // Creating an object of a file  
    File q5 = new File("D:praveena.txt");   
      if (q5.createNewFile())
      {  
      System.out.println("File " + q5.getName() + " is created successfully.");  
      } 
      else {  
      System.out.println("File is already exist in the directory.");  
      }  
    } 
     catch (IOException exception) 
    {  
      System.out.println("An unexpected error is occurred.");  
      exception.printStackTrace();  
      }   
    }
    public static void renameFile()
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File file = new File("D:praveena.txt");
  
        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("D:Arivu.txt");
  
        // store the return value of renameTo() method in flag
        boolean flag = file.renameTo(rename);
  
        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
    }
    public static void appendToFileUsingFileWriter()
    {
    try(FileWriter fw = new FileWriter("D:praveena.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw))
        {
            out.println("Java is a easy method");
            //more code
            out.println("Java Developer");
            //more code
            System.out.println("Data added");
        } 
        catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    public static void deleteFile()
    {
        String fileName = "D:Arivu.txt";
        try {
            Files.delete(Paths.get(fileName));
            System.out.println("File Deleted");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
  public static void readFileName() throws IOException
   {
     String fileName ="D:praveena.txt";
     File file = new File(fileName);
     FileReader fr = new FileReader(file);
     BufferedReader br = new BufferedReader(fr);
     String line;
     while((line = br.readLine()) != null)
     {
     System.out.println(line);
        }
     }
     public static void copyFile()throws IOException
    	{
         FileInputStream fis = null;
    	 FileOutputStream fos = null;
    	     try {
    	         fis = new FileInputStream("D:\\praveena.txt");
    	         fos = new FileOutputStream( "D:\\temp\\pravi.txt");
    	       int s;
    	         while ((s = fis.read()) != -1) 
    	         {
    	            fos.write(s);
    	            }
    	         System.out.print("copied the file successfully");
    	        }
    	 
    	 finally
    	 {
    	    if (fis != null) 
    	    {
    	       fis.close();
    	      }
    	        if (fos != null) 
    	        {
    	           fos.close();
    	            }
    	        }
    	     }
     public static void moveFile() throws IOException 
     {   
     File file = new File("D:\\temp\\pravi.txt");
     if(file.renameTo
        (new File("D:\\Success\\Arivu.txt")))
     {
         file.delete();
         System.out.println("File moved successfully");
     }
     else
     {
         System.out.println("Failed to move the file");
         }
     }
     public static void modifyFile()throws IOException
     {
         String filePath = "D:\\Success\\Arivu.txt";
         Scanner sc = new Scanner(new File(filePath));
         StringBuffer buffer = new StringBuffer();
         while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
         }
         String fileContents = buffer.toString();
         System.out.println("Contents of the file: "+fileContents);
         sc.close();
         System.out.println("Enter the oldline : ");
         String oldLine = "Prithvi";
         String newLine = "PrithviSweety @9384 ";
         fileContents = fileContents.replaceAll(oldLine, newLine);
         FileWriter writer = new FileWriter(filePath);
         System.out.println("");
         System.out.println("new data: "+fileContents);
         writer.append(fileContents);
         writer.flush();
      }  
  }
