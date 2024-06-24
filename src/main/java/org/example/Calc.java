package org.example;

public class Calc {
    public static int run(String exp) {
        System.out.println(exp); // 입력 주식이 출력된 테스트 케이스에 입력한 수식이 들어간다

        exp = exp.replaceAll("- ", "+ -"); // 입력된 수식에서 "- " 인 경우 를 "+ -" 바꾼다는 의미이다
 // replace를 찾아본다
        System.out.println(exp);

        String[] bits = exp.split(" \\+ ");
//배열을 나눠 "10", "-20", "30"
        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;

        if (bits.length > 2) {
            c = Integer.parseInt(bits[2]); // 항상 받을 필요가 없기 때문에 예외를 만든다
        }

        return a + b + c;

//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아니야");

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

