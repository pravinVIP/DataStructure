package Recursion;

class gcd {
  public static void main(String[] args) {
	gcd main = new gcd();
    var result = main.gcd(-8,4);
    System.out.println(result);


  }

  // Question 3 - GCD
  public int gcd(int a, int b) {
    if (a<0 || b<0) {
      return -1;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }



}