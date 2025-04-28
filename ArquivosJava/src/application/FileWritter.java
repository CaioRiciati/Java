package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {

	public static void main(String[] args) {
		 String [] Lines = new String[] {"good Morning", "Good evening" , "Good night"};
		 
		 String path= "c:\\temp\\out.txt";
		 
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			 for (String line : Lines) {
				 bw.write(line);
				 bw.newLine();
			}
			}
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 

	}

}
