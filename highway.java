 class highwayClass implements Runnable{
  static int ticket=10000;
  int tTickets;
  Thread t;
  int i=(int)(Math.random()*4)+1;

  highwayClass(String name){
    // soldTicket=0;
    tTickets=0;
    t=new Thread(this, name);
    t.start();
  }
  
  public void run(){
    while(getTickets()==true){
      // soldTicket=i;
      tTickets+=i;
      System.out.println(t.getName()+"賣出"+i+"張票");
      System.out.println(t.getName()+"目前賣出"+tTickets+"張票");
    }
    System.out.println(t.getName()+"共賣出"+tTickets+"張票");
  }
  synchronized private boolean getTickets(){
    if(ticket>0){
      ticket -=i;
      return true;
    }else{
      return false;
    }
  }
}

public class highway{
  public static void main(String[] args){
    highwayClass tA=new highwayClass("售票機1");
    highwayClass tB=new highwayClass("售票機2");
    highwayClass tC=new highwayClass("售票機3");
    highwayClass tD=new highwayClass("售票機4");

  }
}