/*
���ݱ�׼�𰸡�ADBCD����ÿ��2�ֹ�10�֣����ÿ��ѧ�����յ÷֡�

* ����ͬѧ�𰸷ֱ�Ϊ��
  * С�У���DCBAD��
  * С�裺��ADBCD��
  * С�ȣ���ADBCA��
  * С�ã���ABCDD��
* ÿ���һ�⣬��2�֣��������ͬѧ�����յ÷֡�
*/
class Day05_Test08{
	public static void main(String[] args){
		//��׼�𰸣�
		char[] answer = {'A','D','B','C','D'};
		
		//ѧ���Ĵ�
		char[] shang = {'D','C','B','A','D'};
		char[] gui = {'A','D','B','C','D'};
		char[] gu = {'A','D','B','C','A'};
		char[] hao = {'A','B','C','D','D'};
		
		//���ÿ��ѧ�����յ÷֡�
		int shangFen = 0;
		for(int i=0; i<shang.length; i++){
			if(shang[i] == answer[i]){
				shangFen +=2;
			}
		}
		System.out.println("С�еķ�����" + shangFen);
		
		//...
	}
}