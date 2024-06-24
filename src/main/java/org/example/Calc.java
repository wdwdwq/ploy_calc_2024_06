package org.example;

public class Calc {
    public static int run(String exp) {
        boolean needToPlus = exp.contains("+");
        boolean needToMinus = exp.contains("-");

        String[] bits = null;

        if (needToPlus) {
            bits = exp.split(" \\+ ");
        } else if (needToMinus) {
            bits = exp.split(" \\- ");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        if (needToPlus) {
            return a + b;
        } else if (needToMinus) {
            return a - b;
        }

        throw new RuntimeException("해석 불가 : 올바른 계산식이 아니야");

    }
}

//String[] bits;
//int result = 0;
//
//        if (exp.contains(" + ")) {
//bits = exp.split(" \\+ ");
//result = Integer.parseInt(bits[0].trim()) + Integer.parseInt(bits[1].trim());
//        } else if (exp.contains(" - ")) {
//bits = exp.split(" - ");
//result = Integer.parseInt(bits[0].trim()) - Integer.parseInt(bits[1].trim());
//        } else {
//        throw new RuntimeException("지원하지 않는 연산입니다.");
//        }
//
//                return result;

