package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTests {

    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void t3() {
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }
    @Test
    @DisplayName("1000 + 200 == 1200")
    void t4() {
        assertThat(Calc.run("1000 + 200")).isEqualTo(1200);
    }
}

//연산자 중간에는 띄어쓰기를 하는게 좋음 붙어있으면 가독성이 좋지않음
