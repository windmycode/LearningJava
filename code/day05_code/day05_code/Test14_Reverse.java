/*
����
��1�����ݽṹ����δ洢����
��2���㷨��ʵ�ֹ��ܵĴ�����߼��ṹ

�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
3�������Ԫ���ۼӺͼ�ƽ��ֵ
4������ķ�ת
*/
class Test14_Reverse{
	public static void main(String[] args){
		//��һ�����飬�洢26����ĸ
		//'A'~'Z'
		char[] letters = new char[26];
		for(int i=0; i<letters.length; i++){
			letters[i] = (char)('A' + i);
		}
		
		//����Ҫ��ת��������
		//ԭ��letters[0]�д洢����'A'-->����letters[0]�д洢����'Z'
		//...
		//ԭ��letters[25]�д洢����'Z'-->����letters[25]�д洢����'A'
		//��ʽһ������һ����ԭ�������鳤����ͬ�������飬����������Ԫ��
		char[] newLetters = new char[letters.length];
		//������Ԫ��
		for(int i=0; i<newLetters.length; i++){
			newLetters[i] = letters[letters.length-1-i];
		}
		
		//��letters���������ָ���µ�����
		letters = newLetters;
		
		//��ʾ���
		for(int i=0; i<letters.length; i++){
			System.out.println(letters[i]);
		}
	}
}