/*
�������
2����ֵ�����
��1�������ĸ�ֵ�������=

��ֵ��������Զ�ǰ�=�ұߵĳ���ֵ��������ֵ�����ʽ�����ֵ��ֵ��=��ߵı�����
��=���ֻ����һ��������

�����˳�򣺰��ұߵ��������ʽ�����꣬�Ż������ĸ�ֵ������

��2����չ�ĸ�ֵ�����
���磺
+=
-=
*=
/=
%=
...


*/
class Test09_Assign{
	public static void main(String[] args){
		int x = 1;
		int y = 2 ;
		int z = 3;
		//x + y = z;//=���ֻ����һ������
		
		byte b1 = 1;
		byte b2 = 2;
		//b2 = b1 + b2;//�ұ�byte + byte�����int
		b2 += b1;//�ȼ���  b2 = (byte)(b2 + b1);
		System.out.println("b1 = " + b1);//1
		System.out.println("b2 = " + b2);
		
		System.out.println("---------------------------");
		int i = 1;
		int j = 5;
	
		j *= i++ + j;
		System.out.println("i = " +  i);//2
		System.out.println("j = " +  j);//30
	}
}