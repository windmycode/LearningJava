/*
�������
4���߼������
�߼��룺&
	�����ڣ���
	true & true ���Ϊtrue
	true & false ���Ϊfalse
	false & true ���Ϊfalse
	false & false ���Ϊfalse
�߼���|
	�����ڣ���
	true | true ���Ϊtrue
	true | false ���Ϊtrue
	false | true ���Ϊtrue
	false | false ���Ϊfalse
�߼��ǣ�!
	�����ڣ�ȡ��
	!true ���Ϊfalse
	!false ���Ϊtrue
�߼����^
	�����ڣ���ͬ
	true ^ true ���Ϊfalse
	true ^ false ���Ϊtrue
	false ^ true ���Ϊtrue
	false ^ false ���Ϊfalse
��·�룺&&
	�������&��һ����
	����������&&������Ѿ���false���ұ߾Ͳ�����
	true & true ���Ϊtrue
	true & false ���Ϊfalse
	false & ? ���Ϊfalse
	false & ? ���Ϊfalse
��·��||
	�������|��һ����
	����������||����Ѿ���true���ұ߾Ͳ�����
	true | �� ���Ϊtrue
	true | �� ���Ϊtrue
	false | true ���Ϊtrue
	false | false ���Ϊfalse
*/
class Test11_Logic{
	public static void main(String[] args){
		/*
		�жϳɼ��Ƿ���70��80֮��
		��ѧ��70<=score<=80
		Java�У�
		*/
		int score = -78;
		
		/*
		Test11_Logic.java:14: ����: ��Ԫ����� '<=' �Ĳ��������ʹ���
                if( 70<=score<=80){
                             ^
		  ��һ������:  boolean   70<=score����������true��false
		  �ڶ�������: int
		1 ������
		*/
		//if( 70<=score<=80){
		//	System.out.println("����");
		//}
		
		if(70<=score & score<=80){
			System.out.println("����");
		}
		
		/*
		����ɼ�����Χ[0,100]
		�жϳɼ��Ƿ�С��0 �� ����100������ɼ�����
		*/
		if(score<0 | score>100){
			System.out.println("�ɼ�����");
		}
		
		/*
		����ɼ�����Χ[0,100]
		�жϳɼ��Ƿ��ں���Χ��
		*/
		if(score>=0 & score<=100){
			
		}
		//��������ôд
		if(!(score<0 | score>100)){
			
		}
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		/*
		��·�룺&&
		��·��||
		*/
		int i = 1;
		int j;
		/*
		��һ����i++
		(1)��ȡi��ֵ��1����������
		(2)��i����,i=2
		�ڶ�������Ƚ�
		�������ġ�1�� == 1�Ƚϣ�����
		&&�����true�������·
		��������++i
		(1)������i=3
		(2)��ȡi��ֵ��3����������
		���Ĳ����Ƚ�
		�������ġ�3�� == 2�Ƚϣ������false��������
		���岽��
		��ߵ�true && �ұߵ�false���㣬���Ϊfalse���ܵ�if����������else
		*/
		//if(i++ == 1 && ++i == 2){
		//	j = 1;
		//}else{
		//	j = 2;
		//}
		
		/*
		��һ����i++
		(1)��ȡi��ֵ��1����������
		(2)��i����,i=2
		�ڶ�������Ƚ�
		�������ġ�1�� == 1�Ƚϣ�����
		||�����true���ᷢ����·���ұ߲����ˣ�++i == 2��û����
		
		��������
		true || ?�����Ϊtrue,�ܵ�if����
		*/
		if(i++ == 1 || ++i == 2){
			j = 1;
		}else{
			j = 2;
		}
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}