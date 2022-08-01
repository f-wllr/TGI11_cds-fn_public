public class chaos {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 8, 4, -3, 9, 10, 3, -7};
        
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]); 
        }

        ausgabe(array);

        addition(array);
    }

    static void ausgabe(int[] pChaos){
        System.out.println(pChaos[3]);
        System.out.println(pChaos[6]);

    }

    static int addition(int[] pChaos){
        int ergebniss = pChaos[3] + pChaos[5];
        return ergebniss;

    }

    static void tausche(int[] pChaos){
        int tmp = pChaos[3];
        pChaos[3] = pChaos[7];
        pChaos[7] = tmp;

        for(int i = 0; i < pChaos.length; i++){
            System.out.println(pChaos[i]); 
        }
    }
}
