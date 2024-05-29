package composite;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("l1",5, 200);
        Libro l2 = new Libro("l2",6, 300);
        Libro l3 = new Libro("l3",7, 200);
        Libro l4 = new Libro("l4",8, 150);
        Libro l5 = new Libro("l5",9, 200);
        Libro l6 = new Libro("l6",10, 250);
        Libro l7 = new Libro("l7",11, 400);
        Libro l8 = new Libro("l8",12, 200);
        Libro l9 = new Libro("l9",13, 150);
        Libro l10 = new Libro("l10",14, 200);

        Scatolo scatolo1 = new Scatolo("scatolo1");
        Scatolo scatolo2 = new Scatolo("scatolo2");
        Scatolo scatolo3 = new Scatolo("scatolo3");
        Scatolo scatolo4 = new Scatolo("scatolo4");

        scatolo4.add(l1);
        scatolo4.add(l2);
        scatolo4.add(l3);

        scatolo3.add(l4);
        scatolo3.add(l5);
        scatolo3.add(l6);

        scatolo2.add(l7);
        scatolo2.add(l8);
        scatolo2.add(l9);

        scatolo1.add(l10);
        scatolo1.add(scatolo2);
        scatolo1.add(scatolo3);
        scatolo1.add(scatolo4);

        System.out.println(scatolo1.getPrezzo());
        System.out.println(scatolo1.getPeso());

    }
}
