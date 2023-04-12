package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Demopoup11 {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_Q);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
	}
}
