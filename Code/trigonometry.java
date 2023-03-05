class trigonometry extends Operation {                     
	
	

	void doOperation(String operator3) {                     //Method Overriding
		super.doOperation(operator3); 

		
		switch(operator3) {
		case "sin":                  //performs sin function
			operator2="sin "+firstNum;
			result=Math.sin(firstNum*0.0175);
			textview.setText("sin"+"("+firstNum+")");
			break;
		case "cos":
			result=Math.cos(firstNum*0.0175);//performs cos function
			operator2="cos "+firstNum;
			textview.setText("Cos"+"("+firstNum+")");
			break;
		case "tan":
			result=Math.tan(firstNum*0.0175);         //performs tan function
	    	operator2="tan "+firstNum;
	    	textview.setText("tan"+"("+firstNum+")");
			break;
		case "sini":
			result=57.2958* Math.asin(firstNum); //performs inverse  sin function
			operator2="sin' "+firstNum;	
			textview.setText("sin'"+"("+firstNum+")");
			break;
		case "cosi":
			result=57.2958* Math.acos(firstNum);//performs inverse cos function
			operator2="cos' "+firstNum;	
			textview.setText("cos'"+"("+firstNum+")");
			break;
		case "tani":
			result=57.2958* Math.tan(firstNum); //performs inverse tan function
			operator2="tan' "+firstNum;	
			textview.setText("tan'"+"("+firstNum+")");
		}	
		r3=operator3;
		textField.setText(String.valueOf(result));
		op = null;
	}
}
