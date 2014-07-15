import java.util.Random;

public class QuickSort {
	private int a[];

	public QuickSort(int num[]) {
		this.a = num;
	}
	
	int partition(int start, int end) {
		if(start<end){
			int r=new Random().nextInt(end-start);
			swap(start+r,end);
			System.out.println("Partitioning around the pivot="+a[end]);
			int k=end;
			int i=start;
			int data=a[end];
			while(i<k){
				if(a[i]>data){
					k--;
					swap(i,k);
				}else{
					i++;
				}
			}
			swap(end,k);
			return k;
		}
		else return 0;
	}

	void swap(int i, int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	void print(){
		for(int i=0; i<a.length;i++)	
		System.out.print(a[i]+", ");
		System.out.println();
	}
	
	void quickSort(int start, int end){
		if(start<end){
		int pivot=partition(start, end);
		print();
		quickSort(start,pivot-1);
		quickSort(pivot+1, end);
		}
	}
	
	public static void main(String[] args) {

		int a[]={3, 7 ,8 ,9 ,4, 5, 2, 1,10,11,12,6,13};
		QuickSort sort=new QuickSort(a);
		System.out.println("Original Array");
		sort.print();
		sort.quickSort(0,a.length-1);
	}
}
