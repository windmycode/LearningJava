/*
����
��1�����ݽṹ����δ洢����
��2���㷨��ʵ�ֹ��ܵĴ�����߼��ṹ

�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
3�������Ԫ���ۼӺͼ�ƽ��ֵ
4������ķ�ת
5������ĸ���
��1������һ����ԭ��һ�������飬���Ⱥ�Ԫ��
��2������һ����ԭ������̵�
	���磺��ԭ�����н�ȡһ����
��3������һ����ԭ���ĳ���
	���磺�������ݣ���ô��������ԭ�������鳤
*/
class Test15_Copy_04{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		/*
		����һ�������飬������ĳ����ɼ������룬���ܺ�ԭ��һ�������ܱ�ԭ���Ķ̣����ܱ�ԭ���ĳ�
		*/
		/*
		��1���Ӽ�������������ĳ���
		*/
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������������ĳ��ȣ�");
		int len = input.nextInt();
		
		//��2������������
		int[] newArr = new int[len];
		
		//��3������Ԫ�أ����ﶼ�Ǵ�ԭ�����[0]��ʼ����
		//i<arr.length && i<newArr.length��֤newArr[i] = arr[i];�������߶���Խ��
		for(int i=0; i<arr.length && i<newArr.length; i++){
			newArr[i] = arr[i];
		}
		
		//(4)�������
		for(int i=0; i<newArr.length; i++){
			System.out.println(newArr[i]);
		}
	}
}