package cn.tjuscs.st;

public class Calculate {
	int[] array = {50,20,5,5,1,1,1};
	public String Count(int money){
		for(int i = 0;i < array.length;i++)
		{
			money -= array[i];
			if(money > 0)
			{
				continue;
			}
			else if(money == 0)
			{
				break;
			}
			else
			{
				money += array[i];
				continue;
			}
		}
		if(money == 0)
			return "Success";
		else
			return "Failure";
	}
}
