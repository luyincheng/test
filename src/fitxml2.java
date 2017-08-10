
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fitxml2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null; 
		//FileReader fr2=null;
        FileWriter fw=null;  
        try {  
            fr = new FileReader("c:/a.txt");  
           // fr2=new FileReader("c:/c.txt");
            fw= new FileWriter("c:/b.txt");  
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            System.out.println(e.getMessage());  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
          
        BufferedReader bf=new BufferedReader(fr);         
        BufferedWriter bw=new BufferedWriter(fw);         
        String str=null;//取一行  
       // StringBuffer strb = null;//对string的插入操作需要用StringBuffer类型          
        try {  
            while((str=bf.readLine())!=null){  //一行一行的读取全部内容  
                 // int a=str.indexOf("private String ");
            	if(!str.contains("column")){
            		continue;
            	}
            	str=str.trim();
                  int a=str.indexOf("column");
                  int b=str.indexOf("jdbcType");
                  int c=str.lastIndexOf("\"");
                  int d=str.indexOf("\" property");
                  String type=str.substring(b+10,c);
                  System.out.println("type-->"+type);
                  
                  String jdbctype=type;
                  String temp=str.substring(a+8,d);
                  System.out.println("temp-->"+temp);
                  //int b=temp.indexOf(";");
         //         int c=temp.length();
                  String name =temp;// temp.substring(0,c-1);
                  System.out.println(name);
                //  String newstring="<result column=\""+name+"\" property=\""+name+"\" jdbcType=\""+jdbctype+"\" />";
                 //String newstring="#{"+name+",jdbcType="+jdbctype+"},";//xml type 1
                // String newstring="<if test=\""+name+" != null\">"+name+",</if>";
                 String newstring="<if test=\""+name+" != null\">#{"+name+",jdbcType="+jdbctype+"},</if>";
                 //String newstring="<if test=\""+name+" != null\">"+name+"=#{"+name+",jdbcType="+jdbctype+"},</if>";
                //  String newstring=name+" = #{"+name+",jdbcType="+jdbctype+"},";
               //  String newstring=name+",";
                fw.write(newstring);  
                fw.write("\r\n");//写入换行  
            }      
            fw.flush();
            fw.close();
            fr.close();
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            System.out.println(e.getMessage());  
        }  
	}

}
