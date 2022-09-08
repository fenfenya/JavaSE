package com.fenfen.struct;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Practice {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
