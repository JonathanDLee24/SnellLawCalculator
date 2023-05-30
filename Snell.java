/*
Jonathan Lee Pass Peer
Professor Gita Faroughi
Jan 21 2022
Snell Law Calculator solves for refractive index n2
*/
import java.util.Scanner;
public class Snell 
{
   public static void main(String[] args) 
   {
      Scanner console = new Scanner (System.in);
   //if your equation requires
      System.out.println ("N\'s is the input for the snell\'s law"); 
      System.out.println ("What is your Refractive index N1:"); 
      double N1 = console.nextDouble();
   //the inputs for users theta's in thier snell's law equation.
      System.out.println ("What is your angle of incidence O1:");
      double theta1 = console.nextDouble();
      theta1 = Math.toRadians(theta1);
      System.out.println ("what is your angle of refraction O2:");
      double theta2 = console.nextDouble();
      theta2 = Math.toRadians(theta2);
      double N2 = (N1 * Math.sin(theta1) / Math.sin(theta2));
      System.out.println("Your refractive index n2 is " + N2 + ".");
   }
}
