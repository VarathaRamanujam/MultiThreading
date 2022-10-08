package MultiThreading;

public class Multi_methods  implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Multi_methods obj = new Multi_methods();
		Thread ob = new Thread(obj);
		Thread ob0 = new Thread(obj);
		ob.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Pls enter valid button");
		
		}
		ob0.start();
		ob.join();
		System.out.println("Hii Its completed ");
		
	}

	@Override
	public void run() {
		Array_Using_Char_6();

		Array_Using_Char_4();
	}
	
	private void Array_Using_Char_6() {

		char ls[] = {'A','M','V','Z','Y'};
		for(int j=0;j<3;j++) {
		int temp =ls[0];
		
		for(int i=0;i<ls.length-1;i++) {
			ls[i]=ls[i+1];
		}ls[ls.length-1]=(char) temp;
		}
		for(int i=0;i<ls.length;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(ls[i]+" ");
		}System.out.println();
	}
	
	private void Array_Using_Char_4() {
		
		char ls[]=new char[19];
		int first ='A';
		int second='C';
		int diff =0;
		for (int i=0;i<ls.length;i++) {
			if(first>=90) {
				first = second -28;			
				ls[i]=(char)first;
				second=first+2 ;
				first=second;
				second=first+2;
			}else {
			diff=second-first;
			ls[i]=(char) first;
			first=second;
			second=diff+first;
			}
		}
		for(int i=0;i<ls.length;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Pls enter valid button");
				Array_Using_Char_6();
				//e.printStackTrace();
			}
			System.out.print(ls[i]+" ");
		}System.out.println();
	}

}
