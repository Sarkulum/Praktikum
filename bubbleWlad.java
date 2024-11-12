import java.util.ArrayList;

public class bubbleWlad{

    public static void bubbleSorting(ArrayList<Integer> arr){ //(ArrayList<Integer> arr) ist die Input Methode
        for(int i = 0; i < arr.size()-1; i++){ //Da der erste durchlauf bei 0 passiert und es exakt so oft laufen soll wie die Anzahl an Zahlen in dem Array, rechnen wir die .size des Arrys -1
            for(int j = 0; j < arr.size()-i - 1; j++){ //Das selbe nochmal hier. Aber da nach dem ersten durchlauf die größte Zahl schon am ende der Liste ist rechnen wir -i weil i immer der anzahl der bereits geordneten Zahlen enspricht.
                if(arr.get(j) > arr.get(j+1)){ //Wenn die Zahl an Arryposition j größer ist als die an Arryposition j+1 wird das Statment ausgeführt.
                    int temp = arr.get(j); //Wir müssen die Zahl an Arryposition j kurz zwischenspeichern da wir diese gleich überschreiben.
                    arr.set(j, arr.get(j+1)); //Wir überschreiben Arrayposition j mit der Zahl in Arryposition j+1.
                    arr.set(j+1, temp); //Wir überschreiben Arrayposition j+1 mit der zwischengespeicherten Zahl von Arryposition j.
                }
            }
        }
        System.out.println(arr); //Die sortierte Arraylist wird gedruckt.
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(); //bubbleSorting achszeptiert nur Arraylisten als eingabe. Deswegen müssen wir diese kurz erstellen.
        arr.add(6);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(0);
        arr.add(9);
        arr.add(7);
        arr.add(8);

        bubbleSorting(arr); //Wir rufen bubbleSorting auf, mit dem Input der Integer Arraylist namens arr.
    }
}