class Day05_Test09_2{
	public static void main(String[] args){
		//int[] arr = {26,67,49,38,52,66,7,71,56,87};
		int[] arr = {23,67,49,33,53,63,7,71,53,87};
		
		for(int left = 0,right = arr.length-1; left<right; left++,right--){
			//�����ż�����ұ�������������
			if(arr[left]%2==0 && arr[right]%2!=0){//��ߵ�ż��
				int temp = arr[left];
	1			arr[left] = arr[right];
				arr[right] = temp;
			}else if(arr[left]%2!=0 && arr[right]%2!=0){//������������ұ�Ҳ������
				right++;//Ϊ�˵���right--����right���ֲ�����������һ�ε�left�ҵ�ż����������
			}else if(arr[left]%2==0 && arr[right]%2==0){//�����ż�����ұ�Ҳ��ż��
				left--;//Ϊ�˵���left++����left���ֲ�����������һ�ε�right�ҵ�������������
			}
		}
		
		for(int k = 0; k<arr.length; k++){
			System.out.print(arr[k]+" ");
		}
	}
}