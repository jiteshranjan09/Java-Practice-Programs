package oOpsPart1;

class Writer 
{ 
public static void write() 
{ 
System.out.println("Writing..."); 
} 
} 
class Author extends Writer 
{ 
public static void write() 
{ 
System.out.println("Writing book"); 
} 
} 

class Teacher extends Author 
{ 
public static void write() 
{ 
System.out.println("Writing NoteBook"); 
} 
} 

public class Programmer extends Teacher 
{ 
public static void write() 
{ 
System.out.println("Writing code"); 
} 

public static void main(String[] args) 
{ 
//Author a = new Programmer(); 
//a.write(); 
	Programmer.write();
	Author.write();
} 
}