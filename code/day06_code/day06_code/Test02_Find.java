/*
������㷨��
1������ֵ
2������ֵ�����±�
3��ͳ�ƣ��ۼӺ͡�ƽ��ֵ��
4����ת
5������
6�����ң��������У�����ĳ��ֵ�Ƿ���ڣ����߲���ĳ��ֵ���±�
��1�������е�Ԫ���������
	˳�����
��2�������е�Ԫ���������
*/
class Test02_Find{
	public static void main(String[] args){
		int[] arr = {1,4,5,7,9};
		
		//��arr�������У�����2���±꣬�����ж�2���������Ƿ����
		int value = 2;
		int index = -1;//��Ϊ�������±꣬û��-1
		for(int i=0; i<arr.length; i++){
			if(arr[i] == value){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println(value+"������");
		}else{
			System.out.println(value+"�������е��±��ǣ�" + index);
		}
		
	}
}