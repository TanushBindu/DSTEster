public class Binary_Tree {

	private int arr[] = null;
	private int enIndex ;
	
	public static void main(String[] args) 
	{
		Binary_Tree a1 = new Binary_Tree(2);
		a1.value_insert(20);
		a1.value_insert(30);
		a1.levelOrder();
	}
	public Binary_Tree(int size) {

		this.arr = new int[size + 1];
		this.enIndex = 0;
	}

	public void value_insert(int valueToBeInsert) {
		if (isTreeFull()) 
		{
			System.out.println("Array Full");
		} 
		else 
		{
			arr[enIndex + 1] = valueToBeInsert;
			enIndex++;
		}
	}
	
	public void levelOrder() {
		for (int i =1; i <=enIndex; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void preOrder(int index) {
		System.out.print(arr[index]+" ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}
	
	public void postOrder(int index) 
	{
		preOrder(index * 2);
		preOrder(index * 2 +1);
		System.out.print(arr[index]+" ");
	}
	
	public void inOrder(int index) 
	{
		preOrder(index * 2);
		System.out.print(arr[index]+" ");
		preOrder(index * 2 +1);
	}
	
	public int search_value(int valueToBeSearch) {
		for (int i =1; i <=enIndex; i++) {
			if(arr[i]==valueToBeSearch) {
				System.out.println(valueToBeSearch+"is found at index : "+i);
				return i;
			}
		}
		System.out.println(valueToBeSearch+" is not found");
				return -1;
	}
	
	public void delete(int valueToBeDelete) {
		int value=search_value(valueToBeDelete);
		if(value==-1) {
			return;
		}else {
			arr[value]=arr[enIndex];
			enIndex--;
		}
	}
	
	public boolean isTreeFull() {
		if (enIndex == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}
}








