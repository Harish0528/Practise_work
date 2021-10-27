import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.Scanner;
public class example81 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		try {
			
			FileReader fr1=new  FileReader("example1.tx");
			FileReader fr2=new FileReader("D://sravani/files/example2.txt");
			FileWriter fw=new FileWriter("example2.txt");
			int ch=0;
			while((ch=fr1.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			while((ch=fr2.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			fw.flush();
			
			System.out.println("sucessfully inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}