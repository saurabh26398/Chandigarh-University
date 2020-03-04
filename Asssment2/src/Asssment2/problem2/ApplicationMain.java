package Asssment2.problem2;

import java.io.File;

public class ApplicationMain {
	public static void main(String[] args) {
		File file=new File("2.txt");
		Thread read=new Thread(new Reader(file));
		Thread write=new Thread(new Writer(file));
		read.start();
		write.start();
		
		
	}

}


