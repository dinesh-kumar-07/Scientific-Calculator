import java.awt.Font;

import javax.swing.JButton;

 class Operation extends basicValues {   

	
	
	public static String f= operator;
	public static String d,d1 ,r1,r2,r3;
	
	

 final void doOperation(JButton operator) 
 {		r1=operator.getText();
		switch(r1) {
		
		case "+":
			result=firstNum+secondNum;
			operator1=firstNum+" + "+ secondNum;                                  //add the two number
			break;
		case "–":
			operator1=firstNum+" – "+ secondNum;                                 //subtract the subtracting
			result=firstNum-secondNum;
			break;
		case "×":
			operator1=firstNum+" × "+ secondNum;                                       //multiplying two numbers
			result=firstNum*secondNum;
			break;
		case "÷":
			operator1=firstNum+" ÷ "+ secondNum;                               //dividing two numbers
			result=firstNum/secondNum;
			break;
		case "%":
			operator1=firstNum+" % "+ secondNum;                      //getting remainder of two number 
			result=firstNum%secondNum;
			break;
		case "x\u02B8":                                            //for doing x power y operation
			operator1=firstNum+" ^ "+ secondNum;
			result=Math.pow(firstNum,secondNum);
			break;    
		case "log\u2090x":     
			
			
			result=Math.log10(firstNum)/Math.log10(secondNum);   //log to base a
		    break;
		}
	
		
		if(r1=="log\u2090x")
		{
			
			 textview.setText("log");
			  d =textview.getText();
		    	
			 textview.setFont(new Font("Mangal", Font.PLAIN, 1));
			 int a = (int)secondNum;
			 textview.setText(d+String.valueOf(a+"  "));
			d1= textview.getText();
			
			 textview.setFont(new Font("Cambria", Font.PLAIN, 20));
			 textview.setText(d1 +String.valueOf(("( "+firstNum+" )")));
			 textField.setText(String.valueOf(result));
			 op=null;
		}
		else
		{
			 textview.setText(operator1+" = "+result);
			textField.setText(String.valueOf(result));
			op=null;
		}
	}
 

	 void doOperation(String operator)
	 {                    
			switch(operator) {
			case "sqrt":                                             //root of number
				operator2="\u221A"+firstNum;
				result=Math.sqrt(firstNum);
				
				break;
			case "exp":                                        //exponential function
				operator2="e ^ "+firstNum;
				result=Math.exp(firstNum);
				
				break;
			case "x^2":                                   //square of number
				operator2=firstNum+" ²";
				result=Math.pow(firstNum,2);
				
				break;
			case "x^3":                              //cube of number
				operator2=firstNum +" ³";
				result=Math.pow(firstNum,3);
				
				break;
			case "10^x":                         //power of 10
				operator2="10 ^ "+firstNum;
				result=Math.pow(10,firstNum);
				
				break;
			case "2^x":                    //power of 2
				operator2="2 ^ "+firstNum;
				result=Math.pow(2,firstNum);
				
				break;
			case "log":                            //log
				operator2="log "+firstNum;
				result=Math.log10(firstNum);
				
				break;
			case "ln":                                  //ln
				operator2="ln "+firstNum;
				result=Math.log(firstNum);
				break;
			case "inverse":                            //inverse of number
				operator2=firstNum+" ¯¹";
				result=1/firstNum;
				
				break;
			case "modulus":                         //turns negative number to positive number
				operator2="| "+firstNum+" |";
				result=Math.abs(firstNum);
				
				break; 
			case "random":                         //randomize the value
				operator2="rand ( "+firstNum+" )";
				result=Math.random();
				
				break;
			case "floor":                             //round up of number
				operator2="[ "+firstNum+" ]";
				result=Math.round(firstNum);
				
				break;
			case "xfact":
				operator2=firstNum+" !";
				double fact=1;
				for(double i=firstNum; i>0; i--) {
					fact*=i;				
				}
				result=fact;
				break;
			case "e":
				if (firstNum==1)
				{
					textview.setText("e");
					result=Math.E;
				}
				else
				{
					operator2=firstNum+" × e";
					result=firstNum*(Math.E);
				}
				
				break;
			case "pi":
				if (firstNum==1)
				{
					textview.setText("");
					result=Math.PI;
				}
				else
				{
					operator2=firstNum+" × pi";
					result=firstNum*(Math.PI);
				}
				
				break;
				
			}
			r2=operator;
			
			op=null;
		}
 
}
