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
	��˳�����
	�ڶ��ֲ���
*/
// ���ֲ���
class Test02_Find_2{
	public static void main(String[] args){
		int[] arr = {1,2,5,7,9,10};//����ģ���С����
		
		int value = 10;
		
		int index = -1;
		int left = 0;
		int right = arr.length-1;
		int mid = (left + right)/2;
		/*
		��������ĳ�����5��left=0,right=4,mid = 2
		��������ĳ�����6��left=0,right=5,mid = 2
		*/
		
		while(left<=right){
			if(arr[mid] == value){//�ҵ���
				index = mid;
				break;
			}else if(value > arr[mid]){//ȥ�ұ���
				left = mid + 1;//��Ϊmid�ȽϹ��ˣ��Ͳ��ÿ��ˣ���mid����һ����Ϊ��߽�
			}else{//˵��value < arr[mid] ȥ�����
				right = mid - 1;
			}
			mid = (left + right)/2;//���¼���mid����Ϊleft��right�޸���
		}
		
		if(index == -1){
			System.out.println(value+"������");
		}else{
			System.out.println(value+"�������е��±��ǣ�" + index);
		}
	}
}