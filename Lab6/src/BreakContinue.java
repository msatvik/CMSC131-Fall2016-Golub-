
public class BreakContinue {
public static void main(String[]ar){
	int x=0;
	Loop1:
	for(int i=1;i<10;i++){
		x+=i;
		
		if(i%2==0){
			continue;
		}
		if(i%5==0){
			break;
		}
		System.out.println(x);
	}
	
}
}
