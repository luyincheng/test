package ExcelTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
	//public String path;
	List<String> result=new ArrayList<String>();
	public List<String> traverseFolder2(String path) {//遍历文件夹
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return result;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        if(file2.getName().contains("png")){
                        	System.out.println("找到："+file2.getName());
                        file2.renameTo(new File(file2.getName().replace("png", "jpg")));
                        System.out.println("改名成功");
                        }
                        result.add(file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        return result;
    }
	public String traverseFolder(String filename,String path) {//查找文件返回路径
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return "";
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                      //  System.out.println("文件夹:" + file2.getAbsolutePath());
                        
                        String resultString=traverseFolder(filename,file2.getAbsolutePath());
                        if(!resultString.trim().equals("")){
                        	return resultString;
                        }
                    } else {
                    	String fn=file2.getName();
                    	if(filename.equals(fn)){
                    		return file2.getAbsolutePath();
                    	}
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        return "";
    }
	public void copyFile(String oldPath, String newPath) { 
	       try { 
	           int bytesum = 0; 
	           int byteread = 0; 
	           File oldfile = new File(oldPath); 
	           if (oldfile.exists()) { //文件存在时 
	               InputStream inStream = new FileInputStream(oldPath); //读入原文件 
	               FileOutputStream fs = new FileOutputStream(newPath); 
	               byte[] buffer = new byte[1444]; 
	               int length; 
	               while ( (byteread = inStream.read(buffer)) != -1) { 
	                   bytesum += byteread; //字节数 文件大小 
	                  // System.out.println(bytesum); 
	                   fs.write(buffer, 0, byteread); 
	               } 
	               inStream.close(); 
	               fs.close();
	               System.out.println("复制文件："+oldPath+" 至："+newPath+" 成功");
	           } 
	       } 
	       catch (Exception e) { 
	           System.out.println("复制单个文件操作出错"); 
	           e.printStackTrace(); 
	       } 
	   } 
	public static void main(String[] args){
		FileSearch fsFileSearch=new FileSearch();
		//fsFileSearch.path="F:\\JSBQWorkFileBigUser";
		List<String> resultString=fsFileSearch.traverseFolder2("F:\\meishu");
		//System.out.println(resultString);
	}
}
