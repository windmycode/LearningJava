class Day05_Test09{
	public static void main(String[] args){
		int[] arr = {26,67,49,38,52,66,7,71,56,87};
		//int[] arr = {23,67,49,33,53,63,7,71,53,87};
		
		int left = -1;
		int right = -1;
		
		//��i��j���嵽��������壬ÿһ��whileѭ��
		//�Ͳ��ᵼ��i��j�Ͳ��ỹԭ������һ�λ����ϼ�����
		int i=0;
		int j=arr.length-1;
		while(true){
			//��һ��ѭ����left���ǵ�һ��ż����λ��
			for(; i<arr.length; i++){
				if(arr[i]%2==0){
					left = i;
					break;
				}
			}
			
			for(; j>=0; j--){
				if(arr[j]%2!=0){
					right = j;
					break;
				}
			}
			
			//Ҫôû��ż����Ҫôû������
			if(left==-1 || right==-1){
				break;
			}
			
			if(left < right){
				//����arr[left]��ż����arr[right]������
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}else{
				break;
			}
		}
		
		//��ʾ���
		for(int k = 0; k<arr.length; k++){
			System.out.print(arr[k]+" ");
		}
	}
}