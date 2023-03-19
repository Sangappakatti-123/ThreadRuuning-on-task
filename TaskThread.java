package com;

  public class TaskThread extends Thread {
     private Task t1;
     TaskThread(Task t1){
	   this.t1=t1;
     }
     public void run() {
	   t1.assign();
     }
}
