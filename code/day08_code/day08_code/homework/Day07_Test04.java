/*
������
����һ��������MyDate���������ԣ��ꡢ�¡��գ�����MyDate������������������
1��boolean isLeapYear()���жϵ�ǰ���ڵ���������
2��void set(int y, int m, int d)���޸��꣬�£���Ϊ������
3��void plus(int y, int m, int d)���޸ĵ�ǰ����Ϊ����y�꣬m�£�d��������
 	���磺2019��5��21�գ�  plus(1,1,1)==>2020��6��22��
 	���磺2019��5��21�գ�  plus(1,1,20)==>2020��7��11��
*/
class Day07_Test04{
	public static void main(String[] args){
		MyDate my = new MyDate();
		my.year = 2019;
		my.month = 5;
		my.day = 21;
		
		//my.plus(1,1,1);
		//my.plus(1,1,20);
		//my.plus(1,30,70);
		System.out.println(my.year + "��" + my.month + "��" + my.day);
	}
}
class MyDate{
	int year;
	int month;
	int day;
	
	boolean isLeapYear(){
		if(year%4==0 && year%100!=0 || year%400==0){
			return true;//���if�������㣬������Ͱ�true���ز�������ǰ����
		}
		return false;
	}
	//��y,m,dΪ��ǰ�����year,month,day���Ը�ֵ
	void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	//�ڵ�ǰ���ڵĻ����ϣ�����y�꣬m�£�d��
	void plus(int y, int m, int d){
		day += d;
		month += m;
		year += y;
		
		while(true){
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10){
				if(day>31){
					day -= 31;
					month++;
				}
			}else if(month==4 || month==6 || month==9 || month==11){
				if(day>30){
					day -= 30;
					month++;
				}
			}else if(month==2){
				if(year%4==0 && year%100!=0 || year%400==0){
					if(day>29){
						day -= 29;
						month++;
					}
				}else{
					if(day>28){
						day-=28;
						month++;
					}
				}
			}else if(month == 12){
				if(day>31){
					day-=31;
					month=1;
					year++;
				}
			}else if(month>12){
				while(month>12){
					month -= 12;
					year++;
				}
			}
			
			if(month>=1 && month<=12){
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
					if(day<=31){
						break;
					}
				}else if(month==4 || month==6 || month==9 || month==11){
					if(day<=30){
						break;
					}
				}else if(month==2){
					if(year%4==0 && year%100!=0 || year%400==0){
						if(day<=29){
							break;
						}
					}else{
						if(day<=28){
							break;
						}
					}
				}
			}
		}
	}
}