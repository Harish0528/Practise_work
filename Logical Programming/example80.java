import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.Scanner;
public class example80 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		try {
			
			FileReader fr=new  FileReader("example1.tx");
			FileWriter fw=new FileWriter("D://sravani/files/example2.txt");
			int ch=0;
			while((ch=fr.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			
			fw.flush();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}