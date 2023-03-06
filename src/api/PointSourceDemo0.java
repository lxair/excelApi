package api;

public class PointSourceDemo0 {
	
	public static void main(String[] args){
		 
		 try{
		    	
			PointSource0.readmeandata();
			 	System.out.print("执行读取完成!!");
		    	
		    PointSource0.readLocationdata();
		    	System.out.print("执行读取完成!!");
		    	
		    PointSource0.readInflowdata();
		    	System.out.print("执行读取完成!!");
		    	
		    PointSource0.readDissolvedMean();
		    	System.out.print("ִ执行读取完成!!");
		    	
		    PointSource0.readConstituentMean();
		    	System.out.print("执行写入完成!!");
		    	
		    PointSource0.Locationdata();
		    	System.out.print("ִ执行写入完成!!");
		    	
		    PointSource0.Inflowdata();
		    	System.out.print("执行写入完成!");
		    
		    PointSource0.meandata();
		    	System.out.print("执行写入完成!!");
		    	
		    PointSource0.DissolvedMean();
		    	System.out.print("执行写入完成!!");

			 PointSource0.ConstituentMean();
			 	System.out.print("执行写入完成!!");

			 HeadwaterFow h = new HeadwaterFow();
			 h.testMacro();
			 	System.out.println("执行宏操作的按钮完成");

		 }catch(Exception e){
		    	
		    	System.out.println(e);
		    }
	 }

}
