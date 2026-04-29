package Core_Programming_Basics.Programming_Elements.Level1;
public class EarthVolume{
	public static void main(String[] args){
		int radiusInKm = 6378;
		double volumeInKm = (4/3d) * Math.PI * Math.pow(radiusInKm,3);
		float radiusInMiles = radiusInKm * 0.62f;
		double volumeInMiles = (4/3d) * Math.PI * Math.pow(radiusInMiles,3);
		System.out.println("The volume of earth in cubic kilometers is "+ volumeInKm +" and cubic miles is "+ volumeInMiles);
	}
}