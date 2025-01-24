
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);

        //card.eatAffordably();
        //System.out.println(card);

        //card.eatHeartily();
        //card.eatAffordably();
        //System.out.println(card);

        //card.eatHeartily();
        //System.out.println(card);

//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(200);
//        System.out.println(card);

        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);


        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
