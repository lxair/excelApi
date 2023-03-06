package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.junit.Test;


public class HeadwaterFow {
	
	public static void read()  throws IOException  {

	ArrayList<String> array = new ArrayList<String>();

		array.add("123.5" + " ");
		array.add("256.3" + " ");
		array.add("62.3" + " ");
		array.add("725.2" + " ");
		array.add("825.2" + " ");
		array.add("978.3" + " ");
		array.add("123.5" + " ");
		array.add("256.3" + " ");
		array.add("62.3" + " ");
		array.add("725.2" + " ");
		array.add("825.2" + " ");


		//创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\demo.txt"));

		//遍历集合，得到每一个字符串数据
        for(String s : array) {
			//调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

		//释放资源
        bw.close();
	}
	
	public static void writewater()  throws IOException{
		
		List x = new ArrayList();

	     String fileName = "C:\\Users\\PC\\Desktop\\demo.txt";
	     File file = new File(fileName);
	     FileReader fr = new FileReader(file);
	     BufferedReader br = new BufferedReader(fr);
	     String line;
	     System.out.println("Read text file using BufferedReader");
	     while ((line = br.readLine()) != null) {
	         String[] s =line.split(" ");
	         x.add(s[0]);

     }
	     System.out.println(x);

		// 这个开始就是excel的操作，先找到excel地址
	     String url="C:\\Users\\PC\\Desktop\\副本a.xls";
	     FileInputStream fs;
	     fs = new FileInputStream(url);
	     POIFSFileSystem ps=new POIFSFileSystem(fs); //使用POI提供的方法得到excel的信息
	     HSSFWorkbook wb=new HSSFWorkbook(ps);
	     HSSFSheet sheet=wb.getSheetAt(2); //获取到工作表，因为一个excel可能有多个工作表
	     HSSFRow row=sheet.getRow(0);
	
	     FileOutputStream out=new FileOutputStream(url);//xls中写数据
         
         row = sheet.getRow(12);
         row.getCell(2).setCellValue((String)x.get(0)); //设置第一个（从0开始）单元格的数据,这个是调节列数的
         
         row = sheet.getRow(15);
         row.getCell(2).setCellValue((String)x.get(0));
         
//         row = sheet.getRow(19);
//         row.getCell(2).setCellValue((String)x.get(0));
//
//         row = sheet.getRow(22);
//         row.getCell(2).setCellValue((String)x.get(0));
//
//         row = sheet.getRow(32);
//         row.getCell(2).setCellValue((String)x.get(0));
//
//         row = sheet.getRow(37);
//         row.getCell(2).setCellValue((String)x.get(0));
//
//         row = sheet.getRow(39);
//         row.getCell(2).setCellValue((String)x.get(0));
//
//         row = sheet.getRow(42);
//         row.getCell(2).setCellValue((String)x.get(0));
        
//         row = sheet.getRow(46);
//         row.getCell(2).setCellValue((String)x.get(0));
//         
//         row = sheet.getRow(49);
//         row.getCell(2).setCellValue((String)x.get(0));
	     
         out.flush();
	     wb.write(out);
	     out.close();
	 }
	public void testMacro() {
		JacobExcelTool tool = new JacobExcelTool();
		//打开
		tool.OpenExcel("C:\\Users\\PC\\Desktop\\副本a.xls", false, false);
		Dispatch sheet = tool.getSheetByName("Headwater");
//        for (int i = 2; i <= 7; i++) {
//            tool.setValue(sheet, "B" + i, "value", i * 1.2);
//        }
		//调用Excel宏
		tool.callMacro("宏1");
		System.out.println("执行宏操作完成");
		//调用Excel宏
		//tool.callMacro("样式设置");
//        Variant num = tool.getValue("A10", sheet);
//        System.out.println(num);
		//关闭并保存，释放对象
		tool.CloseExcel(true, true);
	}
		
	}


