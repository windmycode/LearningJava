/*
1������һ����ѧ�����࣬����������
��1���������������������ĺ�
��2���������������������Ĳ�
��3���������������������Ļ�
��4������������������������
��5�����Դ�ӡ�������������ģ��ͣ��������
*/
class Test13_Exer4{
	public static void main(String[] args){
		//1����������
		MathTools tools = new MathTools();
		
		//2������printInfo
		tools.printInfo(4,5);
	}
}
class MathTools{
	//��1���������������������ĺ�
	int sum(int a, int b){
		return a+b;
	}
	//��2���������������������Ĳ�
	int subtract(int a, int b){
		return a-b;
	}
	//��3���������������������Ļ�
	int multiply(int a, int b){
		return a*b;
	}
	//��4������������������������
	int divide(int a, int b){
		return a/b;
	}
	//��5�����Դ�ӡ�������������ģ��ͣ��������	
	void printInfo(int a, int b){
		System.out.println(a + "+" + b + "=" + sum(a,b));
		System.out.println(a + "-" + b + "=" + subtract(a,b));
		System.out.println(a + "*" + b + "=" + multiply(a,b));
		System.out.println(a + "/" + b + "=" + divide(a,b));
	}
}