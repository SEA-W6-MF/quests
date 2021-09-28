package aufgabe6_OOP;

public class Classroom {

    public static void main(String[] args) {
        Wilder michael = new Wilder("Michael", true);
        Wilder reinhard = new Wilder("Reinhard", false);
        Wilder vinzenz = new Wilder("Vinzenz", true);
        Wilder michaela = new Wilder("Michaela", false);
        Wilder zenzi = new Wilder("Kreszenzia", false);

        System.out.println(michael.whoAmI());
        System.out.println(reinhard.whoAmI());
        System.out.println(vinzenz.whoAmI());
        System.out.println(michaela.whoAmI());
        System.out.println(zenzi.whoAmI());
    }
}
