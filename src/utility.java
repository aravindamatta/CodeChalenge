

public final class utility {
	
    public String calc(double v1, String v2, String v3, double v4) {
    	    String message = " Correct...";	
    	    double c2f = ((v1)* 9 / 5) + 32; 
	        double c2k = v1 + 273.15 ;
	        double f2c = (v1 - 32) *5/9; 
	        double f2k = (v1 - 32) * 5/9 + 273.15 ;
	        double k2c = v1 - 273.15;
	        double k2f = (v1 - 273.15) * 9/5 + 32 ; 	        

		if (v2.equals("Fahrenheit")&& v3.equals("Celsius")){
			if(f2c!=v4){
				  message = "Incorrect ... Correct value is ."+f2c;
			   }
		}else if (v2.equals("Celsius") && v3.equals("Fahrenheit")){
			if(c2f!=v4){
				  message = " incorrect ... correct value is ."+c2f;
			   }
		}else if (v2.equals("Fahrenheit")&& v3.equals("Kelvin")){
			if(f2k!=v4){
				  message = " Incorrect ... correct value is ."+f2k;
			   }
		}else if (v2.equals("Celsius")&& v3.equals("Kelvin")){
			if(c2k!=v4){
				 message = " incorrect ... correct value is ."+c2k;
			   }
		}else if (v2.equals("Kelvin")&& v3.equals("Celsius")){
			if(k2c!=v4){
				 message = "Incorrect ... correct value is ."+k2c;
			   }
		}else if (v2.equals("Kelvin")&& v3.equals("Fahrenheit")){
			if(k2f!=v4){
				  message = "Incorrect ... correct value is ."+k2f;
			   }
		}else if (v2.equals(v3)){
			if(v1!=v4){
				message = "Incorrect! ..Answere is "+v1;
			   }
		}	 
	 return message;    	
	}

}