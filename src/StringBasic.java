public class StringBasic {

    public static void main(String[] args) {

        // String reprezentuje tablicę charów

        System.out.println("implementacja interfejsu CharSequence");
        char[] ch = {'j', 'a', 'v', 'a', ' ', 'b', 'a', 's', 'i', 'c'};
        String s = new String(ch);
        //to samo co
        String s2= "java basic";
        System.out.println(s);
        System.out.println();

        /**String implementuje 3 interfejsy :
         * Comparable
         * Serializable
         * CharSequence
         *
         * CharSequence implementują jeszcze 2 inne klasy:
         * StringBuffer i StringBuilder
         */

        //immutable
        System.out.println("Niezmienność stringa");
        String a ="Java";
        a.concat(" Basic");
        System.out.println(a);
        System.out.println();
        /**
         * mimo że mamy concat który powinin łaczyć stringi wyświetlenie a daje wynik Java
         * to udowadnia że string jest niezmienny
         */
        a = a.concat(" Basic"); // wyrażne przypisanie do zmiennej i to bedzie refererować do innego obiektu
        System.out.println(a);
        System.out.println();

        /**
         * Powrównywanie stringów
         */
        String a1 = "Java";
        String b1 = "Java";
        String c1 = new String("Java");
        String d1 = "Basic";
        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);
        System.out.println("c1 = "+c1);
        System.out.println("d1 = "+d1);
        System.out.println("Porównanie przy pomocy equals");
        System.out.println("a1.equals(b1) = "+ a1.equals(b1));
        System.out.println("a1.equals(c1) = "+ a1.equals(c1));
        System.out.println("a1.equals(d1) = "+ a1.equals(d1));
        System.out.println("Porównanie przy pomocy ==");
        System.out.println(a1==b1);
        System.out.println(a1==c1);
        System.out.println(a1==d1);
        System.out.println("porównanie przy pomocy CompareTo");
        System.out.println(a1.compareTo(b1));
        System.out.println(a1.compareTo(c1));
        System.out.println(d1.compareTo(a1));
        System.out.println(a1.compareTo(d1));
        System.out.println();
        /**
         * String substring
         */

        System.out.println("Substring");
        String str= "jakiś przykładowy tekst";
        String str2 = str.substring(0,5);
        String str3 = str.substring(15);
        System.out.println("str.substring(0,5) " + str2);
        System.out.println("str.substring(15) " +str3);
        System.out.println();

        /**
         * StringBuffer - służy do tworzenia stringa mutable i synchronize (bezpieczny wieleowoątkowo)
         * Mamy 3 construktory:
         * StringBuffer() - tworzy pusty string buffer o pojemnści 16
         * StringBuffer(String s) tworzy stringBuffer ze stringa
         * StringBuffer(int capacity) tworzy pusty string buffer o podanej pojemnści
         *
         */

        System.out.println("StringBuffer - append()");
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);
        System.out.println("StringBuffer - insert()");
        sb.insert(5, " fucking");
        System.out.println(sb);
        System.out.println("StringBuffer - replace");
        sb.replace(6,13,"jebana");
        System.out.println(sb);
        System.out.println("StringBuffer - delete");
        sb.delete(6,13);
        System.out.println(sb);
        System.out.println("StringBuffer - reverse");
        sb.reverse();
        System.out.println(sb);
        System.out.println("StringBuffer - capacity");
        System.out.println(sb.capacity());
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
        System.out.println();

        /**
         * StringBuilder od javy 1.5 - służy do tworzenia stringa mutable i nonsynchronize
         * Mamy 3 construktory:
         * StringBuilder() - tworzy pusty string buffer o pojemnści 16
         * StringBuilder(String s) tworzy stringBuffer ze stringa
         * StringBuilder(int length) tworzy pusty string buffer o podanej pojemnści
         *
         */
        System.out.println("StringBuilder ");
        StringBuilder sb2= new StringBuilder("Hello");
        System.out.println("metody jak w StringBuffer:" +
                "append, insert, replace, reverse delete, capacity");
        sb2.append(" Java");
        System.out.println(sb2);
        System.out.println( );

        /**
         * String vs StringBuffer
         */

        System.out.println("String vs StringBuffer  - szybkość" );
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("czas lączenia Stringa: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("czas lączenia StringBuffera "+(System.currentTimeMillis()-startTime)+"ms");
        System.out.println("StringBuffer szybszy");
        System.out.println();
        System.out.println("Test hashCode po konkatenacji - String przed i po inny");
        String conS="Java";
        System.out.println(conS.hashCode());
        conS=conS.concat("Hello");
        System.out.println(conS.hashCode());
        System.out.println("Test hashCode po konkatenacji - StringBugffer tu bedzie ten sam");
        StringBuffer conSB=new StringBuffer("Java");
        System.out.println(conSB.hashCode());
        conSB=conSB.append("Hello");
        System.out.println(conSB.hashCode());
        System.out.println();

        System.out.println("StringBuffer vs StringBuilder");
        System.out.println("mniej wydajny vs szybszy");
        System.out.println("bezpieczny wielowątkowo vs niebezpieczny wieleoatkowo");



    }
    public static String concatWithString(){
        String s = "java ";
        for(int i =1; i<10000; i++){
            s=s+"hello";
        }
        return s;
    }
    public static String concatWithStringBuffer(){
        StringBuilder s = new StringBuilder("java ");
        for(int i =1; i<10000; i++){
            s.append("hello");
        }
        return s.toString();
    }

}
