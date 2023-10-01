public class doctor1
{
public int id;
public String name = new String(new char[20]);
public String Q = new String(new char[20]);
public String age = new String(new char[20]);
public String exp = new String(new char[20]);
public String city = new String(new char[20]);
public String special = new String(new char[20]);
}
public class patient1
{
public int id1;
public String name = new String(new char[20]);
public String age = new String(new char[20]);
public String city = new String(new char[20]);
public String dis = new String(new char[20]);
public String room = new String(new char[20]);
public String sym = new String(new char[20]);
public String con = new String(new char[20]);
public String date = new String(new char[20]);
public String charg = new String(new char[20]);
public String bill = new String(new char[20]);
}

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class doctor;
//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class patient;
public class hospital
{
// int id=0,id1=0, int counter=0;
}

public class doctor extends hospital
{
public int docid = 0;
public doctor1[] arr = tangible.Arrays.initializeWithDefaultDoctor1Instances(10);
public final void add_doc_info()
{
int i;
int en;
System.out.print("How Many Entries you want to add :");
en = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
for (i = 1;i <= en;i++)
{
System.out.print("Enter Doctor's ID	:");
arr[docid].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
System.out.print("Enter Doctor's Name	:");
arr[docid].name = ConsoleInput.readToWhiteSpace(true).charAt(0);
System.out.print("Enter Doctor's Age	:");
arr[docid].age = ConsoleInput.readToWhiteSpace(true).charAt(0);
System.out.print("Enter Doctor's Qualification	:");
arr[docid].Q = ConsoleInput.readToWhiteSpace(true).charAt(0);
System.out.print("Enter Doctor's Specialization	:");
arr[docid].special = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
System.out.print("Enter Doctor's Experience	:");
arr[docid].exp = ConsoleInput.readToWhiteSpace(true).charAt(0);
System.out.print("Enter Doctor's city	:");
arr[docid].city = ConsoleInput.readToWhiteSpace(true).charAt(0);
docid++;
counter++;
System.out.println();
System.out.print("You filled all Entries of ");
System.out.print(i);
System.out.print(" doctor successfully");
System.out.println();
System.out.print("enter value for ");
System.out.print(" ");
System.out.print(i + 1);
System.out.print(" ");
System.out.print("doctor");
System.out.println();

}
}
public final void Display()
{

int n;
int i;
System.out.print("\n Enter the doctor's ID to display Record :");
n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
if (n == 0)
{
System.out.print("\n\n	OOPS!!!!	");
System.out.print("\n\n");
System.out.print("Note:- No Record To Display Plz Go Back And Enter Some Entries.	");
System.out.println();
}
else
{
int status = 0;
for (i = 0;i < docid;i++)
{
if (arr[i].id == n)
{
status = 1;
break;
}
}
if (status != 0)
{
System.out.print("\n\n");
System.out.print("1.Doctor's ID	:");
System.out.print(arr[i].id);
System.out.println();
System.out.print("2.Doctor's Name			:");
System.out.print(arr[i].name);
System.out.println();
System.out.print("3.Doctor's Age		:");
System.out.print(arr[i].age);
System.out.println();
System.out.print("4.Doctor's Qualification				:");
System.out.print(arr[i].Q);
System.out.println();
System.out.print("5.Doctor's Specialization				:");
System.out.print(arr[i].special);
System.out.println();
System.out.print("6.Doctor's Experience					:");
System.out.print(arr[i].exp);
System.out.println();
System.out.print("8.Doctor's city	:");
System.out.print(arr[i].city);
System.out.println();
System.out.print(" \n Press Any KEY To choose another Option.	");
}
else
{
System.out.print(" \n\n No such ID in database ");
System.out.println();

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


//Helper class added by C++ to Java Converter:

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2023 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to initialize and delete array elements.
//----------------------------------------------------------------------------------------
public final class Arrays
{
	public static doctor1[] initializeWithDefaultDoctor1Instances(int length)
	{
		doctor1[] array = new doctor1[length];
		for (int i = 0; i < length; i++)
		{
			array[i] = new doctor1();
		}
		return array;
	}

	public static patient1[] initializeWithDefaultPatient1Instances(int length)
	{
		patient1[] array = new patient1[length];
		for (int i = 0; i < length; i++)
		{
			array[i] = new patient1();
		}
		return array;
	}

	public static <T extends java.io.Closeable> void deleteArray(T[] array)
	{
		for (T element : array)
		{
			if (element != null)
				element.close();
		}
	}
}

//Helper class added by C++ to Java Converter:

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2023 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to convert basic C++ 'cin' behavior.
//----------------------------------------------------------------------------------------
public final class ConsoleInput
{
	private static boolean goodLastRead = false;
	public static boolean lastReadWasGood()
	{
		return goodLastRead;
	}

	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace)
	{
		String input = "";
		char nextChar;
		while (Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			//accumulate leading white space if skipLeadingWhiteSpace is false:
			if (!skipLeadingWhiteSpace)
			{
				input += nextChar;
			}
		}
		//the first non white space character:
		input += nextChar;

		//accumulate characters until white space is reached:
		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
		}

		goodLastRead = input.length() > 0;
		return input;
	}

	public static String scanfRead()
	{
		return scanfRead(null, -1);
	}

	public static String scanfRead(String unwantedSequence)
	{
		return scanfRead(unwantedSequence, -1);
	}

	public static String scanfRead(String unwantedSequence, int maxFieldLength)
	{
		String input = "";

		char nextChar;
		if (unwantedSequence != null)
		{
			nextChar = '\0';
			for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
			{
				if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
				{
					//ignore all subsequent white space:
					while (Character.isWhitespace(nextChar = (char)System.in.read()))
					{
					}
				}
				else
				{
					//ensure each character matches the expected character in the sequence:
					nextChar = (char)System.in.read();
					if (nextChar != unwantedSequence.charAt(charIndex))
						return null;
				}
			}

			input = (new Character(nextChar)).toString();
			if (maxFieldLength == 1)
				return input;
		}

		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
			if (maxFieldLength == input.length())
				return input;
		}

		return input;
	}
}
