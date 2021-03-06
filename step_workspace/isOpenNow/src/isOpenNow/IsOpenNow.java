package isOpenNow;

import java.util.Calendar;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IsOpenNow {

	public static boolean isOpenNow(int dayOfWeek, int hour, String shop){
		File file = new File("opentime");
		try{
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);
		
			int j = 100; //店舗数
		
			while(j > 0){		
				String opentime = br.readLine();
				String[] time = opentime.split(",",0);
				String openday = br.readLine();
				String[] day = openday.split(",",0);
			
				int check = -1;
				int i;
		
				if(time[0] == shop){
			
					for(i = 0; i < (time.length-1)/2; i++){
						if(Integer.parseInt(time[i*2 + 1]) < hour 
								|| hour < Integer.parseInt(time[i*2 +2])){
							check = 0;
							break;
						}
					}//for.time
		
					//Sunday(1) ~ Saturday(7)
					if(check != 0){
						br.close();
						return false;
					}else{
					
						for(i = 0; i < day.length; i++){
							if(Integer.parseInt(day[i]) == dayOfWeek){
								br.close();
								return false;
							}
						}//for.day	
					}
					br.close();
					return true;
				}//if
				j--;
			}//while
		br.close();
		return false;
		}catch(IOException e){
			System.out.println(e);
			return false;
		}
}
	
	public static boolean isOpenNow(String shop){
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		return isOpenNow(dayOfWeek, hour, shop);
		
	}
}
