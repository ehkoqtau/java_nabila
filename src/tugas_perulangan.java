/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabila Sukma Abadi
 */

class soal1 {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) { //baris kebawah dimulai dari i (1) tidak melebihi dari 3 baris
            for(int j=1; j<=7; j++) { //angka ke kanan dimulai dari j (1) tidak melebihi dari 7
                System.out.print(j); //angka akan menghasilkan 1234567
            }
            System.out.println();
        }
    }
}

class soal2 {
    public static void main(String[] args) {
    
        for (int i=1; i<=3; i++) {
            for(int j=1; j <= 5; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}

class soal3 {
    public static void main(String[] args) {
    
        for (int i=1; i<=3; i++) {
            for(int j=1; j <= 3; j++) {
                if(i == 2) {
                    if (j == 2) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}

class soal4 {
    public static void main(String[] args) {
    
        for (int i=1; i<=3; i++) {
            for(int j=3; j>=i; j--) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}

class soal5 {
    public static void main(String[] args){
    
        for (int i=1; i<=3; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}