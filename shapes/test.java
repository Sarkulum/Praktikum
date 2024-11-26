package shapes;

public class test {
    public static void main(String[] args) {
        int seitenLänge = 6;
        //höhe
        for (int y = 1; y <= seitenLänge; y++) {
            //breite
            int höhe = y;
            int höhe2 = y;
            String output = "";
            for (int x = 1; x <= seitenLänge; x++) {
                while (höhe < seitenLänge){
                    output += " ";
                    höhe++;
                }
                while (höhe2 > 0){
                    output += "*";
                    höhe2--;
                }
            }
            System.out.println(output);
        }
    }
}

/*
  *
 **
***

***
**
*
 */
