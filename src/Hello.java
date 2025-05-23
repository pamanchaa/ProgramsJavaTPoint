
public class Hello {

	
	//crete main method	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello Github55");
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        arrayDuplicate(arr);
        
        //create a new branch
	}
	
	//crea
	public static void arrayDuplicate(int[] arr) {

		// logic to find duplicates
		int n = arr.length;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element: " + arr[i]);
					visited[j] = true;
				}
			}
		}
		System.out.println("No duplicate elements found.");
		
	}
}
