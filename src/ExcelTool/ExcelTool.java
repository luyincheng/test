package ExcelTool;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 这是我用来读取excel文件的工具类，支持xls、xlsx、csv三种格式，支持少量和大量数据导入 
 * title:ExcelTool
 * description: 
 * company:南京宜开数据分析技术有限公司
 */
public class ExcelTool {
	private boolean status=false;//追加写入
	public static String PATH ="E:"+ File.separator+"物业"+File.separator+"物业数据"+File.separator+"物业数据"+File.separator+"第二次数据"+File.separator;

	/*public static String upload(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		File f1 = new File(PATH);
		if (!f1.exists()) {
			f1.mkdirs();
		}
		DiskFileItemFactory fac = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(fac);
		upload.setHeaderEncoding("utf-8");
		List<FileItem> fileList = null;
		try {
			fileList = upload.parseRequest(request);
		} catch (FileUploadException ex) {
			ex.printStackTrace();
		}
		Iterator<FileItem> it = fileList.iterator();
		String name = "";
		while (it.hasNext()) {
			FileItem item = it.next();
			if (!item.isFormField()) {
				name = item.getName();
				long size = item.getSize();
				String type = item.getContentType();
				System.out.println(size + " " + type);
				if (name == null || name.trim().equals("")) {
					continue;
				}
				File saveFile = new File(PATH + name);
				try {
					item.write(saveFile);
					System.out.print(saveFile.getPath());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return name;
	}*/

	@SuppressWarnings("unused")
	public void writer(String path, String fileName, String fileType,String[][] data) throws IOException {
		int rownums=0;
		Workbook wb = null;
		Sheet sheet=null;
		if(this.status){
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(path + fileName + "." + fileType));
			int rowSize = 0;
			
			if (fileType.equals("xls")) {
				wb = new HSSFWorkbook(in);
			} else if (fileType.equals("xlsx")) {
				wb = new XSSFWorkbook(in);
			} else {
				System.out.println("您输入的excel格式不正确");
			}
			sheet = wb.getSheetAt(0);
			rownums=sheet.getLastRowNum()+1;
	     	in.close();
		}else{
			if (fileType == null || fileType.isEmpty()) {
				System.out.println("文件名不符合规范！");
			} else if (fileType.equals("xls")) {
				wb = new HSSFWorkbook();
			} else if (fileType.equals("xlsx")) {
				wb = new XSSFWorkbook();
			} else {
				System.out.println("您的文档格式不正确！");
			}
			sheet =(Sheet) wb.createSheet("sheet1");
			rownums=0;
		}
     
		// 创建sheet对象
		Sheet sheet1 = sheet;
		// 循环写入行数据
		for (int i = 0; i < data.length; i++) {
			Row row = (Row) sheet1.createRow(i+rownums);
			// 循环写入列数据
			int c=20;
			if(data[i].length<c){
				c=data[i].length;
			}
			for (int j = 0; j <c; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(data[i][j]);
			}
		}
		// 创建文件流
		OutputStream stream = new FileOutputStream(path + fileName + "." + fileType);
		// 写入数据
		wb.write(stream);
		// 关闭文件流
		stream.close();
	}

	/*@SuppressWarnings("resource")
	public static String[][] read( String fileName, String fileType) throws IOException {
		InputStream stream = new FileInputStream(PATH + fileName + "." + fileType);
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook(stream);
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook(stream);
		} else {
			System.out.println("您输入的excel格式不正确");
		}
		Sheet sheet1 = wb.getSheetAt(0);
		for (Row row : sheet1) {
			for (Cell cell : row) {

				System.out.print(cell.getStringCellValue() + "  ");
			}
			System.out.println();
		}
		return null;
	}*/

	@SuppressWarnings("resource")
	public static String[][] read(String fileName, String fileType, int ignoreRows,String filepath) throws IOException {
		// InputStream stream = new FileInputStream(path + fileName + "." +
		// fileType);
		BufferedInputStream in=null;
		if(filepath==null){
		 in = new BufferedInputStream(new FileInputStream(PATH + fileName + "." + fileType));
		// FileSystem fs = new POIFSFileSystem(in);
		}else{
			 in = new BufferedInputStream(new FileInputStream(filepath));
		}
		List<String[]> result = new ArrayList<String[]>();
		int rowSize = 0;
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook(in);
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook(in);
		} else {
			System.out.println("您输入的excel格式不正确");
		}
		Cell cell = null;
		// sheet 遍历sheets
		for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
			Sheet sheet = wb.getSheetAt(sheetIndex);
			// row 第一行为标题，不取 遍历rows
			for (int rowIndex = ignoreRows; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				if (row == null) {
					continue;
				}
				int tempRowSize = row.getLastCellNum() + 1;
				if (tempRowSize > rowSize) {
					rowSize = tempRowSize;
				}
				String[] values = new String[rowSize];
				Arrays.fill(values, "");
				boolean hasValue = false;
				// cell 遍历cells 得到整行数据
				for (short columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) {
					String value = "";
					cell = row.getCell(columnIndex);
					if (cell != null) {
						// 注意：一定要设成这个，否则可能会出现乱码
						// cell.setEncoding();
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							value = cell.getStringCellValue();
							break;
						case Cell.CELL_TYPE_NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								Date date = cell.getDateCellValue();
								if (date != null) {
									value = new SimpleDateFormat("yyyy-MM-dd").format(date);
								} else {
									value = "";
								}
							} else {
								value = new DecimalFormat("0").format(cell.getNumericCellValue());
							}
							break;
						case Cell.CELL_TYPE_FORMULA:
							// 导入时如果为公式生成的数据则无值
							if (!cell.getStringCellValue().equals("")) {
								value = cell.getStringCellValue();
							} else {
								value = cell.getNumericCellValue() + "";
							}
							break;
						case Cell.CELL_TYPE_BLANK:
							break;
						case Cell.CELL_TYPE_ERROR:
							value = "";
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							value = (cell.getBooleanCellValue() == true ? "Y" : "N");
							break;
						default:
							value = "";
						}
					}
					if (columnIndex == 0 && value.trim().equals("")) {
						break;
					}
					values[columnIndex] = rightTrim(value);
					hasValue = true;
				}
				if (hasValue) {
					result.add(values);
				}
			}
		}
		in.close();
		String[][] returnArray = new String[result.size()][rowSize];
		for (int i = 0; i < returnArray.length; i++) {
			returnArray[i] = (String[]) result.get(i);
		}
		return returnArray;
	}

	public static StringBuilder createSecret(){
		Math.random();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<12;i++){
			int tmp = (int) Math.floor(10*Math.random());
			sb.append(tmp);
		}
		return sb;
	}
	/**
	 * 
	 * 去掉字符串右边的空格
	 * 
	 * @param str
	 *            要处理的字符串
	 * @return 处理后的字符串
	 */
	private static String rightTrim(String str) {
		if (str == null) {
			return "";
		}
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			if (str.charAt(i) != 0x20) {
				break;
			}
			length--;
		}
		return str.substring(0, length);
	}
	
}
