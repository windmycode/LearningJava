/*
�����в�����(�˽�)
	��main��������ʵ�Σ����������в���
��ʽ��
	java main���ڵ�����  ʵ��1  ʵ��2 ...
���磺
	java  Test04_CommandParam  hello java atguigu
*/
class Test04_CommandParam{
	/*
	��ΪmainҲ��һ���в��޷���ֵ�ķ�������ô��θ�main�������أ�
	*/
	public static void main(String[] args){
		//args���βΣ���String[]���ͣ���һ��һά����
		for(int i=0; i<args.length; i++){
			System.out.println("��" +(i+1) +"��������ֵ��" + args[i]);
		}
	}
}