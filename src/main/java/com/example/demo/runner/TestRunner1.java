package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * CommandLineRunnerを実装したクラスをBean登録することで、SpringBootアプリケーション起動時にrunメソッドが実行される
 */
@Slf4j
@Component
public class TestRunner1 implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {
        log.debug("TestRunner1.run() CommandLineRunner");
    }
    
}
