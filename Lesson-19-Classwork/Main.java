class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String rollDice(int d1, int d2){
    String roll = "";
    d1 = (int)(Math.random()*(6)+1);
    d2 = (int)(Math.random()*(6)+1);
    return roll = d1 + "" + d2;
  }

  String lotto(){
    String lot = "";  
    for(int x = 0; x < 5; x++){
      int num = (int)(Math.random()*(48)+1);
      lot += num + " ";
    }
   return lot;
  }

  String additionTutor(){
    String equation = " "; 
    int num1 = (int)(Math.random()*(100)+1);
    int num2 = (int)(Math.random()*(100)+1);
    equation = num1 + " " + "+" + " " + num 2;
    System.out.println("What is the sum?");
    int user = Input.readInt(); 
    String ans = num1 + num2; 
    if (user.equals(ans)){
      return "Correct"; 
    }else{
      return "Incorrect";
     }
    }
    

  }

  void init(){
    System.out.println(rollDice());
    System.out.println(lotto());
    System.out.println(additionTutor());

   
  }

  String addNums(int one, int two){
    String sum = 

  }

  
