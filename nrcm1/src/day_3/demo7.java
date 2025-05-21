package day_3;

public class demo7 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {3,4,5,6};
			int arr1[]=new int[arr.length];   //new array
			int index =0;
			for(int i=0;i< arr.length;i++) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count ==1) {
					arr1[index++] =arr[i];
				}
			}
			System.out.println("no repeated: ");
			for (int i=1;i<index;i++) {
				System.out.println(arr[i] + "");
				}
		}
		
	}