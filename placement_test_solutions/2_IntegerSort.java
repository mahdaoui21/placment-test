public class IntegerSort {
	public static int [] sortDesc(int [] intArray) {
		int helper;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray.length-1;j++) {
				if(intArray[j]>intArray[j+1]) {
					helper=intArray[j+1];
					intArray[j+1]=intArray[j];
					intArray[j]=helper;
				}
			}
		}
		return intArray;
	}
	public static int [] sortAsc(int [] intArray) {
		int helper;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray.length-1;j++) {
				if(intArray[j]<intArray[j+1]) {
					helper=intArray[j+1];
					intArray[j+1]=intArray[j];
					intArray[j]=helper;
				}
			}
		}
		return intArray;
	}
}
