class Day05_Test09_Homework2{
	public static void main(String[] args){
		int[] arr = {26,67,49,38,52,66,7,71,56,87};
		
		int i=0;
		int j = arr.length-1;
		while (i < j){
			if(arr[i]%2==0){//������arr[i]��ż���������ұ�arr[j]����
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				//��Ϊ����û�п�arr[j]����������ż����
				//����i���ƶ�������arr[i]�Ϳ�������һ��ѭ��ʱ�������ж�����������ż��
				j--;//������arr[j]һ����ż�������ԣ�j�����ƶ�һλ
			}else{
				i++;//���arr[i]��������i�����ƶ��ƶ���j����
			}
		}
	}
}