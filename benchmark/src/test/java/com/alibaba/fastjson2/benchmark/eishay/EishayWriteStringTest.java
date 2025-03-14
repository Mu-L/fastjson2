package com.alibaba.fastjson2.benchmark.eishay;

import static com.alibaba.fastjson2.benchmark.JMH.BH;

public class EishayWriteStringTest {
    static final EishayWriteString benchmark = new EishayWriteString();
    static final int LOOP = 10_000_000;

    public static void fastjson2() {
        for (int j = 0; j < 5; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < LOOP; ++i) {
                benchmark.fastjson2(BH);
            }
            long millis = System.currentTimeMillis() - start;
            System.out.println("fastjson2 millis : " + millis);
            // zulu8.70.0.23 : 3001 2795 2550
            // zulu11.62.17 : 3288 2549 2338
            // zulu17.32.13 : 3305 2909 2503 2353 2356
            // zulu17.40.91_vec : 2527 2536
        }
    }

    public static void fastjson2Mixin() {
        for (int j = 0; j < 5; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < LOOP; ++i) {
                benchmark.fastjson2Mixin(BH);
            }
            long millis = System.currentTimeMillis() - start;
            System.out.println("fastjson2Mixin millis : " + millis);
            // zulu8.58.0.13 : 361
            // zulu11.52.13 : 435 434
            // zulu17.32.13 : 368 362

            // reflect-zulu8.58.0.13 :
            // reflect-zulu11.52.13 :
            // reflect-zulu17.32.13 :
        }
    }

    public static void jackson() throws Exception {
        for (int j = 0; j < 5; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < LOOP; ++i) {
                benchmark.jackson(BH);
            }
            long millis = System.currentTimeMillis() - start;
            System.out.println("jackson millis : " + millis);
            // zulu8.58.0.13 :
            // zulu11.52.13 :
            // zulu17.32.13 : 5896
        }
    }

    public static void wastjson() throws Exception {
        for (int j = 0; j < 5; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < LOOP; ++i) {
                benchmark.wastjson(BH);
            }
            long millis = System.currentTimeMillis() - start;
            System.out.println("wastjson millis : " + millis);
            // zulu8.58.0.13 :
            // zulu17.32.13 :
            // zulu11.52.13 : 5246
        }
    }

    public static void gson() throws Exception {
        for (int j = 0; j < 5; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < LOOP; ++i) {
                benchmark.gson(BH);
            }
            long millis = System.currentTimeMillis() - start;
            System.out.println("jackson millis : " + millis);
            // zulu8.58.0.13 : 1455
            // zulu11.52.13 :
            // zulu17.32.13 :
        }
    }

    public static void main(String[] args) throws Exception {
        fastjson2();
//        fastjson2Mixin();
//        jackson();
//        wastjson();
    }
}
