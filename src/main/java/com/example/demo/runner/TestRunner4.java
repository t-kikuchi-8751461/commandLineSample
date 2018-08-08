package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * Beanの登録を制御することで、処理の実行可否を切り替える<br>
 * TestRunner4クラス自身には {@link Component @Component} 等のアノテーションを付けない(component-scan対象外)
 */
@Slf4j
public class TestRunner4 implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {
        log.debug("TestRunner4.run() CommandLineRunner execute=TestRunner4");
    }
    
    /**
     * Configurationの中でBean登録メソッドを作る
     */
    @Configuration
    public static class TestRunner4Config {
        
        /**
         * {@link ConditionalOnProperty @ConditionalOnProperty} で指定のプロパティと値がある場合のみ、Bean登録される =
         * run()が実行される<br>
         * <code>-Dexecute=TestRunner4</code> をjavaの引数に指定することで実行される<br>
         * すべてのRunnerをこの形式で実装すると、引数の解析処理を書かずに実行の切り分けが出来る<br>
         */
        @Bean
        @ConditionalOnProperty(value = { "execute" }, havingValue = "TestRunner4")
        public TestRunner4 testRunner4() {
            return new TestRunner4();
        }
    }
    
}
