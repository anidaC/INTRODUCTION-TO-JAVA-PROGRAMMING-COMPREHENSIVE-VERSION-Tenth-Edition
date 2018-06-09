/*
 *  (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, 
 *  Georgia; and Charlotte, North Carolina from www.gps-data-team.com/map/ and compute the estimated area 
 *  enclosed by these four cities. (Hint: Use the formula in Programming Exercise  4.2 to compute the 
 *  distance between two cities. Divide the polygon into two triangles and use the formula in Programming 
 *  Exercise  2.19 to compute the area of a triangle.) 
 *
 */
public class Exercise_03_GeographyEstimateAreas {

	public static void main(String[] args) {
		
		final double earthRadius = 6371.01;
		
		// x - longitude, y - latitude
		double x1AtlantaGeorgia = -84.3879824;
		double y1AtlantaGeorgia =  33.7489954;
		double x2OrlandoFlorida = -81.37923649999999;
		double y2OrlandoFlorida = 28.5383355;
		double x3SavannahGeorgia = -81.09983419999998;
		double y3SavannahGeorgia = 32.0835407;
		double x4CharlotteNC = -80.84312669999997;
		double y4CharlotteNC = 35.2270869;
		
		//triangle 1 side 1
		double t1s1 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x1AtlantaGeorgia)) *
						Math.sin(Math.toRadians(x2OrlandoFlorida)) *
						Math.cos(Math.toRadians(x1AtlantaGeorgia)) *
						Math.cos(Math.toRadians(x2OrlandoFlorida)) *
						Math.cos(Math.toRadians(y1AtlantaGeorgia - y2OrlandoFlorida)));
		
		//triangle 1 side 2
		double t1s2 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x2OrlandoFlorida)) *
						Math.sin(Math.toRadians(x3SavannahGeorgia)) *
						Math.cos(Math.toRadians(x2OrlandoFlorida)) *
						Math.cos(Math.toRadians(x3SavannahGeorgia)) *
						Math.cos(Math.toRadians(y2OrlandoFlorida - y3SavannahGeorgia)));

		//triangle 1 side 3
		double t1s3 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x3SavannahGeorgia)) *
						Math.sin(Math.toRadians(x4CharlotteNC)) *
						Math.cos(Math.toRadians(x3SavannahGeorgia)) *
						Math.cos(Math.toRadians(x4CharlotteNC)) *
						Math.cos(Math.toRadians(y3SavannahGeorgia - y4CharlotteNC)));
				
		//triangle 2 side 1
		double t2s1 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x4CharlotteNC)) *
						Math.sin(Math.toRadians(x1AtlantaGeorgia)) *
						Math.cos(Math.toRadians(x4CharlotteNC)) *
						Math.cos(Math.toRadians(x1AtlantaGeorgia)) *
						Math.cos(Math.toRadians(y4CharlotteNC - y1AtlantaGeorgia)));
				
		//triangle 2 side 2
		double t2s2 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x1AtlantaGeorgia)) *
						Math.sin(Math.toRadians(x3SavannahGeorgia)) *
						Math.cos(Math.toRadians(x1AtlantaGeorgia)) *
						Math.cos(Math.toRadians(x3SavannahGeorgia)) *
						Math.cos(Math.toRadians(y1AtlantaGeorgia - y3SavannahGeorgia)));
				
		//triangle 2 side 3
		double t2s3 = earthRadius * 
				Math.acos(
						Math.sin(Math.toRadians(x2OrlandoFlorida)) *
						Math.sin(Math.toRadians(x4CharlotteNC)) *
						Math.cos(Math.toRadians(x2OrlandoFlorida)) *
						Math.cos(Math.toRadians(x4CharlotteNC)) *
						Math.cos(Math.toRadians(y2OrlandoFlorida - y4CharlotteNC)));
				
				
				
		double s1 = (t1s1 + t1s2 + t1s3) / 2.0;
		double s2 = (t2s1 + t2s2 + t2s3) / 2.0;
		
				
		double area1 = Math.pow((s1 * (s1 - t1s1) * (s2 - t1s2) * (s2 - t1s3)), 0.5);
		double area2 = Math.pow((s1 * (s1 - t2s1) * (s2 - t2s2) * (s2 - t2s3)), 0.5);
		double area = area1 + area2;
				
		System.out.print(area);
				
				
	}

}
