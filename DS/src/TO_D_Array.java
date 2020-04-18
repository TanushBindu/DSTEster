public class TO_D_Array {

	int arr[][] = null;

	public static void main(String[] args) 
	{
		TO_D_Array a1 = new TO_D_Array(2,2);
		a1.insert_Value(0, 0, 20);
		a1.insert_Value(0, 1, 30);
		a1.fetch_value();
	}
	public TO_D_Array(int row, int col) {
		this.arr = new int[row][col];//O(1) || O(mn)
		System.out.println("Two Dimension is created");

		for (int r = 0; r < arr.length; r++) 
		{
			for (int c = 0; c < arr[r].length; c++) 
			{
				arr[r][c] = Integer.MIN_VALUE;
			}
		}
	}
	public void fetch_value()
	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
	public void insert_Value(int row, int col, int value) 
	{
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println(value + " value inserted at row " + row + " and column " + col);
			} else {
				System.out.println("cell is occupied at row " + row + " and column " + col);
			}
	}
	public void accessCell(int row, int col) 
	{
			System.out.println(arr[row][col] + " is present at given row " + row + " and column " + col);
	}

	public void search_Value(int Search_value) 
	{ 
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c] == Search_value) {
					System.out.println(Search_value);
				}
			}
		}
	}
}
