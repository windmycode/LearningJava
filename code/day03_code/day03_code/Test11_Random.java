class Test11_Random{
	public static void main(String[] args){
		//ʹ��Math.random() ���������
		System.out.println(Math.random());
		/*
		Math.random()���������������[0,1)��С��
		*/
		
		//�������Ҫ����[1,10]֮�������
		double rand = Math.random();//[0,1)��С��
		
		rand = rand * 10; //[0,10)��С��
		
		rand = rand + 1; //[1,11)��С��
		
		int num = (int)rand;//[1,10]������
		
		System.out.println(num);
		
		int m = (int)(Math.random()*10 + 1);
	}
}