/*
2������һ����ѧ�����࣬�������·�����
��1��������0~n�ַ�����ƴ�ӽ��
��2��������1~n�����ĳ˻�

*/
class Test06_Exer2{
	public static void main(String[] args){
		MyMath my = new MyMath();
		System.out.println("ƴ�ӽ����" + my.concat("�й��", "��","һ��","���׵�","��ѵ����"));
		System.out.println("5! = " + my.mutiply(1,2,3,4,5));
	}
}
class MyMath{
	//��1��������0~n�ַ�����ƴ�ӽ��
	String concat(String... args){
		String str = "";//���ַ���
		for(int i=0; i<args.length; i++){
			str += args[i];
		}
		return str;
	}	
	
	//��2��������1~n�����ĳ˻�
	long mutiply(int a, int... nums){
		long result = a;
		for(int i=0; i<nums.length; i++){
			result *= nums[i];
		}		
		return result;
	}
}