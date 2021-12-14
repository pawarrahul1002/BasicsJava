class Bs
{
	static int search(int[] arr, int target, int s, int e){
		System.out.println("O/P : ");

		if (s>e) {
			return -1;
		}
		
		int m = (s+e)/2;

		if (arr[m] == target) {
			return m;
		}

		if(arr[m]< s){
			return search(arr, target, s, m-1);
		}

		return search(arr, target, m+1, e);


	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,55,66,77};
		int target = 77;
		System.out.println(search(arr, target, 0, arr.length-1));

	}
}