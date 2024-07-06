abstract class Bird{
    abstract void Fly();
    abstract void Sound();
}
class Eagle extends Bird{
    void Fly(){
        System.out.println("Eagle Flying high in the sky");
    }
    void Sound(){
        System.out.println("Eagle: Screech! Screech");
    }
}

 class Hawk extends Bird{

    void Fly(){
        System.out.println("Hawk Soaring through the air");
    }

    void Sound(){
        System.out.println("Hawk: Squawk! Squawk");
    }

 }   
public class BirdAbstract {
    public static void main(String[] args) {
        
        Eagle e1 = new  Eagle();
        e1.Fly();
        e1.Sound();

        Hawk h1 = new Hawk();
        h1.Fly();
        h1.Sound();

    }
    
}
