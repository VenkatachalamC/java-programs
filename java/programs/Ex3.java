import java.util.*;
import java.io.*;
class Ex3{
void vowels(String s)
{
char ch[]=new char[s.length()];
System.out.println("The vowels in the String are..");
for(int i=0;i<s.length();i++)
{ch[i]=s.charAt(i);
}
for(int j=0;j<s.length();j++)
{
if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
{
System.out.println(ch[j]);
}
}
}
void count(String s)
{
char ch;
int characters=0,space=0,words=1,lines=1;
for(int i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
space++;
}
if(Character.isLetter(ch)||Character.isDigit(ch))
{
characters++;
}
if(i!=0 && ch==' ')
{
words++;
}
if(ch=='\n')
{
lines++;
}
}
System.out.println("No of characters:"+characters);
System.out.println("No of Spaces:"+space);
System.out.println("No of words:"+words);
System.out.println("No of lines:"+lines);
}
public static void main(String args[])
{
Ex3 e=new Ex3();
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String..");
str=sc.nextLine();
System.out.println("1.check no of vowels.\n2.check word,letter,space,line count.");
int n;
n=sc.nextInt();
switch(n)
{
case 1:e.vowels(str);
break;
case 2:e.count(str);
break;
default:System.out.println("Invalid option..");
break;
}
}
}

