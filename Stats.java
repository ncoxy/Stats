public class Stats{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		// max(a);
		// min(a);
		// mean(a);
		// median(a);
		quartile1(a);
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
		mean = (total) / (a.length);
		System.out.println(mean);
	}
	public static void median(int[] a){
		int length = 0;
		double median = 0;
		for (int i=0; i<a.length; i++) {
			length++;
		}
		if((length % 2) ==0){
			median = (a.length / 2) + 0.5;
		}else{
			median = a[length / 2];
		} 
		System.out.println(median);
	}
	public static void quartile1(int[] a){

	}
	// public static void quartile3(int[] a){

	// }


}