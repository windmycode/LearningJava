//�ж������Ƿ�Ԫ��ֵ�Գ�
class Day05_Test06{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,4,3,2,1};
		
		//(1)�ȼ������ǶԳƵ�
		boolean flag = true;
		
		//(2)�������鿴�����Ԫ���Ƿ���β�Գ�
		//left��ʾ��ߵ��±�
		//right��ʾ�ұߵ��±�
		for(int left=0,right=arr.length-1; left<right; left++,right--){
			if(arr[left] != arr[right]){
				flag = false;
				break;
			}
		}
		
		System.out.println(flag?"�Գ�":"���Գ�");
	}
}