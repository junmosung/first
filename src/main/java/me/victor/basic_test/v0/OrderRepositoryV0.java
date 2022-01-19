package me.victor.basic_test.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * Created by victorsung.
 * Date: 2022/01/02
 * Time: 7:51 PM
 */
@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId) {
        // 저장로직
        if (itemId.equals("ex")) {
            throw new IllegalArgumentException("예외 발생!");
        }

        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
