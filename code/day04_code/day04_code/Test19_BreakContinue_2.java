class Test19_BreakContinue_2{
	public static void main(String[] args){
		//out���Ǳ�ǩ���ƣ��ͱ�����һ���������򣬹淶
		//��ǩ�������:
		out:for(int i=1; i<=5; i++){
			
			for(int j=1; j<=5; j++){
				System.out.print("*  ");
				if(i==j){//�����Ҫ����i==jʱ������������˫��ѭ��������ѭ��һ�����
					break out;
				}
			}
			System.out.println();
		}
	}
}