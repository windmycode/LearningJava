/*
.java��Դ�ļ��Ľṹ��
��{
	
	����{
		���;//�����ڷ�����
	}
}
*/

class Test07_Error{
	public static void main(String[] args){
		Circle c = new Circle();//����ʹ�������⣬�����ٽ��ڲ����ʹ��
	}
	//�ڲ��࣬
	class Circle{
		double radius;
	
		//System.out.println("�뾶��" + radius);//����ģ����ܰ����д����������ȥ
		void printInfo(){
			System.out.println("�뾶��" + radius);
		}
	
		//printInfo();//��Ҳ��䣬���÷��������
		void test(){
			printInfo();
		}
	}
}
