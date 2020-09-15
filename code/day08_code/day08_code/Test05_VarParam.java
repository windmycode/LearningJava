/*
�ɱ������JDK1.5֮�������
	�β��б��г����ˡ���������... �β�������ʽ���βΣ����ǿɱ������

�����ɱ�����ķ����ĵ���ԭ��
��1���ɱ�������ββ��֣����Դ���0~n����Ӧ���͵�ʵ�Σ�Ҳ���Դ����Ӧ���͵��������
��2���ǿɱ�������ββ��֣�ԭ������ô�������ڻ���ô��

�ɱ������������ԭ��
��1��һ������ֻ�ܰ���һ���ɱ����
��2���ɱ�����������β��б�����һ��

������
��1���β�
��2��ʵ��
��3�������в���
��4���ɱ����
��5��...
*/
class Test05_VarParam{
	public static void main(String[] args){
		System.out.println(sum(1,2));
		
		int[] arr1 = new int[0];
		System.out.println("0��Ԫ�ص��ۼӺͣ�" + sum(arr1));//�ɱ�������֣������˶�Ӧ���͵��������
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println("5��Ԫ�ص��ۼӺͣ�" + sum(arr2));//�ɱ�������֣������˶�Ӧ���͵��������
		
		System.out.println("0��Ԫ�ص��ۼӺͣ�" + sum());//�ɱ�������֣�������0��ʵ�ε�intֵ
		System.out.println("5��Ԫ�ص��ۼӺͣ�" + sum(1,2,3,4,5));//�ɱ�������֣�������5��ʵ�ε�intֵ
		System.out.println("3��Ԫ�ص��ۼӺͣ�" + sum(5,3,1));//�ɱ�������֣�������3��ʵ�ε�intֵ
		System.out.println("-------------------------------");
	
		//System.out.println("0��Ԫ�ص����ֵ��" + max());//����ģ���Ϊmax������һ���ǿɱ�������βΣ����봫ֵ
		System.out.println("1��Ԫ�ص����ֵ��" + max(5));//5��ֵ���˷ǿɱ�������β�
		System.out.println("5��Ԫ�ص����ֵ��" + max(5,1,5,6,8));//��1��5��ֵ���˷ǿɱ�������βΣ�ʣ�µĸ��˿ɱ����
	}
	
	//����һ�����������ܣ����������������ĺ�
	public static int sum(int a, int b){
		return a + b;
	}
	//����һ�����������ܣ�������0~n���������ۼӺ�
	/*
	//�÷��������������(int... nums)ͬʱ����
	public static int sum(int[] nums){
		int sum = 0; 
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
		}
		return sum;
	}*/
	
	
	public static int sum(int... nums){
		//nums����������
		int sum = 0; 
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
		}
		return sum;
	}
	
	//����һ�����������ܣ�������1~n�����������ֵ
	//int num1���Ƿǿɱ��������
	//int... nums�ǿɱ����
	public static int max(int num1, int... nums){
		int max = num1;
		for(int i=0; i<nums.length; i++){
			if(nums[i] > max){
				max = nums[i];
			}
		}
		return max;
	}
	
}