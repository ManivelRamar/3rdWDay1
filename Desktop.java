package org.system;

public class Desktop extends Computer
{
	public void desktopSize() 
	{
		System.out.println("Size of the model is 17.3");

	}

	public static void main(String[] args) 
	{
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}
}
