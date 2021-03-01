import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class IplSeason {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter the top 5 teams of Iplseason 13");
		 String list1=br.readLine();
		 String list2=br.readLine();
		 String list3=br.readLine();
		 String list4=br.readLine();
		 String list5=br.readLine();
		 ArrayList<String> list=new ArrayList<String>();
		 list.add(list1);  
		 list.add(list2);  
		 list.add(list3);  
		 list.add(list4);
		 list.add(list5);
		 System.out.print("enter the position1 where to swap : ");
			int pos1 = Integer.parseInt(br.readLine());
			System.out.print("enter the position2 where to swap : ");
			int pos2 = Integer.parseInt(br.readLine());
			
			
			Collections.swap(list, pos1, pos2);
			System.out.println("AFTER SWAPPING");
			
			for(String s : list) {
				System.out.println(s);
			}
			
		 

	}
}

