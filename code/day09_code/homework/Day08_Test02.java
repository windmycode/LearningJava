class Day08_Test02{
}
class MyArrays{
	/*
	1��int  binarySearch(int[]  arr,  int  value)��
		ʹ�ö��ֲ��ҷ���arr�����в���value���±꣬
		���value�����ڣ��ͷ���-1���������arr��������ģ��������һ����ȷ*/
	public int binarySearch(int[]  arr,  int  value){	
		int left = 0;
		int right = arr.lenght-1;
		int mid = (left + right)/2;
		
		while(left<=right){
			if(arr[mid] == value){
				return mid;
			}else if(value > arr[mid]){
				left = mid + 1;
			}else if(value <arr[mid]){
				right = mid -1;
			}
			mid = (left + right)/2;
		}
		return -1;
	}
	
	/*
	int  copy(int[] arr , int length)����ָ����arr�����arr[0]
	��ʼ���Ƶõ�һ�������飬������ĳ���Ϊlength��*/
	//����ֵ���� ��int[]��һ��int���͵�����
	public int[] copy(int[] arr, int length){
		//(1)����������
		int[] newArr = new int[length];
		
		//(2)����Ԫ��
		for(int i =0; i<arr.length && i<newArr.length; i++){
			newArr[i] = arr[i];
		}
		
		return newArr;
	}
	
	/*
	void sort(int[] arr)�����Ը�arr�����С����������ð������ʵ��
	*/
	public void sort(int[] arr){
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<arr.lenght-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}