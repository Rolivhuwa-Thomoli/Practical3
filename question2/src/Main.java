//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        country Mexico = new country(114000000,1.01);
        country UnitedStates = new country(312000000,0.15);
        while (Mexico.getN()< UnitedStates.getN()) {
            System.out.println("Population of Mexico: "+Mexico.getN()+ " Population of United States: "+ UnitedStates.getN());
            Mexico.next_year();
            UnitedStates.next_year();
        }
    }
}