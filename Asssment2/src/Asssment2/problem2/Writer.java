package Asssment2.problem2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

public class Writer implements Runnable {



	private File file;

	public Writer(File file) {
		this.file=file;
	}

	@Override
	public void run() {
	while(true){
			try {
				writeFile();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}

	private void writeFile() throws IOException, InterruptedException {
		
		if(file.exists())
		{
			synchronized (file) {
				file.wait();
			}
		}
		else{
			Thread.sleep(2000);
			file.createNewFile();
			FileOutputStream fos=new FileOutputStream(file,true);
			Date date=new Date();
			String d=date.toString();
			fos.write(d.getBytes());
			fos.close();
			synchronized (file) {
				file.notify();
			}
			
		}
		
	} 

	

}
