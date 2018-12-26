package studentCode;

import java.util.ArrayList;

public class AlphaListV1 {

	public ArrayList<ArrayList<String>> list;  // keep this public for easier testing 
	
	public AlphaListV1() {
		list = new ArrayList<ArrayList<String>>();
		for(int iter=0;iter<26;iter++){
			list.add(new ArrayList<String>());
		}
	}
	
	public void insert(String value) {
		
		int ascii=(int)(value.charAt(0));
		int position=ascii-(int)('A');
		list.get(position).add(value);
		}
	
	
	public void remove(String value) {
		for(int row=0;row<26;row++){
			for(int col=0;col<list.get(row).size();col++){
				if(value.equals(list.get(row).get(col))){
					list.get(row).remove(value);
				}
			}
		}
		}
	
	
	public int count() {
		int count=0;
		for(int row=0;row<26;row++){
			for(int col=0;col<list.get(row).size();col++){
		count ++;
			}
		}
		return count;
	}

}
