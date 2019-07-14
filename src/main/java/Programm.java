import java.util.Random;

public class Programm {

    public static void main(String[] args) {
        String[] names = {"Андрей", "Иван", "Петр", "Илья"};
        Random random = new Random(System.currentTimeMillis());
        Husband[] husbands = new Husband[10];
        for (int i = 0; i < husbands.length; i++) {
            int index = random.nextInt(names.length);
            String name = names[index];
            int iq = random.nextInt(120)+60;
            husbands[i] = new Husband(name, iq);
        }
        bubbleSort(husbands);
        for(Husband husband : husbands){
            System.out.println(husband);
        }
    }

    private static void bubbleSort(Husband[] husbands){ //сортировка пузырьком от большего к меньшему
        boolean isSorted = false;
        Husband buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < husbands.length-1; i++) {
                if(husbands[i].iq < husbands[i+1].iq){
                    isSorted = false;

                    buf = husbands[i];
                    husbands[i] = husbands[i+1];
                    husbands[i+1] = buf;
                }
            }
        }
    }

}
