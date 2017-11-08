package Sorting;

public class InsertionSort6 
{
	public static void insertionSortByPlanet(String[] planet, double[] distance) 
	{
		int i, j;
		String newPlanet;
		double newDistance;
		for (i = 1; i < planet.length; i++) 
		{
			newPlanet = planet[i];
			newDistance = distance[i];
			j = i;
			while (j > 0 && planet[j - 1].compareTo(newPlanet) > 0) 
			{
				planet[j] = planet[j - 1];
				distance[j] = distance[j - 1];
				j-- ;
			}
			planet[j] = newPlanet;
			distance[j] = newDistance;
			for (int k = 0; k < planet.length; k++)
			{
				System.out.print(planet[k] + " ");
				System.out.print(distance[k] + ", ");
			}
			System.out.println();
		}
	}
	public static void insertionSortByDistance(String[] planet, double[] distance) 
	{
		int i, j;
		String newPlanet;
		double newDistance;
		for (i = 1; i < distance.length; i++) 
		{
			newPlanet = planet[i];
			newDistance = distance[i];
			j = i;
			while (j > 0 && distance[j - 1] > newDistance) 
			{
				planet[j] = planet[j - 1];
				distance[j] = distance[j - 1];
				j-- ;
			}
			planet[j] = newPlanet;
			distance[j] = newDistance;
			for (int k = 0; k < planet.length; k++)
			{
				System.out.print(planet[k] + " ");
				System.out.print(distance[k] + ", ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}; 
		double[] distance = {0.39, 0.723, 1, 1.524, 5.203, 9.539, 19.18, 30.06};
		
		insertionSortByPlanet(planet, distance);
		System.out.println();
		insertionSortByDistance(planet, distance);
	}
}
