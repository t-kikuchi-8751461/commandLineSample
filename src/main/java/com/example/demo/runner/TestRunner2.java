package com.example.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * ApplicationRunnerの実装でもCommandLineRunnerと同様<br>
 * 違いは、引数の取得がString配列か、ApplicationArgumentsか
 */
@Slf4j
@Component
public class TestRunner2 implements ApplicationRunner {
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("TestRunner2.run() ApplicationRunner");
    }
    
}
