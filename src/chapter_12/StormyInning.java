package chapter_12;

class BaseballException extends Exception{

}
class Foul extends BaseballException{

}
class Strike extends BaseballException{

}
abstract class Inning{
    public Inning() throws BaseballException{

    }
    public void event() throws BaseballException{
        //doesn't actually have a throw anything;
    }
    public abstract void atBat() throws Strike,Foul;
    public void walk(){} //throws no checked exceptions
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
interface Storm{
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
public class StormyInning extends Inning implements Storm{
    public StormyInning() throws RainedOut,BaseballException{

    }
    public StormyInning(String s) throws Foul,BaseballException{

    }
    //Regular methods must conform from the base class
    //!void walk() throws PopFoul{} //compile error
    //Interface CANNOT add exceptions to existing
    //methods from the base class
    //! public  void event() throws RainedOut{}
    //If the method doesn't already exist in the //base class,the exeption is OK
    public void rainHard() throws RainedOut{}
    //You can choose to not throw any exceptions
    //even if the base version does
    public void event(){}
    //Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul{}
    public static void main(String[] args){
        try{
            Inning i=new StormyInning();
            i.atBat();
        }catch(PopFoul e){
            System.out.println("Pop foul");
        }catch(RainedOut e){
            System.out.println("Rained out");
        }catch(BaseballException e){
            System.out.println("Generic baseball exception");
        }
        //Strike not thrown in derived version
        try{
            //What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
        }catch(Strike e){
            System.out.println("Strike");
        }catch(Foul e){
            System.out.println("Foul");
        }catch(RainedOut e){
            System.out.println("Rained out");
        }catch(BaseballException e){
            System.out.println("Generic baseball exception");
        }
    }
}
