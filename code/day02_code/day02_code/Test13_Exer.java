class Test13_Exer{
	public static void main(String[] args){
		boolean x = true;
		boolean y = false;
		short z = 42;
		/*
		��һ����z++
		(1)��ȡz��ֵ��42��
		(2)z���� z=43
		�ڶ������Ƚ�
		�á�42����42�Ƚϣ�����������true
		
		�м���&&����·�룬����û�������·�����ұ߼���
		��������
		ȡy��ֵfalse
		���Ĳ���
		�Ƚϣ���"false"��true�Ƚϣ�������������false
		���岽��
		true && false�����Ϊfalse��if������������z++��ִ��
		*/
		if((z++==42) && (y==true))
			z++;
		
		/*
		||��ߣ�x=false�����Ǹ�ֵ���㣬�����Ȼ��false
		�м�||���Ƕ�·�򣬵���û�������·�����ұ߼���
		�ұߣ�
		++z��������z=44��Ȼ��ȡz��ֵ��44����Ȼ����45���бȽϣ����Ϊfalse
		��ߵ�false || �ұߵ�false���������false��if��������z++��ִ��
		*/
		if((x=false) || (++z==45))
			z++;
		System.out.println("z = " + z);//44
	}
}