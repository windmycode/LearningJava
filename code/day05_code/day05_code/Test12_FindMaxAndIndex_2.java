/*
�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
*/
class Test12_FindMaxAndIndex_2{
	public static void main(String[] args){
		int[] array = {4,2,-7,8,1,9};
		
		//��Сֵ�����±�
		//(1)�����һ��Ԫ����С
		int minIndex = 0;//array[minIndex]������Сֵ
		
		//(2)��min������Ԫ��һһ�Ƚ�
		for(int i=1; i<array.length; i++){
			if(array[i] < array[minIndex]){
				minIndex = i;
			}
		}
		System.out.println("��Сֵ�ǣ�" + array[minIndex]);
		System.out.println("��Сֵ���±��ǣ�" + minIndex);
	}
}