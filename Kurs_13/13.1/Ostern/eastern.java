
/**
 * @author Kellerkind
 * @author Barthyr
 */
public class eastern {

  public int a, b, c, d, e, f, g, h, i, j, k, l;
  public int x, mon, tag;
  public int jahr;  

    /**
     * ist eigentlich kömpletter Blödsinn, aber wenn ihr es so wollt.
     */
    public eastern() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.x = 0;
        this.mon = 0;
        this.tag = 0;
        this.jahr = 0;
    }

    public String calc(String arguments) {
        /**
         * Ach nochwas. Die "arguments" sind Strings weil sie aus dem args
         * kommen
         */
        

        // haben wir einen Wert bekommen?
        if (arguments.length() == 0) {
            System.out.println("Jahreszahl angeben!");
            System.exit(1);
        }

        // ist der übergebene Wert eine Zahl?
        try {
            jahr = Integer.parseInt(arguments);
        } catch (java.lang.NumberFormatException e) {
            System.out.println(arguments
                    + "ist doch keine Jahreszahl!");
            System.exit(2);
        }

        // alles ok, wir rechnen! und geben aus ;) 
        /**
         * Exkurs Geschichte: Der Vatikan – “Geburtsort” des gregorianischen
         * Kalenders. Das Kalendersystem wurde 1582 von Papst Gregor XIII
         * eingeführt. Der gregorianische Kalender ist das international
         * anerkannte Kalendersystem, das oft auch als “Westlicher Kalender”
         * oder “Christlicher Kalender” bezeichnet wird.
         */
        if (jahr <= 1583) {   // julianisch
            a = jahr % 4;
            b = jahr % 7;
            c = jahr % 19;
            d = (19 * c + 15) % 30;
            e = (2 * a + 4 * b - d + 34) % 7;
            x = d + e + 114;
            mon = x / 31;
            tag = (x % 31) + 1;
        } else {   // gregorianisch
            a = jahr % 19;
            b = jahr / 100;
            c = jahr % 100;
            d = b / 4;
            e = b % 4;
            f = (b + 8) / 25;
            g = (b - f + 1) / 3;
            h = (19 * a + b - d - g + 15) % 30;
            i = c / 4;
            j = c % 4;
            k = (32 + 2 * e + 2 * i - h - j) % 7;
            l = (a + 11 * h + 22 * k) / 451;
            x = h + k - 7 * l + 114;
            mon = x / 31;
            tag = (x % 31) + 1;
        }

        /* Entschuldigung */
        return "Sonntag, den " + tag + ".0" + mon + "." + jahr;

    }
}
