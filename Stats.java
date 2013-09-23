public class Stats{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		// max(a);
		// min(a);
		// mean(a);
		median(a);
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
		int total = 0;
		double mean = 0;
		for (int i=0; i<a.length; i++) {
			total = total + a[i];
			
		}
		mean = (total) / (a.length - 1);
		System.out.println(mean);
	}
	public static void median(int[] a){
		int median = 0;
		for (int i=0; i<a.length; i++) {
			median = median + a[i];
			median
		}
	}


}