package comm.example;

public class PrintThread {
	public class PrintThread extends Thread{
		
		public PrintThread(String name)
		{
			super(name);
			
		}

		@Override
		public void run() {
			String name=getName();
			
			//for(int i=0;i<100;i++)
			//{
				System.out.println(name);
				
			//}
		}

	}

}
