
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Foodlist {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("d:/JAVA/JavaClass_foodlist/src/order.xlsx");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;
		while((str=bReader.readLine())!=null) {
			String line = new String(str);
			String[] a=new String[1000];
			a = line.split(",");
			System.out.println(a[1]);
		}
		bReader.close();
		fReader.close();

	}

}
