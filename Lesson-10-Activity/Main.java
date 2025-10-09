
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		gpa(80); //return 80
		gpa(91); //return 100.1
	isGraduating(12, 44); //return true
	isGraduating(12, 30); //return false
	isGraduating(10, 44); //return true
    BMI( 90, 63); //return 15.9 = Underweight
	shippingCost(12); //return 10.0
	blueorViolet(650); //return true
	blueorViolet(720); //return true
  }
   double gpa(double gpa){
	if(gpa > 90){
		return gpa*1.1;
	}else{
		return gpa;
	}
   }

   String isGraduating(int gradelvl, int credits){
	if(gradelvl == 12 && credits >=44){
		return true;
	}else{
		return false;
	}
   }

   String BMI(souble weight, double height){
	double bmi = (weight/Math.pow(height,2))*703;
	if( bmi <= 18.4){
		return "Underweight";
	}else if(bmi >= 18.5 && bmi <= 24.9){
		return "Normal";
	}else if(bmi >= 25 && bmi <= 39.9){
		return "Overweight";
	}else if(bmi >= 40.0){
		return "Obese";
	}
   }

   double shipinhCost(double weight){
	if (weight <= 10){
		return 0.00;
	}else if(weight > 10 && weight <= 15){
		return 5.00;
	}else if (weight > 15 && <= 25 ){
		return 10.00;
	}else{
		return 10.00 + ((weight/25)*.02);
	}
   }

   boolean blueorViolet(int lightFrequency, String color){
	if (( lightFrequency >= 600 && lightFrequency <= 
	670) || (lightFrequency >= 700 && lightFrequency <= 750)){

	}
		return true;
	}else if{
		return false;
	}
   }
}