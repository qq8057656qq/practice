package com.leo.practice.practice.tdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TeacherArgTest {

    //-l -p 8080 -d /tmp/leo
    //[-l] ,[-p 8080] ,[-d /tmp/leo]
    //{-l:[],-p:8080 ,-d: /tmp/leo}
    //Single Option
    //todo bool - l

    //todo integer -p 8080
    //todo string -d /tmp/leo
    //sad path
    //todo -bool -l t / -l t f
    //todo -int -p 8080 8081
    //todo -string -d /tmp/leo /tmp/leo1 / -d
    //default value
    //todo -bool false
    //todo -int 0
    //todo string ""

    @Test
    @Disabled
    @DisplayName("测试一")
    void should_example_1() {
        Options options = Args.parse(Options.class,"-l","-p","8080","-d","/tmp/leo");
        assertTrue(options.logging());
        assertEquals(8080,options.port());
        assertEquals("/tmp/leo",options.directory());
    }



    @Test
    @Disabled
    void should_example_2() {
        ListOptions options = Args.parse(ListOptions.class,"-l","-p","8080","-d","/tmp/leo");
        assertArrayEquals(new String[]{"-l","-p","8080","-d","/tmp/leo"},options.group());
        assertArrayEquals(new int[]{0,1,2},options.decimals());
    }

    static record Options(@Option("l")boolean logging,@Option("o")int port,@Option("d")String directory) {
        public static Options parse(String... args) {
            return Args.parse(Options.class,args);
        }
    }

    static record ListOptions(@Option("g") String[] group,@Option("d") int[] decimals) {
        public static ListOptions parse(String... args) {
            return Args.parse(ListOptions.class,args);
        }
    }

}
