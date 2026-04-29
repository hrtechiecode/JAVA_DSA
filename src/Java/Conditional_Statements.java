package Java;

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
// The semicolon ends the if, so block runs unconditionally!
        System.out.println("enter a number");
        int x11=sc.nextInt();
        if (x11== 5); // ← Oops, this ends if
        System.out.println("Always printed");
                // 1. Even or Odd
                System.out.print("Enter a number to check even/odd: ");
                int n = sc.nextInt();
                if (n % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");

                // 2. Divisible by 5
                System.out.print("Enter a number to check divisible by 5: ");
                n = sc.nextInt();
                if (n % 5 == 0)
                    System.out.println("Divisible by 5");
                else
                    System.out.println("Not divisible by 5");

                // 3. Absolute Value
                System.out.print("Enter a number to find absolute: ");
                n = sc.nextInt();
                if (n < 0)
                    n =-n;
                System.out.println("Absolute: " + n);

                // 4. Profit or Loss
                System.out.print("Enter Cost Price: ");
                double cp = sc.nextDouble();
                System.out.print("Enter Selling Price: ");
                double sp = sc.nextDouble();
                if (sp > cp)
                    System.out.println("Profit: " + (sp - cp));
                else if (cp > sp)
                    System.out.println("Loss: " + (cp - sp));
                else
                    System.out.println("No profit, no loss");

                // 5. Area vs Perimeter
                System.out.print("Enter Length: ");
                int l = sc.nextInt();
                System.out.print("Enter Breadth: ");
                int b = sc.nextInt();
                int area = l * b;
                int peri = 2 * (l + b);
                if (area > peri)
                    System.out.println("Area is greater");
                else
                    System.out.println("Perimeter is greater");

                // 6. Square or Rectangle
                if (l == b)
                    System.out.println("It's a square");
                else
                    System.out.println("It's a rectangle");

                // 7. Grade System
                System.out.print("Enter Percentage: ");
                int per = sc.nextInt();
                if (per >= 90) System.out.println("Excellent");
                else if (per >= 80) System.out.println("Very Good");
                else if (per >= 70) System.out.println("Good");
                else if (per >= 60) System.out.println("Can do better");
                else if (per >= 50) System.out.println("Average");
                else if (per >= 40) System.out.println("Below Average");
                else System.out.println("Fail");

                // 8. 3-digit number
                System.out.print("Enter a number to check 3-digit: ");
                n = sc.nextInt();
                if (n >= 100 && n <= 999)
                    System.out.println("3-digit number");
                else
                    System.out.println("Not a 3-digit number");

                // 9. Divisible by 5 AND 3
                System.out.print("Enter number to check divisible by 5 AND 3: ");
                n = sc.nextInt();
                if (n % 5 == 0 && n % 3 == 0)
                    System.out.println("Divisible by 5 and 3");

                // 10. Divisible by 5 OR 3
                System.out.print("Enter number to check divisible by 5 OR 3: ");
                n = sc.nextInt();
                if (n % 5 == 0 || n % 3 == 0)
                    System.out.println("Divisible by 5 or 3");

                // 11. Divisible by 5 or 3 but NOT 15
                System.out.print("Enter number to check divisible by 5 or 3 but not 15: ");
                n = sc.nextInt();
                if ((n % 5 == 0 || n % 3 == 0) && n % 15 != 0)
                    System.out.println("Divisible by 5 or 3 but not 15");

                // 12. Greatest of 3 numbers
                System.out.print("Enter 3 numbers: ");
                int a = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();
                if (a >= a2 && a >= a3)
                    System.out.println(a + " is the greatest");
                else if (a2 >= a && a2 >= a3)
                    System.out.println(a2 + " is the greatest");
                else
                    System.out.println(a3 + " is the greatest");

                // 13. Youngest of 3
                System.out.print("Enter ages of Ram, Shyam, Ajay: ");
                int ram = sc.nextInt(), shyam = sc.nextInt(), ajay = sc.nextInt();
                if (ram < shyam && ram < ajay)
                    System.out.println("Ram is youngest");
                else if (shyam < ram && shyam < ajay)
                    System.out.println("Shyam is youngest");
                else
                    System.out.println("Ajay is youngest");

                // 14. Triangle check
                System.out.print("Enter sides a, b, c: ");
                int side1 = sc.nextInt(), side2 = sc.nextInt(), side3 = sc.nextInt();
                if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
                    System.out.println("Can form a triangle");
                else
                    System.out.println("Cannot form a triangle");

                // 15. Point on x, y axis or origin
                System.out.print("Enter x and y coordinates: ");
                int x = sc.nextInt(), y = sc.nextInt();
                if (x == 0 && y == 0)
                    System.out.println("Point is at Origin");
                else if (x == 0)
                    System.out.println("Point lies on Y-axis");
                else if (y == 0)
                    System.out.println("Point lies on X-axis");
                else
                    System.out.println("Point is somewhere else");

                // 16. Point inside, on or outside a circle
                System.out.print("Enter center (x1, y1): ");
                int x1 = sc.nextInt(), y1 = sc.nextInt();
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                System.out.print("Enter point (x2, y2): ");
                int x2 = sc.nextInt(), y2 = sc.nextInt();
                double dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
                if (dist == radius)
                    System.out.println("Point is on the circle");
                else if (dist < radius)
                    System.out.println("Point is inside the circle");
                else
                    System.out.println("Point is outside the circle");

    }
        }
