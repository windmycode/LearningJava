class Test01_Review{
	public static void main(String[] args){
		int score = 10;//ʡ������
		
		if(score<0 || score>100)
			System.out.println("��������");//�򵥵����
		else
			//�������
			if(score==100){
				System.out.println("����");
			}else if(score>=80){
				System.out.println("����");
			}else if(score>=60){
				System.out.println("����");
			}else{
				System.out.println("������");
			}
	}
}