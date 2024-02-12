
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic
{

    @Override
    public void greengo() 
    {
       
        System.out.println("green go implementation");
    }

    @Override
    public void redstop() 
    {
        
        System.out.println("red stop implementation");
    }

    @Override
    public void flashingyellow() 
    {
        
        System.out.println("flashing yellow implementation");
    }

    public void walkOnSymbol()
    {
        System.out.println("walking on the symbol");
    }
    @Override
    public void trainSymbol() {
       System.out.println("Walk on the train symbol when signals turns to green");
    }

    public static void main(String[] args) 
    {

       // AustralianTraffic a = new AustralianTraffic();
        // The above line says that i have created new object of australianTraffic class and implementing methods in 
        //australianTraffic, when you're implementing the interface use the below line to create object.

        CentralTraffic a = new AustralianTraffic();
        // The above line says that, i have created an object of australianTraffic class to implements the methods present
        //in CentralTraffic interface.
        a.redstop();
        a.greengo();
        a.flashingyellow(); 
       // a.walkOnSymbol(); - this won't work since this method specific to AustralianTraffic class and it is not 
      //  present in centralTraffic interface.
        AustralianTraffic a1 = new AustralianTraffic();
        a1.walkOnSymbol();  
        // a.trainSymbol(); this won't work since this method doesn't belong to centralTraffic interface.

        ContinentalTraffic c10 = new AustralianTraffic();
        c10.trainSymbol();


        // Please do remember one class can also implement multiple interfaces, Please provide "," between interfaces.
        // Interfacess cannot be instantiated i.e. you can't create object of the interface.
    }

   
}
