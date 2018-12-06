[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-14-hailstone-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-14-hailstone-username)

# Lab 14 - Hailstone

## Lab Goal
There is a mathematical problem which reads:

> Pick some positive integer and call it n.
> If n is even, divide it by two.
> If n is odd, multiply it by three and add one.
> Continue this process until n is equal to one.

This always works. No matter which positive integer you start with, the result always ends up being 1 eventually, though no one has been able to prove this is always true.  

For example, starting with 15:
```
15  is odd, so I make 3n+1:   46
46  is even, so I take half:  23
23  is odd, so I make 3n+1:   70
70  is even, so I take half:  35
35  is odd, so I make 3n+1:  106
106 is even, so I take half:  53
53  is odd, so I make 3n+1:  160
160 is even, so I take half:  80
80  is even, so I take half:  40
40  is even, so I take half:  20
20  is even, so I take half:  10
10  is even, so I take half:   5
5   is odd, so I make 3n+1:   16
16  is even, so I take half:   8
8   is even, so I take half:   4
4   is even, so I take half:   2
2   is even, so I take half:   1
```

As you can see from this example, the numbers go up and down, but eventually—at least for all numbers that have ever been tried—comes down to end in 1.  In some respects, this process is reminiscent of the formation of hailstones, which get carried upward by the winds over and over again before they finally descend to the ground. Because of this analogy, this sequence of numbers is usually called the Hailstone sequence, although it goes by many other names as well.

## Instructions
* Complete the method `doHailstone` so it will return the number of steps it took to get to 1 from the number passed.
* You need to edit the `main` method to accept user input and test the entered number.
* Complete all javadoc comment with the proper tags.

## Sample Output
```
This program computes Hailstone sequences.
Enter a number: **17**
17 is odd, so I make 3n+1: 52
52 is even, so I take half: 26
26 is even, so I take half: 13
13 is odd, so I make 3n+1: 40
40 is even, so I take half: 20
20 is even, so I take half: 10
10 is even, so I take half: 5
5 is odd, so I make 3n+1: 16
16 is even, so I take half: 8
8 is even, so I take half: 4
4 is even, so I take half: 2
2 is even, so I take half: 1
The process took 12 steps to reach 1.
```

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 70 - `doHailstone` works correctly
* 20 - `main ` tests user inputted numbers with appropriate output.
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
