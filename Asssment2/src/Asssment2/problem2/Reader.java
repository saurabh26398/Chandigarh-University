package Asssment2.problem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class Reader implements Runnable {

	private File file;

	public Reader(File file) {
		this.file=file;
	}

	@Override
	public void run() {
		while(true){
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}

	private void readFile() throws IOException, InterruptedException {
		
		if(file.exists())
		{
			Thread.sleep(2000);
			FileInputStream fis=new FileInputStream(file);
			int data=fis.read();
			System.out.println(data);
			file.delete();
		    fis.close();
			synchronized (file) {
				file.notify();
			}
			
		}
		else{
			
			synchronized (file) {
				file.wait();
			}
			
		}
		
	} 

}
