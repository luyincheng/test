
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ll {
	public static void main(String[] args) throws IOException{
		//Integer aInteger = Integer.parseInt("23.12");
		float af=Float.parseFloat("23.21");
		System.out.println(af);
		String a = "^[0-9]+(.[0-9]{0,3})?$";
		String testString = "23.12";
		if(testString.matches(a)){
			System.out.println("OK");
		}else{System.out.println("NO");}
		/*long a=60031;
		long b=60090;
		
		try {
			BufferedWriter bWriter=new BufferedWriter( new OutputStreamWriter(new FileOutputStream("c:/方案二.txt")));
			for(long i=a;i<=b;i++){
				if(i<=99999){
				bWriter.write("0000000000"+i);
				bWriter.write("\r\n");
				}else{
					bWriter.write("0000"+i);
					bWriter.write("\r\n");
				}
			}
			bWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
