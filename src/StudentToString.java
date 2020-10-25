public class StudentToString {

    public static void main(String[] args) {

        System.out.println("Jak nie nadpiszemy metody toString() do da nam obiekt@hashCode");
        ToStringNonOverrite sNonOver1 = new ToStringNonOverrite(11,"Tomek0","Lodz");
        ToStringNonOverrite sNonOver2 = new ToStringNonOverrite(123,"Mietek","Warszawa");
        System.out.println(sNonOver1);
        System.out.println(sNonOver2);
        System.out.println();


        System.out.println("Jak nadpiszemy toString() to mamy obiekt poprawnie wyświetlony");
        ToStringOverrite sover1=new ToStringOverrite(10,"Tomek","Lodz");
        ToStringOverrite sover2=new ToStringOverrite(1,"Romek","Warszawa");
        System.out.println(sover1);
        System.out.println(sover2);
    }
}
