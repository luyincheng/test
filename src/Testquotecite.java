
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Testquotecite {
	private String a;
	
		public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

		public static void main(String[] args){
			Testquotecite testquotecite=new Testquotecite();
			testquotecite.setA("bbb");
			t.set(testquotecite);
			System.out.println(testquotecite.getA());
		}
}
class t{
	public static void set(Testquotecite t){
		t.setA("kk");
	}
}