import java.util.Scanner;
public class CricketPlayer
{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String input1,input2;
  input1=sc.nextLine();
  input2=sc.nextLine();
  int n=input1.length();
  String input3=input1.substring(0,1).toUpperCase() +input1.substring(1,n) +input2.toUpperCase();

   System.out.println(input3);
   }
   }
 
   
