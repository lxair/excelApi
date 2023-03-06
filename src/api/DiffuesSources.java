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

import com.jacob.com.Dispatch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class DiffuesSources {
	
	
	public static void readInorganicdata()  throws IOException  {

	ArrayList<String> array = new ArrayList<String>();

		array.add("123.5" + " ");
		array.add("256.3" + " ");
		array.add("62.3" + " ");
		array.add("725.2" + " ");


	//创建字符缓冲输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\demo1.txt"));

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


	public static void Inorganicdata()  throws IOException{
	
		 List x = new ArrayList();
	
	    String fileName = "C:\\Users\\PC\\Desktop\\demo1.txt";
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
	    String url="C:\\Users\\PC\\Desktop\\a.xls";
	    FileInputStream fs;
	    fs = new FileInputStream(url);
	    POIFSFileSystem ps=new POIFSFileSystem(fs); //使用POI提供的方法得到excel的信息
	    HSSFWorkbook wb=new HSSFWorkbook(ps);
	    HSSFSheet sheet=wb.getSheetAt(13); //获取到工作表，因为一个excel可能有多个工作表
	    HSSFRow row=sheet.getRow(0);
	
	    FileOutputStream out=new FileOutputStream(url);//向.xls中写数据;
	
	    
	    for (int i = 0; i < x.size();i++) {
			//创建list.size()行数据
	          row = sheet.getRow(i+9);
	          row.getCell(17).setCellValue((String)x.get(i)); //设置第一个（从0开始）单元格的数据,这个是调节列数的
	    }

	    out.flush();
	    wb.write(out);
	    out.close();
	}

	public static void readDiffusedata()  throws IOException  {

	ArrayList<String> array = new ArrayList<String>();

		array.add("123.5" + " ");
		array.add("256.3" + " ");
		array.add("62.3" + " ");

	//创建字符缓冲输出流对象
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\demo6.txt"));

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
	public static void Diffusedata() throws IOException{
	
	 List x = new ArrayList();

   String fileName = "C:\\Users\\PC\\Desktop\\demo6.txt";
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
   String url="C:\\Users\\PC\\Desktop\\a.xls";
   FileInputStream fs;
   fs = new FileInputStream(url);
   POIFSFileSystem ps=new POIFSFileSystem(fs); //使用POI提供的方法得到excel的信息
   HSSFWorkbook wb=new HSSFWorkbook(ps);
   HSSFSheet sheet=wb.getSheetAt(13); //获取到工作表，因为一个excel可能有多个工作表
   HSSFRow row=sheet.getRow(0);

   FileOutputStream out=new FileOutputStream(url);//.xls中写数据;

   
   for (int i = 0; i < x.size();i++) {

         row = sheet.getRow(i+22);
         row.getCell(6).setCellValue((String)x.get(i));
   }

   out.flush();
   wb.write(out);
   out.close();
}

	public static void readAmmondata()  throws IOException  {

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

    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\demo8.txt"));

    for(String s : array) {
        bw.write(s);
        bw.newLine();
        bw.flush();
    }

    bw.close();
}
	
	public static void readphdata()  throws IOException  {

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
    

    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\demo9.txt"));

    for(String s : array) {
        bw.write(s);
        bw.newLine();
        bw.flush();
    }

    bw.close();
}


	public static void Ammondata()  throws IOException{
	
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

	    String url="C:\\Users\\PC\\Desktop\\a.xls";
	    FileInputStream fs;
	    fs = new FileInputStream(url);
	    POIFSFileSystem ps=new POIFSFileSystem(fs);
	    HSSFWorkbook wb=new HSSFWorkbook(ps);
	    HSSFSheet sheet=wb.getSheetAt(13);
	    HSSFRow row=sheet.getRow(0);
	
	    FileOutputStream out=new FileOutputStream(url);
	
	
	    for (int i = 0; i < x.size();i++) {

	          row = sheet.getRow(i+9);
	          row.getCell(14).setCellValue((String)x.get(i));
	
  }
	    out.flush();
	    wb.write(out);
	    out.close();
}
	

	public static void phdata()  throws IOException{
	
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
	

	   String url="C:\\Users\\PC\\Desktop\\a.xls";
	   FileInputStream fs;
	   fs = new FileInputStream(url);
	   POIFSFileSystem ps=new POIFSFileSystem(fs);
	   HSSFWorkbook wb=new HSSFWorkbook(ps);
	   HSSFSheet sheet=wb.getSheetAt(13);
	   HSSFRow row=sheet.getRow(0);
	
	   FileOutputStream out=new FileOutputStream(url);
	
	
	   for (int i = 0; i < x.size();i++) {
	         row = sheet.getRow(i+9);
	         row.getCell(27).setCellValue((String)x.get(i));
	
	   }
	
	   out.flush();
	   wb.write(out);
	   out.close();
}

}


