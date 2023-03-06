package api;

public class HeadwaterFowDemo0 {
	
	public static void main(String[] args){

		try{
		 	HeadwaterFow.read();
				System.out.print("执行readInorganicdata读取完成!!");

		 	HeadwaterFow.writewater();
				System.out.print("执行写入完成!!");

			HeadwaterFow h = new HeadwaterFow();
			h.testMacro();
		 		System.out.println("执行宏操作的按钮完成");
		    
		 }catch(Exception e){
		    	
		    	System.out.println(e);
		    }
	 }

}
