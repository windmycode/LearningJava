//ͳ��ÿ���ַ����ֵĴ�������ӡ������̨��
class Day05_Test04{
	public static void main(String[] args){
		char[] arr = {'a','l','f','m','f','o','b','b','s','n'};
		
		int[] counts = new int[26];//counts�����Ԫ�أ�ĿǰĬ��ֵ����0
		/*
		counts[0] �洢 'a'��ĸ���ֵĴ���
		counts[1] �洢 'b'��ĸ���ֵĴ���
		counts[2] �洢 'c'��ĸ���ֵĴ���
		...
		*/
		//����arr���飬ͳ��ÿһ����ĸ���ֵĴ��������ҰѴ����洢��counts������
		for(int i=0; i<arr.length; i++){
			//���磺arr[0]������'a'����ôӦ��counts[0]++
			//arr[1]������'l'����ôӦ��counts[11]++
			//��counts[�±�]���е��±�����ĸ'a','b'�ȵĹ�ϵ
			//���磺'a' ==��counts[0]��[0]�Ĺ�ϵ		'a'-97=97-97=0
			//���磺'l' ==��counts[11]��[11]�Ĺ�ϵ		'l'-97=108-97=11
			counts[arr[i] - 97]++;
		}
		
		//����counts������ʾ���
		for(int i=0; i<counts.length; i++){
			if(counts[i]!=0){
				//System.out.println(��ĸ + "--" + ����);
				System.out.println((char)(i+97) + "--" + counts[i]);
			}
		}
	}
}