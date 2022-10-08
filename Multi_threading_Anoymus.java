package MultiThreading;

public class Multi_threading_Anoymus {

	Thread obj;

	public Multi_threading_Anoymus(Thread obj) {
		super();
		this.obj = obj;
		
	}
	
	Thread ob = new Thread(new Runnable() {
		public void run() {
			Name_String();
		}
	});
	
	synchronized void Name_String() {  	
		String c = "Ramanujam";
		c=c.toUpperCase();	
		for (int i=0;i<c.length();i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(c.charAt(i)+" ");
		}	
	}
	 
	 
	
	public static void main(String[] args) {
		Thread ob1 = new Thread();
		Thread ob2 = new Thread();
		Multi_threading_Anoymus obj1 = new Multi_threading_Anoymus(ob1);
		Multi_threading_Anoymus obj2 = new Multi_threading_Anoymus(ob2);
		obj1.ob.start();
		obj2.ob.start();
		
		try {
			obj1.ob.join();
			obj2.ob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finish All the Above Tasks");
	}

}
