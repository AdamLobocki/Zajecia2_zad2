public class Drinki {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.nazwa = "Drink owocowy";
        drink1.cena = 5;  
        drink1.alkohol = false;
        drink1.skladnik1 = new Skladniki();
        drink1.skladnik1.nazwa = "sok kokosowy";
        drink1.skladnik1.ilosc = 100;
        drink1.skladnik2 = new Skladniki();
        drink1.skladnik2.nazwa = "sok z ananasa";
        drink1.skladnik2.ilosc = 250;
        drink1.skladnik3 = new Skladniki();
        drink1.skladnik3.nazwa = "sok pomaranczowy";
        drink1.skladnik3.ilosc = 85;

        double objetosc;
        objetosc = drink1.skladnik1.ilosc + drink1.skladnik2.ilosc + drink1.skladnik3.ilosc;

        System.out.println(drink1.nazwa);
        System.out.println(drink1.cena + "zł");
        System.out.println("Alkoholowy " + drink1.alkohol);
        System.out.println("Składniki:");
        System.out.println(drink1.skladnik1.nazwa +" "+ drink1.skladnik1.ilosc + " ml");
        System.out.println(drink1.skladnik2.nazwa +" "+ drink1.skladnik2.ilosc + " ml");
        System.out.println(drink1.skladnik3.nazwa +" "+ drink1.skladnik3.ilosc + " ml");
        System.out.println("Objętość drinka:" + objetosc + " ml");


    }


}
