package restgroup;

import org.junit.Test;

public class TestGit {
    private int j=100;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test start by Jaydip");

        System.out.println("Test continue by Nirali");


        System.out.println("Test start by Riya");
        System.out.println("By Beena");

        new TestGit().checkTime();

        }
@Test
        public void checkTime() throws InterruptedException {

    final long NANOSEC_PER_SEC = 1000*1000*1000;

    long startTime = System.nanoTime();
    while ((System.nanoTime()-startTime)< 1*15*NANOSEC_PER_SEC){
        System.out.println("jaydip time");
    }



}}

