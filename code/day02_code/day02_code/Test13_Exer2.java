class Test13_Exer2{
	public static void main(String[] args){
		boolean x = true;
		boolean y = false;
		short z = 42;
		
		
		/*
		����y=true�Ǹ�ֵ���������true,��ʾ��������������y��ֵ�Ѿ���Ϊtrue
		*/
		if(y=true)
		/*
		��һ����z++
		(1)��ȡz��ֵ��42��
		(2)z���� z=43
		�ڶ������Ƚ�
		�á�42����42�Ƚϣ�����������true
		
		�м���&&����·�룬����û�������·�����ұ߼���
		��������
		ȡy��ֵtrue
		���Ĳ���
		�Ƚϣ���"true"��true�Ƚϣ�����������true
		���岽��
		true && true�����Ϊtrue��if����������z++ִ��
		z = 44
		*/
		if((z++==42) && (y==true))
			z++;
		
		/*
		||��ߣ�x=false�����Ǹ�ֵ���㣬�����Ȼ��false
		�м�||���Ƕ�·�򣬵���û�������·�����ұ߼���
		�ұߣ�
		++z��������z=45��Ȼ��ȡz��ֵ��45����Ȼ����45���бȽϣ����Ϊtrue
		��ߵ�false || �ұߵ�true���������true��if������z++ִ�У�z=46
		*/
		if((x=false) || (++z==45))
			z++;
		System.out.println("z = " + z);//46
	}
}