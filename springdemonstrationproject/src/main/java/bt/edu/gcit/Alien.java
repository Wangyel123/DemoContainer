package bt.edu.gcit;

public class Alien {
    // private int age;

    // private Laptop lap;
    private Computer comp;  
//    private Desktop comp1;

    // public int getAge(){
    //     return age;
    // }
    // public void setAge(int age){
    //     System.out.println("setAge method called");
    //     this.age = age;
    // }
    public Alien(){
        System.out.println("Alien object created");
    }
    
    // public Alien(Laptop lap){
    //     this.lap = lap;
    // }
    public void code(){
        System.out.println("I am coding");
        // lap.compile();
        comp.compile();
    }

    // public Laptop getLap(){
    //     return lap;
    // }
    // public void setLap(Laptop lap){
    //     this.lap = lap;
    // }

    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Computer getComp(){
        return comp;
    }
    // public void getComp1(){
    //     comp1.compile();
    // }
    // public void setComp1(Desktop comp1){
    //     this.comp1 = comp1;
    // }
}
