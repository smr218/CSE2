public class Cyclometer 
{
    	// main method required for every Java program
   	public static void main(String[] args) 
   	{
        int secsTrip1=480;// # of seconds to finish the first trip
        int secsTrip2=3220;// # of seconds to finish the second trip
        int countsTrip1=1561;// # of rotations of the front wheel during the first trip
        int countsTrip2=9037;// # of rotations of the front wheel during the second trip
        double wheelDiameter=27.0,// Diameter of the front wheel
        PI=3.14159,// pi's value
        feetPerMile=5280,// conversion rate of how many feet are in a mile
        inchesPerFoot=12,// conversion rate of how many inches are in a foot
        secondsPerMinute=60;// conversion rate of how many seconds are in a minute
        double distanceTrip1, distanceTrip2, totalDistance;// variables for the distances
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ countsTrip1 +" counts ");// prints out minutes and rotation count of trip 1
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+ countsTrip2 +" counts ");// prints out minutes and rotation count of trip 2
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // is the total distance in inches by taking the rotation count times the wheel diameter and pi
        distanceTrip1/=inchesPerFoot*feetPerMile;// Gives distance in miles of the first trip
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;// does the same as distancetrip1 on one line of code
        totalDistance = distanceTrip1 + distanceTrip2;// adds up all the information for the total distance of the trip
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");//prints out miles of trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles");//prints out miles of trip 2
        System.out.println("The total distance was "+totalDistance+" miles");// prints out miles of both added
	}  //end of main method   
} //end of class

