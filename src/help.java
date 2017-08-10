
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.mysql.fabric.xmlrpc.base.Array;

public class help {
	public static void main(String[] args){
		int[] a={5,4,3,2,1,5};
		int[] b=new int[a.length];
		int p=0;
		for(int i=0;i<a.length;i++){
			boolean aa=true;
			for(int j = 0;j<b.length;j++){
				if(b[j]==a[i]){
					aa=false;
					break;
				}
			}
			if(aa){
				b[i]=a[i];
				p++;
			}
		}
		a=b;
		for(int i=0;i<p;i++){
			//int c=a[i];
			for(int j=0;j<p;j++){
				if(a[i]>a[j]){
					int c=a[j];
					a[j]=a[i];
					a[i]=c;
				}
				
			}
			//b[i]=c;
		}
		System.out.println("第二大："+a[1]);
		System.out.println("第二小："+a[p-2]);
		
		/*int[] a={9,8,4,5,8,4,2,1,5,5};
		int result=0;
		int[] b=new int[a.length];
		int c=0;
		boolean has=false;
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				continue;
			}
			boolean hascompare=false;
			for(int k=0;k<c;k++){
				if(i==b[k]){
					hascompare=true;
					break;
				}
			}
			if(hascompare){
				hascompare=false;
				continue;
			}
			for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				has=true;
				b[c]=j;
				c++;
			}
			}
			if(has){
				has=false;
				result++;
				System.out.println(i);
			}
		}
		System.out.println(result);*/
		/*String b =Integer.toBinaryString(a);
		System.out.println(Integer.toBinaryString(12));*/
		/*String date="02/23/2014";
		boolean result=help.isLeapYear(date);
		if(result)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}*/
		/*String aString="helloworld";
		char[] a=aString.toCharArray();
		int[] s=new int[a.length];
		int k=0;
		int[] status=new int[a.length];
		int result=0;
		boolean flag=false;
		boolean falg2=false;
		for(int i=0;i<a.length;i++){
			for(int o=0;o<s.length;o++){
				if(i==s[o]&&i!=0){
					falg2=true;
					break;
				}
			}
			if(falg2){
				falg2=false;
				continue;
			}
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					s[k]=j;
					k++;
					result++;
					flag=true;
					status[i]=1;
					status[j]=1;
				}
			}
			if(flag){
				result++;
				flag=false;
			}
		}
		flag=true;
		for(int i=0;i<status.length;i++){
			//System.out.println(status.length+":"+status[i]);
			if(status[i]!=1){
				flag=false;
				break;
			}
		}
		if(flag){
			result=-1;
		}
		System.out.println(result);
		
*/
		/*String aString = "thisssdwa";
		if(aString.length()%2==0){
			char[] a=aString.toCharArray();
			for(int i =0;i<aString.length();i++){
				char b=a[i];
				a[i]=a[i+1];
				a[i+1]=b;
				i++;
			}
			aString=new String(a);
		}else{
			char[] a=aString.toCharArray();
			for(int i =0;i<aString.length()-1;i++){
				char b=a[i];
				a[i]=a[i+1];
				a[i+1]=b;
				i++;
			}
			aString=new String(a);
		}
		System.out.println(aString);*/
	}
	public static boolean isLeapYear(String date)
	{
		//Fill your Code here
		date=date.substring(date.lastIndexOf("/")+1,date.length());
		int iYear= Integer.parseInt(date);
		if (iYear % 4 == 0 && iYear % 100 != 0) {
			return true;
		} else {
			if (iYear % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	/*public static void run(List<Integer> aList){
		System.out.println("请输入数字");
		 Scanner input = new Scanner(System.in);
		 String s=input.next();
		boolean isNum = s.matches("[0-9]+"); 
		if(isNum){
			int o=Integer.parseInt(s);
			aList.add(o);
			System.out.println("数组长度："+aList.size());
			int sum=0;
			for(int i=0;i<aList.size();i++){
				if(isnum(aList.get(i))){
				sum+=aList.get(i);
				}
			}
			System.out.println("数组中质数和："+sum);
			System.out.println("是否继续y/n");
			if(input.next().equals("y")){
				run(aList);
			}else{
				System.out.println("退出！");
			}
		}else{
			System.out.print("不是数字！");
			run(aList);
		}
	}
	public static boolean isnum(int q){
		for(int i=2;i<q;i++){
			if(q%i==0){
				return false;
			}
		}
		return true;
	}*/
	/*public static void my(){
		 Scanner input = new Scanner(System.in);
		 String s=input.next();
		 if((s.charAt(0)>='a'&&s.charAt(0)<='z')||(s.charAt(0)>='A'&&s.charAt(0)<='Z')){
			 System.out.println("请输入数字");
			 my();
		 }
		else if(s.charAt(0)>='0'&&s.charAt(0)<='9'){
			 System.out.println("这是一个数字:"+s);
		 int o=Integer.parseInt(s);
		 int status=0;
		 int result=0;
		 for(int i=1;i<o;i++){
			 if(o%i==0){
				 status++;
				 if(status==2){
					 result=i;
					 break;
				 }
			 }
		 }
		 if(result==0){
			 System.out.println("输入大于2的数！");
			 my();
		 }
		 System.out.println("第二个最大公约数："+result);
	}
	}*/
}
