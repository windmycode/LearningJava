/*
�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
*/
class Test12_FindMaxAndIndex_3{
	public static void main(String[] args){
		int[] array = {4,2,-7,8,1,-7};
		
		//�ҳ���Сֵ�������±꣬���������Сֵ����������
		/*
		��1�����ҳ���Сֵ
		��2���ҳ�������Сֵ���±�
		*/
		//��1�����ҳ���Сֵ
		int min = array[0];
		for(int i=1; i<array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		System.out.println("��Сֵ��" + min);
		
		//��2���ҳ�������Сֵ���±�
		System.out.println("��Сֵ���±��У�");
		for(int i=0; i<array.length; i++){
			if(array[i] == min){
				System.out.print("[" + i + "]\t");
			}
		}
		
	}
}