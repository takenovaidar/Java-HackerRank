class example {
    public static int arithmetic(int a, int b, String operator) {
        if (operator.equals("add")) {
            return (a+b);
        }
        else if (operator.equals("subtract")) {
            return a-b;
        }
        else if (operator.equals("multiply")) {
            return a*b;
        }
        else if (operator.equals("divide")) {
            return a/b;
        }
        else {
            throw new IllegalArgumentException("Invalid operator");
        }    
    }
    public static void main(String[] args) {
        // Test examples
        System.out.println(arithmetic(5, 3, "add"));       // Output: 8
        System.out.println(arithmetic(10, 5, "subtract")); // Output: 5
        System.out.println(arithmetic(4, 2, "multiply"));  // Output: 8
        System.out.println(arithmetic(9, 3, "divide"));    // Output: 3
    }
}