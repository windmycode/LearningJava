/*
2���������ϰ
��һ������洢26��Ӣ����ĸ��Сд��ʽ��
��������ʾ
'a'->'A��
*/
class Test09_Exer5{
	public static void main(String[] args){
		//��һ������洢26��Ӣ����ĸ��Сд��ʽ
		//(1)��������������
		char[] letters = new char[26];
		
		//(2)ΪԪ�ظ�ֵ������'a','b'�ȴ洢��letters������
		//��Ϊ�й��ɣ�������ѭ����ֵ
		for(int i=0; i<letters.length; i++){
			letters[i] = (char)('a' + i);
		}
		
		//(3)��ʾ���
		//'a'->'A��
		//->��߾���Ԫ�ص�ֵ���ұ��Ǹ���Ԫ�ص�ֵ���������
		//'a'�ı���ֵ��97��'A'����ֵΪ65����32
		//'b'�ı���ֵ��98��'B'����ֵΪ66����32
		for(int i=0; i<letters.length; i++){
			System.out.println(letters[i] +"->" + (char)(letters[i]-32));
		}
	}
}