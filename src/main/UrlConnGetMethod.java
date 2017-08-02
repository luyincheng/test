package main;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 * @类名称: UrlConnGetMethod
 * @类描述: 使用HttpUrlConnection的GET方法请求数据
 * @创建人：LiXinYang
 * @创建时间：2015-2-26 下午6:41:50 
 * @备注：     
 * @version V1.0
 */
public class UrlConnGetMethod {
	
	/**
	  * 向服务器发送POST请求
	  * 
	  */
	 public static String Post(String param,String url){
			PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        try {
	            URL realUrl = new URL(url);
	            // 打开和URL之间的连接
	            URLConnection conn = realUrl.openConnection();
	            // 设置通用的请求属性
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            // 发送POST请求必须设置如下两行
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            // 获取URLConnection对象对应的输出流
	            out = new PrintWriter(conn.getOutputStream());
	            // 发送请求参数
	            out.print(param);
	            // flush输出流的缓冲
	            out.flush();
	            // 定义BufferedReader输入流来读取URL的响应
	            in = new BufferedReader(
	                    new InputStreamReader(conn.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("发送 POST 请求出现异常！"+e);
	            e.printStackTrace();
	        }
	        //使用finally块来关闭输出流、输入流
	        finally{
	            try{
	                if(out!=null){
	                    out.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(IOException ex){
	                ex.printStackTrace();
	            }
	        }
	        return result;
		}

	
	 /**
     * 根据流返回一个字符串信息         * 
     * @param is
     * @return
     * @throws IOException
     */
    public static String getStringFromInputStream(InputStream is)
                    throws IOException {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            // 模板代码 必须熟练
            byte[] buffer = new byte[1024];
            int len = -1;
            // 一定要写len=is.read(buffer)
            // 如果while((is.read(buffer))!=-1)则无法将数据写入buffer中
            while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
            }
            is.close();
            String state = os.toString();// 把流中的数据转换成字符串,采用的编码是utf-8(模拟器默认编码)
            os.close();
            return state;
    }
}
