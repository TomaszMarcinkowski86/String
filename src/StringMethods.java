import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println("Write the sentence:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        System.out.println("Wybierz nr metody clasy String by sprawdzić jej działanie:");

        System.out.println("1. charAt()\n2. compareTo()\n3. concat()\n4. contains()\n5. endsWith()\n" +
                "6. startWith()\n7. equals() \n8. equalsIgnoreCase()\n9. getBytes()\n10. getChar()\n11. indexOf()\n" +
                "12.intern()\n13.isEmpty()\n14. join()\n15.lastIndexOf()\n16. length()\n17.replace()\n" +
                "18. replaceAll()\n19. split()\n20. format() \n21. substring()\n22. toCharArray()\n " +
                "23. toLowerCase\n24. toUpperCase\n25. trim()\n26. valueOf()");
        String methodNb = scanner.nextLine();

        switch (methodNb) {
            case "1":
                System.out.println("charAt() - zwraca char o podanym indeksie: ");
                System.out.println("Podaj nr indeksu");
                int number = scanner.nextInt();
                System.out.println(str.charAt(number));
                break;
            case "2":
                System.out.println("coparteTo() - porównuje string z innym\n" +
                        "wynikiem liczba ujemna, zero lub dodatnia");
                System.out.println("Podaj String do porównania:");
                String str2 = scanner.nextLine();
                System.out.println(str.compareTo(str2));
                break;
            case "3":
                System.out.println("concat() - łączy 2 Stringi ");
                System.out.println("Podaj String do połączenia:");
                String str3 = scanner.nextLine();
                System.out.println(str.concat(str3));
                break;
            case "4":
                System.out.println("contains() - sprawdza czy sekwencja zawiera się w stringu ");
                System.out.println("Podaj sekwencje do sprawdzenia:");
                String str4 = scanner.nextLine();
                System.out.println(str.contains(str4));
                break;
            case "5":
                System.out.println("endsWith() - sprawdza czy sekwencja kończy się na\n" +
                        "podany suffix:");
                System.out.println("Podaj suffix do sprawdzenia:");
                String str5 = scanner.nextLine();
                System.out.println(str.endsWith(str5));
                break;
            case "6":
                System.out.println("startsWith() - sprawdza czy sekwencja zaczyna się\n" +
                        "podanym prefixem:");
                System.out.println("Podaj prefix do sprawdzenia:");
                String str6 = scanner.nextLine();
                System.out.println(str.startsWith(str6));
                break;
            case "7":
                System.out.println("equals() - Porównuje 2 stringi ze sobą - zalecana metoda");
                System.out.println("Podaj String do porównania:");
                String str7 = scanner.nextLine();
                System.out.println(str.equals(str7));
                break;
            case "8":
                System.out.println("equalsIgnoreCase() - Porównuje 2 stringi ze sobą nie uwzględnia wielkości liter");
                System.out.println("Podaj String do porównania:");
                String str8 = scanner.nextLine();
                System.out.println(str.equalsIgnoreCase(str8));
                break;
            case "9":
                System.out.println("getBytes() - Zwraca tablicę bajtów");
                System.out.println(str.getBytes());
                byte[] barr = str.getBytes();
                for (int i = 0; i < barr.length; i++) {
                    System.out.println(barr[i]);
                }
                // Getting string back
                String s2 = new String(barr);
                System.out.println("Getting String back: " + s2);
                break;
            case "10":
                System.out.println("getChar() - Zwraca tablicę charów");
                char[] ch = new char[30];
                try {
                    str.getChars(6, 16, ch, 0);
                    System.out.println(ch);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;
            case "11":
                System.out.println("indexOf() - ma kilka sygnatur użycia");
                System.out.println("Wybierz co chcesz zrobić");
                System.out.println("1.indexOf(int ch)\n2.indexOf(int ch int fromIndex)\n" +
                        "3.indexOf(String substring)\n4.indexOf(String substring, int indexFrom");
                String s3 = scanner.nextLine();
                switch (s3) {
                    case "1":
                        System.out.println("Podaj nr indexu");
                        int nr = scanner.nextInt();
                        if (nr > str.length()) {
                            System.out.println("Index poza zakresem");
                        } else
                            System.out.println(str.indexOf(nr));
                        break;
                    case "2":
                        System.out.println("Podaj nr indexu");
                        int nr2 = scanner.nextInt();
                        if (nr2 > str.length()) {
                            System.out.println("Index poza zakresem");
                        } else {
                            System.out.println("Podaj indexFrom");
                            int indexFrom = scanner.nextInt();
                            if (indexFrom > str.length()) {
                                System.out.println("IndexFrom poza zakresem");
                            } else
                                System.out.println(str.indexOf(nr2, indexFrom));
                        }
                        break;
                    case "3":
                        System.out.println("Podaj substring do sprawdzenia");
                        String subStr = scanner.nextLine();
                        System.out.println(str.indexOf(subStr));
                        break;
                    case "4":
                        System.out.println();
                        System.out.println("Podaj substring do sprawdzenia");
                        String subStr2 = scanner.nextLine();
                        System.out.println("Podaj indexFrom");
                        int indexFrom2 = scanner.nextInt();
                        if (indexFrom2 > str.length()) {
                            System.out.println("indexFrom poza zakresem");
                        } else {
                            System.out.println(str.indexOf(subStr2, indexFrom2));
                        }
                        break;
                }
            case "12":
                System.out.println("intern() - jak mamy stringa w poolu i utworzonego słówkiem new\n" +
                        "to intern będzie refereował do tego w poolu mimo że wskażemy na tego z new" +
                        "String s1 = new String(\"hello\");\n String s2 = \"hello\";\n" +
                        "String s3=s1.intern();\ns1==s2 - false\ns2===3 - true bo ");
                break;
            case "13":
                System.out.println("isEmpty() - sprawdza czy długość = 0 i zwraca boolean");
                System.out.println(str.isEmpty());
                break;
            case "14":
                System.out.println("join() - weszło w 8, łączy sekwencje oddzielone przecinkiem");
                System.out.println("String joinString1=String.join(\"-\",\"welcome\",\"to\",\"javatpoint\")");
                String joinString1 = String.join("-", "welcome", "to", "javatpoint");
                System.out.println(joinString1);
                break;
            case "15":
                System.out.println("lastIndexOf - podobnie jak w indexOf kilka sygnatur nie bedziemy\n" +
                        "rozpatrywać wszystkich, zwraca index ostatniego chara dla podanej wartości lub\n" +
                        "substring lub -1 gdzy nie znajdzie");
                System.out.println(str.lastIndexOf(3));
                System.out.println(str.lastIndexOf(3, 5));
                System.out.println(str.lastIndexOf("java"));
                System.out.println(str.lastIndexOf("ja", 5));
                System.out.println(str.lastIndexOf("ja", 25));
                break;
            case "16":
                System.out.println("length() - zwraca długość str");
                System.out.println(" dl stringa: " + str.length());
                break;
            case "17":
                System.out.println("replace() - od 5 zastępuje char' 'lub charSequene\"\" nowym ");
                String newString = str.replace('a', 'c');
                String newString2 = str.replace("a", "newCharSeq");
                System.out.println(newString);
                System.out.println(newString2);
                break;
            case "18":
                System.out.println("replaceAll() - podobnie jak replace ale tu mozemy użyć regexa\n" +
                        "replaceAll(String regex, String replacement)");
                System.out.println("usuniemy spacje i cyfry");
                System.out.println(str.replaceAll("\\s", ""));
                System.out.println(str.replaceAll("\\d", ""));
                break;
            case "19":
                System.out.println("split() - dzieli po podanym regexie i zwraca tablicę może być z limitem ");
                String[] tab = str.split("\\s");
                System.out.println("tablica po każdej spacji");
                for (String s : tab) {
                    System.out.println(s);
                }
                String[] tab2 = str.split("\\s", 3);
                System.out.println("tablica do 3 spacji");
                for (String s : tab2) {
                    System.out.println(s);
                }
                String[] tab3 = str.split("a", 3);
                System.out.println("tablica każdym do trzeciego \"a\"");
                for (String s : tab3) {
                    System.out.println(s);
                }
                break;
            case "20":
                System.out.println("format() - formatuje stringa podstawiając za typ z tabeli coś co wpiszemy\n" +
                        "typów sporo: %a-%h, %n, %o, %s, %t, %x ");
                String name = "Tomek";
                int jakisint = 10;
                float jakisFloat = 34.203f;
                System.out.println(String.format("my name is %s", name));
                System.out.println(String.format("jakisInt is %d", jakisint));
                System.out.println(String.format("jakisInt is %d", 50));
                System.out.println(String.format("jakisFloat is %f", jakisFloat));
                System.out.println(String.format("jakisFloat z 5 miejscami po przecinku is %f34.10", 34.555));
                System.out.println(String.format("jakaś wratość w sys 16 z inta is %x", jakisint));
                System.out.println(String.format("Prawa strona:rezerwacja 10 znaków na inta |%10d|", jakisint));
                System.out.println(String.format("Lewa Strona rezerwacja 10 znaków na inta |%-10d|", jakisint));
                System.out.println(String.format(" Wypełnienie 0 |%010d|", jakisint));
                System.out.println(String.format(" jedna spacja  |% d|", jakisint));
                System.out.println(String.format(" rezerwacja dla Stringa a  |%10s|", name));
                break;
            case "21":
                System.out.println("substring() - tworzy string od indexu do indexu lub tylko od indeksu");
                System.out.println("str.substring(0,5)" + str.substring(0, 5));
                System.out.println("str.substring(3)" + str.substring(3));
                break;
            case "22":
                System.out.println("toCharArray() - konvertuje str na tablice znaków");
                char[] charArray = str.toCharArray();
                int len = charArray.length;
                System.out.println("Char Array length: " + len);
                System.out.println("Char Array elements: ");
                for (int i = 0; i < len; i++) {
                    System.out.println(charArray[i]);
                }
                break;
            case"23":
                System.out.println("toLowerCase() - zmienia duże litery na małe");
                System.out.println(str.toLowerCase());
                break;
            case"24":
                System.out.println("toUpperCase() - zmienia małe litery na duże");
                System.out.println(str.toUpperCase());
                break;
            case "25":
                System.out.println("trim() - eliminuje spacje na początku i końcu stringa ");
                System.out.println("String przed trim(): "+ str);
                System.out.println("String po trim():" + str.trim());
                break;
            case "26":
                System.out.println("valueOf() - konwertuje typy proste, obiekty i charArray do stringa");
                boolean b1=true;
                byte b2=11;
                short sh = 12;
                int i = 13;
                long l = 14L;
                float f = 15.5f;
                double d = 16.5d;
                char chr[]={'j','a','v','a'};
                StringMethods obj=new StringMethods();
                System.out.println(String.valueOf(b1));
                System.out.println(String.valueOf(b2));
                System.out.println(String.valueOf(sh));
                System.out.println(String.valueOf(i));
                System.out.println(String.valueOf(l));
                System.out.println(String.valueOf(f));
                System.out.println(String.valueOf(d));
                System.out.println(String.valueOf(chr));
                System.out.println(String.valueOf(obj));
                break;
        }
    }
}
