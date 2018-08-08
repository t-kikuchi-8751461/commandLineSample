package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * mainは必ず実行される<br>
 * 複数のバッチ処理が実装されているとして、mainの中で引数から対象処理を呼び出し…でも良いが、引数の解析処理が必要
 */
@Slf4j
@SpringBootApplication
public class CommandLineSampleApplication {
    
    public static void main(String[] args) {
        log.debug("main() start");
        SpringApplication.run(CommandLineSampleApplication.class, args);
        log.debug("main() end");
    }
}
