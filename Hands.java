public class Hands

{
int value;
int limit;
int mode;
int v2;

public Hands (int val , int lim)
{
value = val;
limit = lim;


}

public Hands (int x)
{
mode=x;

}

public void setMode (int x)
{
mode=x;
}

public int getMode ()
{
return mode;
}



public void setValue (int n)
{
value=n;

}


public int getValue ()
{
return value;

}


public void increment ()
{

value=value + 1;

if (value == limit)
{
value = 0;

}

}



public void hourIncrement ()
{

value=value + 1;

if (value == limit)
{
value = 1;

}

}





public String displayDigit ()
{

if (value < 10)
{
String v="0" + value;
return v;
}

else
{
return ("" + value);
}

}






public String displayMode ()
{
String h;
if (mode == 1)
{
h="am";
return h;
}

else if (mode == 2)
{
h="pm";
return h;
}

else
return "null";



}



}


















