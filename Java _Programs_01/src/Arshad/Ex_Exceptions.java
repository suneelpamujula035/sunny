package Arshad;

import java.io.File;
import java.io.FileInputStream;

public class Ex_Exceptions {
	
	public static void ArithmeticException()
	{
	try
	{
		int a=1;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch (ArithmeticException e)
	{
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
	}
	public static void NullPointerException()
	{
		try
		{
			String name = null;
			System.out.println(name.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("There is no text  "+n);
		}
	}
	public static void NumberFormatException()
	{
		try
		{
			String s ="abc";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException f)
		{
			System.out.println("We can't convert from string to integer  "+f);
		}
	}
	public static void ArrayIndexOutOfBoundsException()
	{
		int a[]=new int[5];
		System.out.println("Program started");
		try
		{
			a[8]=2;
		}
		catch(Exception e)
		{
			System.out.println(e+e.getMessage());
		}
	}
	public static void StringIndexOutOfBoundsException()
	{
		String str = "Welcome tudents";
		try
		{
			str.charAt(28);
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("string index is out of bounds  "+s);
		}
	}

	public static void Generalexception()
	{
		try
		{
			String s ="abc";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println("Generalexception  "+e);
		}

	}
	public static void InterruptedExcetion()
	{
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		try
		{
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}
	public static void IOException (){
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		try{
		fileInputStream = new FileInputStream(file);
		fileInputStream.read();
		}
		catch (Exception e){         
		e.printStackTrace();
		}
	}

		/*
		 * finally{ try{ if (fileInputStream != null){ fileInputStream.close(); } }catch
		 * (IOException e){ e.printStackTrace(); }
		 */
		//return fileInputStream;
	public static void MultipleCatchException()
	{
		int a=12,b=0;
		int r[]=new int[5];
		String s =null;
		
		try
		{
			int c =a/b;
			r[8]=26;
			System.out.println(c);
			System.out.println(r);
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("We can't divide by zero  "+e.getMessage());
		}
		catch(java.lang.ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Please select correct element  "+i.getMessage());
		}
		catch(NullPointerException n)
		{
			System.out.println("Please enter the text  "+n.getMessage());
		}
		finally
		{
			System.out.println("Program exited");
		}
	}
		 
	public static void main(String[] args) {
		
		ArithmeticException();
		NullPointerException();
		NumberFormatException();
		ArrayIndexOutOfBoundsException();
		StringIndexOutOfBoundsException();
		Generalexception();
		InterruptedExcetion();
		IOException ();
		MultipleCatchException();
		

	}

}
