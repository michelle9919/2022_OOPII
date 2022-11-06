import java.util.*;

public class HashMapPractice{

  public static void main(String[] args){

    var hamp=new HashMap<>();
    String[] month={"January","February","March","April","May","June","	July","August","September","October","November","December"};
    hamp.put("henry","student");
    for(int i=1;i<=12;i++){
      hamp.put(i,month[i-1]);
    }
    Scanner input=new Scanner(System.in);
    System.out.println("請輸入1~12？");
    while(input.hasNext()){
      int num=input.nextInt();
      if(num<1 || num>12){
        System.out.println("範圍錯誤!");
      }else{
        System.out.println("第"+num+"月的英文單字為"+hamp.get(num));
        break;        
      }
      System.out.println("請輸入1~12？");
    }
    
  }
}