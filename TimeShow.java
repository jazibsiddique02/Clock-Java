public class TimeShow
{
int hour;
int min;
int sec;
String time;
Hands hours;
Hands minute;
Hands second;
Hands mode;

public TimeShow (int hr, int m, int s, int p)
{
hours=new Hands (hr , 13);
minute=new Hands (m , 60);
second=new Hands (s , 60);
mode=new Hands (p);

time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

}



public void tick()
{
second.increment();
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

if (second.getValue() == 0)

{
minute.increment();
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

if (minute.getValue() == 0)
{

if (hours.getValue() != 13)
{
hours.hourIncrement();
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();



if (hours.getValue() == 12)
{

if (mode.getMode() == 1)
{

mode.setMode(2);
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

}

else

{
mode.setMode(1);
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

}

}










}

else
{
hours.setValue(1);
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

}


/*

if (hours.getValue() == 12)
{
mode.changeMode();
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();

}




if (hours.getValue() == 12)
{


if (mode.getMode() == "pm")
{
mode.setMode("am");
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();
}



else
{
mode.setMode("pm");
time = hours.displayDigit() + ":" + minute.displayDigit() + ":" + second.displayDigit() + mode.displayMode();
}


}

*/












}

}

}









public void displayClock()
{


System.out.println(time);

}






}











