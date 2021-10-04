package Aula13.ATP19;

public class Numbers {
    public static void main(String[] args) {

        int [] num = new int[10];

       int n1 = num[0] = 1;
       int n2 = num[1] = 2;
       int n3 = num[2] = 3;
       int n4 = num[3] = 4;
       int n5 =  num[4] = 5;
       int n6 = num[5] = 6;
       int n7 = num[6] = 7;
       int n8 = num[7] = 8;
       int n9 = num[8] = 9;
       int n10 = num[9] = 10;

        System.out.println(n1 + "|" + n2 + "|" + n3 + "|" + n4 + "|" + n5 + "|" + n6 + "|" + n7 + "|" + n8 + "|" + n9 + "|" + n10);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Impresso com fori :  " + num[i]);

        }

    }
}
