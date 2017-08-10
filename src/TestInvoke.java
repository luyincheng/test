
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

public class TestInvoke {
	private List<String> aDate;
	
	public static void main(String[] args){
		TestInvoke testInvoke=new TestInvoke();
		try {
			Field field = testInvoke.getClass().getDeclaredField("aDate");
			String type = field.getType().getName();  
			System.out.println(type);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
