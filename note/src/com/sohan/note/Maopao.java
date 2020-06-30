package com.sohan.note;



public class Maopao {


    public static void main(String[] args) {
        int []  a = {25,24,12,76,101,96,28};
        for(int i = 0 ; i < a.length - 1 ; i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    int q = a[i];
                    a[i] = a[j];
                    a[j] = q;
                }
            }
        }

        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }

    }
}
