import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static int cmmdc(int a, int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }

    public static void fibo(int n){
        if(n<=2){
            for(int i=0;i<n;i++){
                System.out.print(1+" ");
            }
        }
        int x1=1,x2=1;
        System.out.print(x1+" "+x2+" ");
        for(int i=0;i<n-2;i++){
            int aux = x2;
            x2 = x1+x2;
            x1=aux;
            System.out.print(x2+ " ");
        }
    }

    //fibo(n) = fibo(n-1) + fibo(n-2)
    public static int fiboRec(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            //System.out.print(1+ " ");
            return 1;
        }
        else {
            int x =  fiboRec(n-1) + fiboRec(n-2);
           //System.out.print(x+ " ");
            return  x;
        }
    }

    public static void afiseazaFibo(int n){
        if(n==0){
            return;
        }
        else {
            afiseazaFibo(n-2);
            System.out.println("Fibo 3: " + fiboRec(n));
        }
    }
    //fiboRec(10)
    // fiboRec(9) + fiboRec(8)
    // fiboRec(8) + fiboRec(7) + fiboRec(7) + fiboRec(6)

    public static void main(String[] args) {

        afiseazaFibo(10);
        /*

        LocalDateTime x = LocalDateTime.of(2022,2,23, 20,28 );
        System.out.println(x.toLocalDate());

        System.out.println("START");
        //20:21:56
        var start = LocalDateTime.now();

        var now = LocalDateTime.now();
        //20:22:00
        while(now.getSecond()-start.getSecond() != 5){
            now = LocalDateTime.now();
        }


        while(ChronoUnit.SECONDS.between(start,now) != 5){
            now = LocalDateTime.now();
        }
        System.out.println("STOP");

        */

        /*
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Introduceti numere de la tastatura pana ghiciti valoarea aleasa de program. (Introduceti -1 pentru a iesi)");
        // returneaza valoare in intervalul [0-99]
        int x = rand.nextInt(100);

        int citire = scanner.nextInt();

        int ct = 0;

        while(citire != x && citire != -1){
            if(citire > x){
                System.out.println("Mai mic!");
            }
            else if(citire < x){
                System.out.println("Mai mare!");
            }
            citire = scanner.nextInt();
            ct++;
        }
        if(citire != -1)
            System.out.printf("Bravo ba! Scor: %d", ct);
        else
            System.out.println("Naspa ba!");
        */

        /*

        int x,y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        //System.out.printf("Numerele sunt %d si %d", x,y);

        System.out.printf("CMMDC al numerelor %d si %d este: %d ", x,y, cmmdc(x,y));

        for(var x : args){
            System.out.println(x);
        }
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();
        System.out.printf("Valoarea introdusa de la tastatura este: %d\n", val);

        int x;
        char y;
        double z;
        boolean cond = true;
        if(true){

        }
        else if(false) {

        }

        while(cond){

        }

        do{

        }while(cond);

        for(int i=0;i<5;i++){

        }

        double[] array = {1,2,3,4,5,6,7,8};


        //for i in array
        for (double i : array) {
            System.out.println(i);
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


        List<Integer> listaInts = new ArrayList<>();
        Integer nr = 3;
        listaInts.add(5);
        listaInts.add(7);
        listaInts.add(3);
        listaInts.add(4);
        listaInts.add(2);

        for(var i : listaInts){
            System.out.printf("Integer: %d\n", i);
        }

        System.out.println("\n");

        //Crescator
        Collections.sort(listaInts);

        //Descrescator
        Collections.sort(listaInts, Collections.reverseOrder());
        listaInts.sort(Collections.reverseOrder());

        for(var i : listaInts){
            System.out.printf("Integer: %d\n", i);
        }
        String nume = "Radu";
        String nume2 = "radu";
*/

    }
}
