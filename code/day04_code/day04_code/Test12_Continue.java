/*
continue���������˽⣩
ֻ������ѭ���ṹ	

���ã���ǰ��������ѭ����������һ��ѭ��
*/
class Test12_Continue{
	public static void main(String[] args){
		//2����ӡ1-100��ż��
		for(int i=1; i<=100; i++){
			/*
			������������ǰ��������ѭ����������continue�����ѭ������䣬ֱ��ȥִ��i++��Ϊ��һ��ѭ����׼��
			*/
			if(i%2!=0){
				continue;
			}
			System.out.println(i);
		}
	}
}