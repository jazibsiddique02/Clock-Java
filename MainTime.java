import java.io.IOException;
import java.util.Scanner;
public class MainTime
{
public static void main (String [] args) throws Exception,IOException,InterruptedException
{
int h,m,s;
int mode;
Scanner sc= new Scanner (System.in);

System.out.println ("Enter time in hours (between 1 and 12) , minutes (between 1 and 60) and seconds (between 1 and 60) : ");
h=sc.nextInt();
m=sc.nextInt();
s=sc.nextInt();


System.out.println ("\n\nEnter a number for mode : ");
System.out.println ("\n \"1\" for am and \"2\" for pm.\n\n");
mode = sc.nextInt();

TimeShow T=new TimeShow (h,m,s,mode);


for (int i=0; i<10 ;i++)
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();


T.displayClock();
Thread.sleep (1000);
T.tick();

}


}


}