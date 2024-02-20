package edu.kh.exception.test;

public class Test {
	
    public static void main(String[] args) {
        int[] numbers = {3, 57, -5, 23, 67, 1};
        int largest = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargestNumber(int[] numbers) {
        int largest = numbers[0]; // Assume the first number is the largest
        for (int number : numbers) { // Iterate through each number
            if (number > largest) { // If found a larger number
                largest = number; // Update the largest number
            }
        }
        return largest; // Return the largest number found
    }

}
