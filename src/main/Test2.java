package main;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test2 {
	private static final String PATH = "http://www.yikdata.com/FunCar/Do.php";

	// public static final String ad_URL =
	// "http://www.yikdata.com/wl_shanghaidemo/getADs.php";
	// public static final String carID = "1000001";

	public static void main(String args[]) {
		String filePath = "E:/test.txt";
		List<String[]> list = readFileByLines(filePath);
		for (int i = 0; i < 9; i++) {
			new Thread1(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread2(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread3(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread4(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread5(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread6(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread7(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread8(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread9(i, list).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread10(i, list).start();
		}
		// new Thread3(list).start();
	}

	static class Thread1 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread1(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10024) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread2 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread2(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10045) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread3 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread3(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10055) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread4 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread4(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10065) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread5 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread5(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10075) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread6 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread6(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10085) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread7 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread7(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10095) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread8 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread8(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10105) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread9 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread9(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10115) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	static class Thread10 extends Thread {
		private List<String[]> list;
		private int count;

		public Thread10(int count, List<String[]> list) {
			this.list = list;
			this.count = count;
		}

		public void run() {
			for (int i = count; i < list.size(); i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// while (target == 2 || target == 3) {
				// try {
				// wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude + "  " + getCurrentTime());
				String params = "action=Location" + "&userid="
						+ String.valueOf(count + 10125) + "&lat=" + latitude
						+ "&lon=" + longitude + "&location=" + "南京";
				UrlConnGetMethod.Post(params, PATH);
			}
		}
	}

	// static class Thread2 extends Thread {
	// private List<String[]> list;
	// private int count;
	//
	// public Thread2(int count,List<String[]> list) {
	// this.list = list;
	// this.count = count;
	// }
	//
	// public void run() {
	// for (int i = count; i < list.size(); i++) {
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// // while (target == 2 || target == 3) {
	// // try {
	// // wait();
	// // } catch (InterruptedException e) {
	// // e.printStackTrace();
	// // }
	// // }
	// String[] str = list.get(i);
	// String latitude = str[0];
	// String longitude = str[1];
	// System.out.println("m1  " + "latitude=" + latitude
	// + "  longitude=" + longitude + "  " + getCurrentTime());
	// uploadPos(String.valueOf(count+10091), latitude, longitude);
	// }
	// }
	// }

	private static String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}

	static class Test {
		int count;
		volatile int target = 1;
		private List<String[]> list;

		public Test(List<String[]> list) {
			this.list = list;
		}

		synchronized void m1() {
			for (int i = 0; i < list.size(); i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while (target == 2 || target == 3) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m1  " + "latitude=" + latitude
						+ "  longitude=" + longitude);
				// uploadPos("10084", latitude, longitude);
				target = 2;
				notifyAll();
			}
		}

		synchronized void m2() {
			for (int i = 1; i < list.size(); i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while (target == 1 || target == 3) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m2  " + "latitude=" + latitude
						+ "  longitude=" + longitude);
				// uploadPos("10085", latitude, longitude);
				target = 3;
				notifyAll();
			}
		}

		synchronized void m3() {
			for (int i = 2; i < list.size(); i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while (target == 1 || target == 2) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String[] str = list.get(i);
				String latitude = str[0];
				String longitude = str[1];
				System.out.println("m3  " + "latitude=" + latitude
						+ "  longitude=" + longitude);
				// uploadPos("10086", latitude, longitude);
				target = 1;
				notifyAll();
			}
		}
	}

	// 上传位置的方法
	// public static void uploadPos(String userid, String latitude,
	// String longitude) {
	// //
	// userid=%s&grpno=%s&latitude=%s&longitude=%s&lasttime=%s&isshow=%d&distance=%s&isservice=%d
	// String url = String.format(PATH, userid, "200061", latitude, longitude,
	// "", 1, "10", 0);
	// HttpURLConnection conn = null;
	// try {
	// URL httpUrl = new URL(url);
	// conn = (HttpURLConnection) httpUrl.openConnection();
	// conn.setRequestMethod("GET");
	// conn.setConnectTimeout(10000); // 连接超时10秒
	// conn.setReadTimeout(10000); // 读取超时5秒
	// int responseCode = conn.getResponseCode(); // 获取返回的响应码
	// if (responseCode == 200) {
	// InputStream inputStream = conn.getInputStream();
	// String stream = getStringFromInputStream(inputStream);
	// System.out.println(stream);
	// } else {
	// System.out.println("" + responseCode);
	// }
	// } catch (MalformedURLException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * 根据流返回一个字符串信息 *
	 * 
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

	/**
	 * 以行为单位读取文件，常用于读面向行的格式化文件
	 */
	public static List<String[]> readFileByLines(String fileName) {
		List<String[]> list = new ArrayList<String[]>();
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				String[] str = tempString.split(";");
				list.add(str);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return list;
	}
}
