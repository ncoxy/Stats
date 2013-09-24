public class Stats{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5,};
		// max(a);
		// min(a);
		// mean(a);
		// median(a);
		quartile1(a);
		// quartile3(a);
		// mode(a);
		// standardDeviation(a);
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
		double median = median(a);
		for (int i=0; i<a.length; i++) {
			length++;

		}
		if((length % 2) ==0){
			quartile1 = (double)a[length - 1] / 4 + 0.25;
		}else{
			quartile1 = (double)a[length - 1]  / 4;
		}
		System.out.println(quartile1);
		return quartile1;
	}
	public static double quartile3(int[] a){
		double quartile3 = 0;
		int length = 0;
		double median = median(a);
		for (int i=0; i<a.length; i++) {
			length++;

		}
		if((length % 2) ==0){
			quartile3 = (double)a[length - 1] * (3/4) + 0.5;
		}else{
			quartile3 = (double)a[length - 1]  / (3/4);
		}
		System.out.println(quartile3);
		return quartile3;
	}
	public static double mode(int[] a){
		int counter = 0;
		int maxCount = 0;
		int large = 0;
		for (int i=0; i<a.length; i++) {
			for(int j=a.length; j<=a[0]; j--){
				if(a[i] == a[j]){
					counter++;
				}
			}
			if(counter > maxCount){
				counter = maxCount;
				large = a[i];
			}
			 
		}
		System.out.println(maxCount);
		return maxCount;
	}
	public static double standardDeviation(int[] a){
		double dev = 0;
		double avg = mean(a);
		for (int i=0; i<a.length; i++) {
			dev += (a[i] - avg)*(a[i] - avg);
		}

		dev = dev / a.length;

		dev = Math.sqrt(dev);

		System.out.println("Standard Deviation: " + dev);
		return dev;
	}


}
