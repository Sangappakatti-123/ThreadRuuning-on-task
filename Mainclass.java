package com;

public class Mainclass {
  public static void main(String[] args) {
	  Task t1=new Task();
	  TaskThread tt1=new TaskThread(t1);
	  TaskThread tt2=new TaskThread(t1);
	  tt1.start();
	  tt2.start();
}
}
