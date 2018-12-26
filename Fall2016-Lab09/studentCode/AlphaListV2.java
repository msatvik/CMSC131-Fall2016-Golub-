package studentCode;

import java.util.ArrayList;
import java.util.Arrays;
public class AlphaListV2 {

	public String[][] list;  // keep this public for easier testing 
	
	public AlphaListV2() {
	list= new String[26][0];
	}
	
	public void insert(String value) {
	int big_arr=(int)(value.charAt(0))-65;
	list[big_arr]=Arrays.copyOf(list[big_arr],list[big_arr].length+1);
	list[big_arr][list[big_arr].length - 1] = value;
	}
	
	public void remove(String value) {
		int num1=(int)'A';
		int num=(int)value.charAt(0);
		num=num-num1;
		String[]temp= new String[list[num].length-1];
		int count=0;
		for(int i=0;i<temp.length+1;i++){
			if(!(list[num][i].equals(value))){
				temp[count]=new String(list[num][i]);
				count++;
			}
		}
		list[num]=temp;
	}
	
	public int count() {
	int total=0;
	for(int big_arr=0;big_arr<26;big_arr++)
	for(int sml_arr=0;sml_arr<list[big_arr].length;sml_arr++)
	if(!((list[big_arr][sml_arr]).equals(null)))
	total++;
	return total;
	}
}