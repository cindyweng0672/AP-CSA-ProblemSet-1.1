/**
 * AP CS A Problem Set 1.1
 *
 * Cindy Weng
 * Sept. 12
 */
public class MySolutions
{
    public void celsiusToFahrenheit(){
        double c=30.0;
        double f=c*9/5+32;
        System.out.println(c+"°C"+" = "+f+"°F");
    }
    
    public void elaspedTime(){
        int currentH=12;
        int currentM=0;
        int currentS=0;
        
        int totalS=86400;
        int sPassed=60*60*currentH+60*currentM+currentS;
        int sLeft=totalS-sPassed;
        
        double percentagePassed=(double)sPassed/totalS*100; 
        
        System.out.print("the current time is "+currentH+":"+currentM+":"+currentS+". ");
        System.out.println("It has been "+sPassed+" seconds since the day began.");
        System.out.println("There are "+sLeft+" seconds left in the day.");
        System.out.println("The day is "+percentagePassed+"% done");
    }
    
    public void secondsToHMS(){
        int totalS=5000;
        int h=totalS/(60*60);
        int m=(totalS-h*60*60)/60;
        int s=totalS-h*60*60-m*60;
        
        System.out.println(totalS+" seconds = "+h+ " hours, "+m+" minutes, and "+s+" seconds.");
    }
}
