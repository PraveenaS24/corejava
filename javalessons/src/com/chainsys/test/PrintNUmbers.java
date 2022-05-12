package com.chainsys.test;

public class PrintNUmbers
{
public static void main(String[] args)
{
for(int i=1;i<=100;i++)
{
if(i%3==0)
{
System.out.println("Multiple of Three  - "+ i +" =Fizz");
}
if(i%5==0)
{
System.out.println("Multiple of Five - "+ i +" =Buzz");
}
if(i%3==0 && i%5==0)
{
System.out.println("Multiple of Both Three& Five - "+ i +" =FizzBuzz");
}
}
}
}


