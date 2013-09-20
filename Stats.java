public class Stats{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		// max(a);
		// min(a);
		mean(a);
		// median
		// quartile1
		// quartile3
		// mode
		// standard deviation
	}
	public static void max(int[] a) {
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}			
		}
		System.out.println(max);
	}
	public static void min(int[] a){
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
	public static void mean(int[] a){
		int mean = 0;
		for (int i=0; i<a.length; i++) {
			mean = a[i+1];
		}
		System.out.println((mean) / 2);
	}


}