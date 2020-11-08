import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Currency object = new Currency();
        System.out.println("Currency Converter:");

        System.out.println("Choose the currency you would like to convert from: ");
        System.out.println("1. Dollars\n2. Euros\n3. Pesos\n4. Rupees(Indian)\n5. Yen(Japan)\n6. British Pounds\n7. Canadian Dollar\n8. Australian Dollar");
        int from = input.nextInt();
        System.out.println("Enter amount: ");
        float fromAmount = input.nextFloat();

        System.out.println("1. Dollars\n2. Euros\n3. Pesos\n4. Rupees(Indian)\n5. Yen(Japan)\n6. British Pounds\n7. Canadian Dollar\n8. Australian Dollar");

        if (from == 1) {
            System.out.println("Convert " + fromAmount + " " + object.getDollars() + " to: " );
        }
        else if (from == 2) {
            System.out.println("Convert " + fromAmount + " " + object.getEuros() + " to: " );
        }
        else if (from == 3) {
            System.out.println("Convert " + fromAmount + " " + object.getPesos() + " to: " );
        }
        else if (from == 4) {
            System.out.println("Convert " + fromAmount + " " + object.getRupees() + " to: " );
        }
        else if (from == 5) {
            System.out.println("Convert " + fromAmount + " " + object.getYen() + " to: " );
        }
        else if (from == 6) {
            System.out.println("Convert " + fromAmount + " " + object.getPounds() + " to: " );
        }
        else if (from == 7) {
            System.out.println("Convert " + fromAmount + " " + object.getCanadian() + " to: " );
        }
        else if (from == 8) {
            System.out.println("Convert " + fromAmount + " " + object.getAustralian() + " to: " );
        }
        int to = input.nextInt();

        if (from == 1 && to == 2) {
            System.out.println((object.dollartoeuro(fromAmount)) + " Euros");
        }
        else if (from == 1 && to == 3) {
            System.out.println((object.dollartopeso(fromAmount)) + " Pesos (Mexican)");
        }
        else if (from == 1 && to == 4) {
            System.out.println(object.dollartorupees(fromAmount) + " Rupees (Indian)");
        }
        else if (from == 1 && to == 5) {
            System.out.println(object.dollartoyen(fromAmount) + " Yen (Japanese)");
        }
        else if (from == 1 && to == 6) {
            System.out.println(object.dollartopound(fromAmount) + " Pounds (British)");
        }
        else if (from == 1 && to == 7) {
            System.out.println(object.dollartocanadian(fromAmount) + " Canadian dollars");
        }
        else if (from == 1 && to == 8) {
            System.out.println(object.dollartoaustralian(fromAmount) + " Australian dollars");
        }
        else if (from == 2 && to == 1) {
            System.out.println(object.eurotodollar(fromAmount) + " US dollars");
        }
        else if (from == 2 && to == 3) {
            System.out.println(object.eurotopeso(fromAmount) + " Pesos (Mexican)");
        }
        else if (from == 2 && to == 4) {
            System.out.println(object.eurotorupee(fromAmount) + " Rupees (Indian)");
        }
        else if (from == 2 && to == 5) {
            System.out.println(object.eurotoyen(fromAmount) + " Yen (Japanese)");
        }
        else if (from == 2 && to == 6) {
            System.out.println(object.eurotopound(fromAmount) + " Pounds (British)");
        }
        else if (from == 2 && to == 7) {
            System.out.println(object.eurotocanadian(fromAmount) + " Canadian dollars");
        }
        else if (from == 2 && to == 8) {
            System.out.println(object.eurotoaustralian(fromAmount) + " Australian dollars");
        }
        else if (from == 3 && to == 1) {
            System.out.println(object.pesotodollar(fromAmount) + " US dollars");
        }
        else if (from == 3 && to == 2) {
            System.out.println(object.pesotoeuro(fromAmount) + " Euros");
        }
        else if (from == 3 && to == 4) {
            System.out.println(object.pesotorupee(fromAmount) + " Rupees (Indian)");
        }
        else if (from == 3 && to == 5) {
            System.out.println(object.pesotoyen(fromAmount) + " Yen (Japanese)");
        }
        else if (from == 3 && to == 6) {
            System.out.println(object.pesotopound(fromAmount) + " Pounds (British)");
        }
        else if (from == 3 && to == 7) {
            System.out.println(object.pesotocanadian(fromAmount) + " Canadian dollars");
        }
        else if (from == 3 && to == 8) {
            System.out.println(object.pesotoaustralian(fromAmount) + " Australian dollars");
        }
        else if (from == 4 && to == 1) {
            System.out.println(object.rupeestodollar(fromAmount) + " US dollars");
        }
        else if (from == 4 && to == 2) {
            System.out.println(object.rupeestoeuro(fromAmount) + " Euros");
        }
        else if (from == 4 && to == 3) {
            System.out.println(object.rupeestopesos(fromAmount) + " Pesos (Mexican)");
        }
        else if (from == 4 && to == 5) {
            System.out.println(object.rupeestoyen(fromAmount) + " Yen (Japanese)");
        }
        else if (from == 4 && to == 6) {
            System.out.println(object.rupeestopounds(fromAmount) + " Pounds (British)");
        }
        else if (from == 4 && to == 7) {
            System.out.println(object.rupeestocanadian(fromAmount) + " Canadian dollars");
        }
        else if (from == 4 && to == 8) {
            System.out.println(object.rupeestoaustralian(fromAmount) + " Australian dollars");
        }
        else if (from == 5 && to == 1) {System.out.println(object.yentodollar(fromAmount) + " US dollars");}
        else if (from == 5 && to == 2) {System.out.println(object.yentoeuro(fromAmount) + " Euros");}
        else if (from == 5 && to == 3) {System.out.println(object.yentopeso(fromAmount) + " Pesos (Mexican)");}
        else if (from == 5 && to == 4) {System.out.println(object.yentorupees(fromAmount) + " Rupees (Indian)");}
        else if (from == 5 && to == 6) {System.out.println(object.yentopounds(fromAmount) + " Pounds (British)");}
        else if (from == 5 && to == 7) {System.out.println(object.yentocanadian(fromAmount) + " Canadian dollars");}
        else if (from == 5 && to == 8) {System.out.println(object.yentoaustralian(fromAmount) + " Australian dollars");}

        else if (from == 6 && to == 1) {System.out.println(object.poundstodollars(fromAmount) + " US dollars");}
        else if (from == 6 && to == 2) {System.out.println(object.poundstoeuros(fromAmount) + " Euros");}
        else if (from == 6 && to == 3) {System.out.println(object.poundstopesos(fromAmount) + " Pesos (Mexican)");}
        else if (from == 6 && to == 4) {System.out.println(object.poundstorupees(fromAmount) + " Rupees (Indian)");}
        else if (from == 6 && to == 5) {System.out.println(object.poundstoyen(fromAmount) + " Yen (Japanese)");}
        else if (from == 6 && to == 7) {System.out.println(object.poundstocanadian(fromAmount) + " Canadian dollars");}
        else if (from == 6 && to == 8) {System.out.println(object.poundstoaustralian(fromAmount) + " Australian dollars");}

        else if (from == 7 && to == 1) {System.out.println(object.canadiantodollar(fromAmount) + " US dollars");}
        else if (from == 7 && to == 2) {System.out.println(object.canadiantoeuro(fromAmount) + " Euros");}
        else if (from == 7 && to == 3) {System.out.println(object.canadiantopesos(fromAmount) + " Pesos (Mexican)");}
        else if (from == 7 && to == 4) {System.out.println(object.canadiantorupees(fromAmount) + " Rupees (Indian)");}
        else if (from == 7 && to == 5) {System.out.println(object.canadiantoyen(fromAmount) + " Yen (Japanese)");}
        else if (from == 7 && to == 6) {System.out.println(object.canadiantopounds(fromAmount) + " Pounds (British)");}
        else if (from == 7 && to == 8) {System.out.println(object.canadiantoaustralian(fromAmount) + " Australian dollars");}

        else if (from == 8 && to == 1) {System.out.println(object.australiantodollar(fromAmount) + " US dollars");}
        else if (from == 8 && to == 2) {System.out.println(object.australiantoeuro(fromAmount) + " Euros");}
        else if (from == 8 && to == 3) {System.out.println(object.australiantopeso(fromAmount) + " Pesos (Mexican)");}
        else if (from == 8 && to == 4) {System.out.println(object.australiantorupee(fromAmount) + " Rupees (Indian)");}
        else if (from == 8 && to == 5) {System.out.println(object.australiantoyen(fromAmount) + " Yen (Japanese)");}
        else if (from == 8 && to == 6) {System.out.println(object.australiantopounds(fromAmount) + " Pounds (British)");}
        else if (from == 8 && to == 7) {System.out.println(object.australiantocanadian(fromAmount) + " Canadian dollars");}


        else {
            System.out.println("Amount: \n" + fromAmount);
        }







    }
}
