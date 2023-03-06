package api;

public class DiffuesSourcesdemo {
		
	public static void main(String[] args){
			 
			 try{
			    	
				DiffuesSources.readInorganicdata();
			    	System.out.print("执行readInorganicdata读取完成!!");
			    	
			    DiffuesSources.Inorganicdata();
			    	System.out.print("执行写入完成!!");
			    	
				DiffuesSources.readDiffusedata();
			    	System.out.print("执行readDiffusedata读取完成!!");
			    	
			    DiffuesSources.Diffusedata();
			    	System.out.print("执行写入完成!!");
		    
			  	
			    DiffuesSources.readAmmondata();
			    	System.out.print("执行readAmmondata读取完成!!");
			    	
				DiffuesSources.Ammondata();
			    	System.out.print("执行写入完成!!");

			    DiffuesSources.readphdata();
			    	System.out.print("执行readphdata读取完成!!");
			    	
			    DiffuesSources.phdata();
			    	System.out.print("执行写入完成!!");

				 HeadwaterFow h = new HeadwaterFow();
				 h.testMacro();
				 	System.out.println("执行宏操作的按钮完成");



			 }catch(Exception e){
			    	
			    	System.out.println(e);
			    }
		 }
	}



