class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog dog1 = new Dog("Poodle", 4, "Lola");
    dog1.speak();
    Dog dog2 = new Dog("Yorkie", 5, "Emma");
    dog2.speak();
    Dog dog3 = new Dog("Husky", 6, "Geo");
    dog3.speak();
   
    
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}