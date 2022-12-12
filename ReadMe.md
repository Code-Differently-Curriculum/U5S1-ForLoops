# U5S1 - For Loops

* Part A - Foundations 6.1
* Part B - Foundations Practice

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `Countdown`  

#### Step 02

* Set a breakpoint in `Countdown` and observe…
  * How the for loop affects code execution
  * How the value of i changes

#### Step 03
* write the code to count up from 0 to 5 in the `countUpLoop` method
* write the code to count all even numbers
  from 0 to 20 in the `evenNumber` method

### Exercise 02

#### Step 01

In the package `partA.ex03` look at the file `ScopeRunner`

#### Step 02

*   `ScopeRunner` is broken. Can you fix it?
* uncomment the code by deleting line 7 and 30 and fix the error
*  You should get the following output:
```
 64 32 16 8 4 2 1
 0 1 2 3 4 5
 5 4 3 2 1 0
 2 4 8 16 32 64
```

## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `CountingExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `CountUpByTens` per the following:

        Create a program that uses a loop to count.
        The count should start at ten and end at 100.
        You should only count up by 10s - look at the example below

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):
```
10
20
30
40
50
60
70
80
90
100
```

> Use CountingExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `LoopPrintExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `FixThisLoop` per the following:

    Modify the existing loop so that it prints "Hello" five times

Your program is working correctly, if when run, the following is the output:
```
Hello
Hello
Hello
Hello
Hello
```

> Use LoopPrintExample for reference.


### Exercise 03

#### Step 01

In the package `partB.ex03` look at the file `ArrayLoopExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex03` complete the `Challenge` per the following:

    Create a program that has an array of Strings with six unique elements
    Use a loop of your preference to print out each unique element of the array

Your program is working correctly, if when run, the following is the output:
```
Kaleb
Tariq
Gio
Sam
Steph
Michael
```

> Use ArrayLoopExample for reference.

## Part C

In the `AlgoChallenge` file you will be solving the given problems below.

### Problem 01
The parameter dcHero is true if it is an DC Hero,
and the parameter avengerHero is true if the hero is an Avenger.
Avengers will assemble if it is not a DC Hero, or they're an Avenger, or there is at least an Avenger on the team.

Return true if the avengers are ready to assemble.

Example:

```java
avengersAssemble(false, false) --> true
avengersAssemble(false, true) --> true
avengersAssemble(true, false) --> false
avengersAssemble(true, true) --> true
```

### Problem 03

You and your friends are out walking on the boardwalk at Atlantic City
and decided to go to Casino for the fun of it. One person won
___ amount of money. You're trying to find out if the amount was between 90-100 or 190-200.

Return true if the amount of money is within 10 of 100 or 200.

Tip: Math.abs(num) computes the absolute value of a number.

Example:

```java
nearValue(93) --> true 
nearValue(90) --> true 
nearValue(89) --> false
```

