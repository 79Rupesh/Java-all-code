 
// Print numbers from 1 to 10

public class w1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("number : " + i);
            i++;
        }
    }

}


/*
// Sum of first N natural number.

public class w2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println(" sum : " + sum);
    }

}

 */

/*
// Reverse a number

public class w3 {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(" 1234 number ka reverse value : " + rev);
    }

}

//  Count digits in a number

public class w4 {
    public static void main(String[] args) {
        int num = 344334;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("number is count : " + count);
    }

}


// Check if number is palindrome.
public class w5 {
    public static void main(String[] args) {
        int palingrome = 121;
        int original = palingrome;
        int rev = 0;
        while (palingrome > 0) {
            rev = rev * 10 + (palingrome % 10);
            palingrome = palingrome / 10;

        }

        if (original == rev) {
            System.out.println("paligrom number : ");
        } else {
            System.out.println("not palilgram number");
        }
    }

}

// Calculate factorial of a number
public class A6 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;

        }
        System.out.println("factorial : " + fact);
    }

}



public class w7 {
    public static void main(String args[]) {
        int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println("Even number : " + n);
            }
            n++;
        }
    }

}


public class w8 {
    public static void main(String args[]) {
        int num = 123;
        int count = 0;
        while (num > 0) {

            count = num % 10;
            num = num / 10;

            System.out.println("Number of digits : " + count);
        }
    }

}



//  Count even and odd digits
public class w9 {
    public static void main(String[] args) {
        int number = 787;
        int num;
        int even = 0, odd = 0;
        while (number > 0) {
            num = number % 10;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;

        }
        System.out.println("Even number : " + even);
        System.out.println(" Odd number : " + odd);

    }
}


public class w10 {
    public static void main(String args[]) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;

        }
        System.out.println("sum of the number : " + sum);
    }

}



// Product of digits
public class w11 {
    public static void main(String args[]) {
        int num = 12345;
        int digit = 1;
        int product = 1;
        while (num > 0) {
            digit = num % 10;
            product = product * digit;
            num = num / 10;

        }
        System.out.println("product of number : " + product);
    }

}


//  Print table of a number using while loop.
public class w12 {
    public static void main(String args[]) {
        int num = 5;
        int i = 1;
        while (i <= 10) {
            System.out.println("table of : " + num + " * " + i + " = " + num * i);
            i++;
        }
    }

}


public class w13 {
    public static void main(String args[]) {
        int num = 153;
        int n = num;
        int sum = 0;
        int j = 0;
        while (n > 0) {
            j = n % 10;
            sum = sum + (j * j * j);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("Armstong number : " + num);
        } else {
            System.out.println("not Armstong number : " + num);
        }
    }

}




public class w14 {
    public static void main(String args[]) {
        int a = 15;
        int b = 12;

        while (a != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("GCD number " + a);
    }
}




//  Print Fibonacci series (N terms)📥
//  Input: 5 → 📤 Output: 0 1 1 2 3

public class w15 {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int i = 1;
        int n = 5;
        int c = 0;
        while (i <= n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }

}





// Find power of a number (a^b)📥
//  Input: 2, 5 → 📤 Output: 32

public class w16 {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int power = 1;
        int i = 1;
        while (i <= b) {
            power = power * a;
            i++;
        }
        System.out.println(power);
    }

}



//  Print reverse counting from N to 1📥
//  Input: 5 → 📤 Output: 5 4 3 2 1

public class w17 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            System.out.println(n);
            n--;
        }
    }

}



//  Find LCM of two numbers📥
//  Input: 4, 5 → 📤 Output: 20

public class w18 {
    public static void main(String args[]) {
        int a = 4;
        int b = 5;
        int i;
        if (a > b) {
            i = a;
        } else {
            i = b;
        }
        while (true) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(" LCM : " + i);
                break;

            }
            i++;
        }

    }
}



//  Print sum of even numbers from 1 to N📥
//  Input: 10 → 📤 Output: 30

public class w19 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(" Print sum of even numbers from 1 to 10 : " + sum);
    }

}



// Check whether a number is prime📥
//  Input: 7 → 📤 Output: Prime📥 Input: 10 → 📤 Output: Not prime
public class w20 {
    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;

        }
        while (i < num / 2) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
            i++;
        }
        if (isprime) {
            System.out.println(" isprime number : " + num);
        } else {
            System.out.println("not isprime number : " + num);
        }
    }
}


 */ 
