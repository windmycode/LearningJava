/*
ѭ��Ƕ�ף�

5��������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
    ���磺 153 = 1*1*1 + 5*5*5 + 3*3*3 
*/
class Test16_Exer5{
	public static void main(String[] args){
		//��νˮ�ɻ�����ָһ��3λ��==>[100,999]
		//��λ��1-9
		//ʮλ��0-9
		//��λ��0-9
		
		/*
		��bai=1, shi���0�䵽9������һ��
		��shi=0,ge���0�䵽9������һ��
		*/
		for(int bai = 1; bai<=9; bai++){
			for(int shi = 0; shi<=9; shi++){
				for(int ge = 0; ge<=9; ge++){
					if(bai*bai*bai + shi*shi*shi + ge*ge*ge == bai*100+shi*10+ge){
						System.out.println(bai*100+shi*10+ge);
					}
				}
			}
		}
	}
}