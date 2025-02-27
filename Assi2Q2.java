class Main {
    public static void main(String[] args) {
      Amphibian  obj=new Amphibian();
      obj.swim();
      obj.fly();
      
    }
}

class Amphibian implements flyable,swimmable{
      
      public void fly(){
          System.out.println("i can fly");
      }
      
      public void swim(){
           System.out.println("i can swim");
      }
}

interface flyable{
    void fly();
}
interface swimmable{
    
    void swim();
}