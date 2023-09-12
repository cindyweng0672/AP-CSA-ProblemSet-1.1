/**
 * AP CS A Problem Set 1.1
 *
 * Cindy Weng
 * Sept. 12
 */
public class MySolutions
{
    public void celsiusToFahrenheit(){
        double c=37.0;
        double f=c*9/5+32;
        System.out.print(c+"°C"+" = "+f+"°F");
    }
    
    public void elaspedTime(){
        int currentH=10;
        int currentM=45;
        int currentS=12;
        
        int totalS=86400;
        int sPassed=60*60*currentH+60*currentM+currentS;
        int sLeft=totalS-sPassed;
        
        double percentagePassed=(double)sPassed/totalS*100; 
        
        System.out.print("the current time is "+currentH+":"+currentM+":"+currentS+". ");
        System.out.println("It has been "+sPassed+" seconds since the day began.");
        System.out.println("There are "+sLeft+" seconds left in the day.");
        System.out.print("The day is "+percentagePassed+" done");
    }
    
    public void secondsToHMS(){
        int totalS=5000;
        int h=totalS/(60*60);
        int m=(totalS-h*60*60)/60;
        int s=totalS-h*60*60-m*60;
        
        System.out.print(totalS+" seconds = "+h+ "hours, "+m+" minutes, "+s+" seconds.");
    }
}
