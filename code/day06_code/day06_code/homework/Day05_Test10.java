//����Ԫ��ȥ��
class Day05_Test10{
	public static void main(String[] args){
		int[] arr = {9,10,6,6,1,9,3,5,6,4};//���ظ���Ԫ��
		
		/*
		��1���������count����ʼ��Ϊԭ����ĳ��ȣ�ͨ��ĳЩ�����������޸�count�����մ���������ĳ���
		��2�������Ƿ����ظ���Ԫ�أ������count--
		*/
		int count = arr.length;//count��ֵ����������������ĳ���
		
		//��2�������Ƿ����ظ���Ԫ�أ������count--
		for(int i=0; i<arr.length; i++){
			//��arr[i]���������Ԫ��һһ�Ƚϣ��������ȵģ�˵���ظ���
			//����j��ʼ��Ϊi+1
			for(int j=i+1; j<count; j++){
				if(arr[i] == arr[j]){//˵�����ظ���
					//��j�����Ԫ����ǰ�ƶ�
					for(int k=j; k<count-1; k++){//ѭ���Ĵ�������Ҫ�ƶ��ĸ���
						arr[k] = arr[k+1];
					}
					
					count--;
				}
			}
		}
		
		//��3������������
		int[] newArr = new int[count];
		
		//��4������Ԫ�أ���arr��ǰ���count��Ԫ�ظ��Ƶ���������
		for(int i=0; i<count; i++){
			newArr[i] = arr[i];
		}
		
		//��5����ʾ���
		for(int i=0; i<newArr.length; i++){
			System.out.print(newArr[i]+ " ");
		}
	}
}