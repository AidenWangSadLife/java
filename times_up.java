
public class Main
{
    static int i = 0;
    public static void main(String[] args) throws InterruptedException{
	int time = 0;
	MyThread t = new MyThread();
	
	t.start();
	System.out.println("enter something in 5 sec");
	while(time <5){
	    Thread.sleep(1000);
	    time = time+1;
	}
	
	t.interrupt();
	System.out.println("Times up");
	}
	private static class MyThread extends Thread{
	    public void run(){
	        try{
	            String s = System.console().readLine();
	            }
	        
	        catch (Exception e){System.out.println(e.toString());}
	    }
	   
	}
}
