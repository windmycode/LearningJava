/*
���������أ�
	��ͬһ�����У����������������ķ���������ͬ���β��б�ͬ����Ϊ���������ء�
	�β��б�ͬ���βεĸ������������Ͳ�ͬ
	���������غͷ���ֵ�����޹ء�
	
ΪʲôҪ�з��������أ����߻��仰˵��ΪʲôҪ�����������������ͬ�أ�
��1���������������Ĺ��ܣ��⼸�������Ĺ�����һ���ģ����磺���������ֵ
��2��Ϊ�˵����ߵķ��㣬������ͬ�ķ���ȡ��һ���Ļ������ڵ�������˵�ͼ�����ѧϰ�ͼ���ĳɱ�
*/
class Test03_Overload{
	public static void main(String[] args){
		System.out.println(max(1,4));
		System.out.println(max(1.0,4.0));
		System.out.println(max(1,4,8));
	}
	
	//дһ��������������2�����������ֵ
	public static int max(int a, int b){
		return a>b ? a : b;
	}
	//��������ʱ����ȥ������ֵ�����Ƿ�һ�£�ֻ�����������β��б�
	//public static double max(int a,int b){
	//	return 0.0;
	//}
	
	//дһ��������������2��С�������ֵ
	public static double max(double a, double b){
		return a>b ? a : b;
	}
	
	//дһ��������������3�����������ֵ
	public static int max(int a, int b, int c){
		int max = a > b ? a : b;
		max = max > c ? max : c;
		return max;
	}
}