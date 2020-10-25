public class StudentToString {

    public static void main(String[] args) {

        System.out.println("Jak nie nadpiszemy metody toString() do da nam obiekt@hashCode");
        ToStringNonOverride sNonOver1 = new ToStringNonOverride(11,"Tomek0","Lodz");
        ToStringNonOverride sNonOver2 = new ToStringNonOverride(123,"Mietek","Warszawa");
        System.out.println(sNonOver1);
        System.out.println(sNonOver2);
        System.out.println();


        System.out.println("Jak nadpiszemy toString() to mamy obiekt poprawnie wyświetlony");
        ToStringOverride sover1=new ToStringOverride(10,"Tomek","Lodz");
        ToStringOverride sover2=new ToStringOverride(1,"Romek","Warszawa");
        System.out.println(sover1);
        System.out.println(sover2);
    }
}
