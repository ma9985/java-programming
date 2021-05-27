package day24_loops;

import javax.crypto.spec.PSource;

/*
"starting: World's smallest cat 🐈- BBC"

int seconds = 0;

video is 1 min 57 seconds

while we did not reach to last second
    print " Watching YouTube video: second: 1"


print "Finished watching Cat video, lets start another one"
 */
public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat - BB");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching YouTube video: second: 1");
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat video");
        System.out.println("lets start another one");

        int count = 5;
        while (count >= 5);
        System.out.println("count = " + count);
        count--;

    }
}
