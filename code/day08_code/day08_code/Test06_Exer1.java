/*
1������һ��ͼ�ι����࣬�������·�����
��1��double getTriangleArea(double base,double height)
��2��double getTriangleArea(double a,double b, double c)

double getTriangleArea(double base,double height)������ǩ���򷽷���

���� = ����ǩ��/����ͷ + ������

����ǩ���������η��� ����ֵ���� ������(���β��б�)
�����壺{}
*/
class Test06_Exer1{
	public static void main(String[] args){
		GraphicTools tools  = new GraphicTools();
		System.out.println("��Ϊ3����Ϊ4������������ǣ�" +tools.getTriangleArea(3,4));//�ͺ͸�
		System.out.println("����Ϊ3,4,5������������ǣ�"+ tools.getTriangleArea(3,4,5));
		
		System.out.println("����Ϊ1,1,1������������ǣ�"+ tools.getTriangleArea(1,1,1));
	}
}
class GraphicTools{
	double getTriangleArea(double base,double height){
		return base * height / 2;
	}
	
	double getTriangleArea(double a,double b, double c){
		//��������֮�ʹ��ڵ�����
		if(a+b>c && a+c>b && b+c>a){
			double p = (a+b+c)/2;
			double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));//���׹�ʽ
			return area;
		}else{
			return 0.0;//��������
		}
	}
}