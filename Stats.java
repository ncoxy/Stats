public class Stats{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 5,};
		// max(a);
		// min(a);
		// mean(a);
		// median(a);
		// quartile1(a);
		// quartile3(a);
		mode(a);
		// standard deviation
	}
	public static int max(int[] a) {
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}			
		}
		System.out.println(max);
		return max;
	}

	public static int min(int[] a){
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
		return min;
	}
	public static double mean(int[] a){
		int total = 0;
		double mean = 0;
		for (int i=0; i<a.length; i++) {
			total = total + a[i];
			
		}
		mean = (total) / (a.length);
		System.out.println(mean);
		return mean;
	}
	public static double median(int[] a){
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
		return median;
	}
	public static double quartile1(int[] a){
		double quartile1 = 0;
		int length = 0;
		// double median = median(a);
		for (int i=0; i<a.length; i++) {
			length++;

		}
		if((length % 2) ==0){
			quartile1 = a[length - 1] / 4 + 0.5;
		}else{
			quartile1 = a[length - 1]  / 4;
		}
		System.out.println(quartile1);
		return quartile1;
	}
	public static void quartile3(int[] a){
		double quartile3 = 0;
		int length = 0;
		// double median = median(a);
		for (int i=0; i<a.length; i++) {
			length++;

		}
		if((length % 2) ==0){
			quartile3 = a[length - 1] / 4 + 0.5;
		}else{
			quartile3 = a[length - 1]  / 4;
		}
		System.out.println(quartile3);
		return quartile3;
	}
	public static double mode(int[] a){
		int mode = 0;
		int count = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] == count) {
					a[i] = count;
				}else{

				}
			 
		}
	}


}