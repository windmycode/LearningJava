/*
������������֮���ת����
��1���Զ�����ת��
�ٰѴ洢��ΧС�����͵�ֵ��ֵ���洢��Χ������͵ı������Զ������������
byte->short->int->long->float->double
		char->
��boolean������
��byte,short,char��������������㶼���Զ�����Ϊint


��2��ǿ������ת��
�ٰѴ洢��Χ������͵�ֵ����ֵ���洢��ΧС�����ͱ���ʱ����Ҫǿ������ת��
double->float->long->int->short->byte
						->char
ǿ������ת�����з��յģ����ܻ��������ʧ����						
��boolean������	
�۵���Ҫ��ĳ���洢��ΧС�ı���ǿ������Ϊ�洢��Χ�������ʱ��Ҳ����ʹ��ǿ������ת��			
*/
class Test03_TypeChange{
	public static void main(String[] args){
		/*
		����߿�d1��double����
		���ұ߿�10��int����
		int���͵�ֵ����ֵ����double���͵ı�������ô�����Զ�����Ϊdouble
		*/
		double d1 = 10;
		System.out.println("d1 = " + d1);
		
		
		/*
		����߿�i1��int����
		���ұ߿�10.0��double����
		double���͵�ֵ����ֵ��int���͵ı��������ֱ�Ӹ�ֵ�ᱨ������: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
		*/
		//int i1 = 10.3;
		int i1 = (int)10.3;
		System.out.println("i1 = " + i1);
		
		byte b1 = 127;
		byte b2 = 2;
		//byte b3 = b1 + b2;//���������ݵ�����: ��intת����byte���ܻ�����ʧ����Ϊbyte+byte���Զ�����Ϊint
		byte b3 = (byte)(b1 + b2);
		System.out.println("b3 = " + b3);
		
		short s1 = 1;
		short s2 = 2;
		//short s3 = s1 + s2;//short+short���Զ�����Ϊint
		short s3 = (short)(s1 + s2);
		System.out.println("s3 = " + s3);
		
		char c1 = '0';//'0'�ı���ֵ��48
		char c2 = '1';//'1'�ı���ֵ��49
		//char c3 = c1 + c2;//char+char���Զ�����Ϊint
		char c3 = (char)(c1 + c2);
		System.out.println("c3 = " + c3);//'a'
		
		boolean flag = true;
		//int num = (int)flag;//�����ݵ�����: boolean�޷�ת��Ϊint
		
		int x = 1;
		int y = 2;
		System.out.println("x / y = " + x/y);//����/�������������������ֻ������������
		System.out.println("x / y = " + (double)x/y);//��x��int������ǿ������Ϊdouble����
		
	}
}