import java.io.*;
public class SelectionSort {
	static int arr[];
	public void Sort(){
		int min,index=0;
		for(int j=0;j<arr.length;j++){
			min=arr[j];
			for(int i=j;i<arr.length;i++){
				if(arr[i]<=min){
					min=arr[i];
					index=i;
				}
			}
			int temp=arr[index];
			arr[index]=arr[j];
			arr[j]=temp;
		}
	}
	public void Display(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements");
		int num=Integer.parseInt(br.readLine());
		arr=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the element");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Before Sort:");
		SelectionSort s=new SelectionSort();
		s.Display();
		System.out.println();
		s.Sort();
		System.out.println("After Sort");
		s.Display();
	}

}
