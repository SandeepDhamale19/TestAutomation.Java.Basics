package Programming;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
	
public static void main(String[] args) {
		
		ILambda myLambda = (String x) -> {
			System.out.println("----------->"+x);
			return 0;
		};
		myLambda.show("Hello to Lambda Expression");
		
		List<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        
        arrL.forEach(ele -> System.out.println(ele));
        
	}
}
