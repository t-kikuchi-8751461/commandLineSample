package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * ApplicationRunner/CommandLineRunnerの実装が複数あれば、全て実行される<br>
 * {@link Order @Order} アノテーションで実行順は制御出来る<br>
 * 並列では無いらしい
 */
@Order(value = 0)
@Slf4j
@Component
public class TestRunner3 implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {
        // 2秒待っても次のRunnerは実行されていない
        Thread.sleep(2000);
        log.debug("TestRunner3.run() CommandLineRunner @Order(value = 0)");
    }
    
}
