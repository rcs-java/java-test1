# Results

### Theoretical

1. Y
2. N (almost, but we want the application `foobar` not the application `wine`)
3. Y
4. Y
5. Y
6. Y
7. Y
8. Y
9. Y
10. N
11. Y
12. N
13. N

### Practical

You might have made a mistake while using git, as I can see only the second task.

Sadly there is a syntax error in line 15 that prevents it from running.
Luckily that line is not necessary for anything, so deleting it fixes your program almost 100%.
If you also add an `else` to the `if` statement, then that would be a perfect solution.

```
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are in the room?");
        int room = sc.nextInt();
        System.out.println("How many people are in a queue?");
        int queue = sc.nextInt();

//        int (room+queue) = sc.nextInt();
        if (room+queue <= 100){
            System.out.println("Fit");
        } else {
            System.out.println("Don't fit");
        }

    }
}
```
