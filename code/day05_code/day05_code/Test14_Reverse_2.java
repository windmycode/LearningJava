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
class Test14_Reverse_2{
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
		//��ʽ������β����
		//����1����������   ���� = ����/2  ���磺6��Ԫ�ؽ���3�Σ�5��Ԫ�ؽ���2��
		/*
		���i���������±꣬ͬʱѭ���Ĵ��������Ա�ʾ�����Ĵ���
		*/
		for(int i=0; i<letters.length/2; i++){
			//����2��˭��˭����
			//letters[0] ~ letters[25]
			//letters[1] ~ letters[24]
			//..
			//��β����
			//letters[i] ~ letters[����-1 - i]
			
			//����3����ν���
			//��������������
			char temp = letters[i];
			letters[i] = letters[letters.length-1-i];
			letters[letters.length-1-i] = temp;
		}
		
		//��ʾ���
		for(int i=0; i<letters.length; i++){
			System.out.println(letters[i]);
		}
	}
}