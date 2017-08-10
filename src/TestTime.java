
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1="2017-06-14 10:09:22";
		String date2="2017-06-14 10:22:33";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date_01;
		Date date_02;
		try {
			date_01 = sdf.parse(date1);
			date_02 = sdf.parse(date2);
			long result=date_01.getTime()-date_02.getTime();
			System.out.println("date_01->"+date_01.getTime());
			System.out.println("date_02->"+date_02.getTime());
			System.out.println("result->"+result/(1000*60));
			System.out.println("result->"+result%(1000*60));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
