/*
�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
*/
class Test12_FindMaxAndIndex{
	public static void main(String[] args){
		int[] array = {4,2,-7,8,1,9};
		
		//��Сֵ�����±�
		//(1)�����һ��Ԫ����С
		int min = array[0];
		int index = 0;
		
		//(2)��min������Ԫ��һһ�Ƚ�
		for(int i=1; i<array.length; i++){
			if(array[i] < min){
				min = array[i];
				index = i;
			}
		}
		System.out.println("��Сֵ�ǣ�" + min);
		System.out.println("��Сֵ���±��ǣ�" + index);
	}
}