77. Write a java program to create a file and write contents, save and close the file.
import java.util.Scanner;
public class Abc {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		try{
			File f=new File("abc.txt");
			FileWriter fw=new FileWriter("xyz.txt");
			f.mkdir();
			fw.write(str);
			fw.flush();
			System.out.println("Inserted Sucessfully");
			fw.close();
	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}