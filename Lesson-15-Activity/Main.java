class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String spaces(int N){
    String result= " ";
    for(x=0, x<=N; x++){
      result += " ";
    }
    return result;
  }

  double harmonic(int N){
    double sum =0; 
    for(int x=0; x<=N; x++){
      sum += 1/N;
    }
    return sum;
  }

  double sine(int N, int deg){
    double sum = 0;
    for(int x=0; x<=N; x++){
      sum += ;
    }
    return sum;
  }

  void init(){
    System.out.println(spaces(3)+"DONE");
    System.out.println(spaces(5)+"DONE");

    System.out.println(harmonic(1));
    System.out.println(harmonic(2));

    
    
  }


  
}