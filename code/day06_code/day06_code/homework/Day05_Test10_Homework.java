//����Ԫ��ȥ��
class Day05_Test10_Homework{
	public static void main(String[] args){
		int[] arr = {9,10,6,6,1,9,3,5,6,4};//���ظ���Ԫ��
		
		//��1���������count����ʼ��Ϊԭ����ĳ��ȣ�
		//ͨ������Ĳ��������޸�count�����մ���������ĳ��ȣ������ظ�Ԫ�صĸ���
		int count = arr.length;//��ʼ��Ԫ�ظ���
		
		//��2�������Ƿ����ظ���Ԫ�أ����Ѻ�����Ǹ��ظ���Ԫ�ظ��ǵ���Ȼ��count--
		for(int i=0; i<count; i++){
			//��arr[i]���������Ԫ��һһ�Ƚϣ��������ȵģ�˵���ظ���
			//����j��ʼ��Ϊi+1����Ϊ��arr[i+1]��ʼ�Ƚ�
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