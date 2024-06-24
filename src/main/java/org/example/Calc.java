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
        int c = 0;

        if(bits.length > 2){
            c = Integer.parseInt(bits[2]); // 항상 받을 필요가 없기 때문에 예외를 만든다
        }

        if (needToPlus) {
            return a + b + c;
        } else if (needToMinus) {
            return a - b - c;
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

