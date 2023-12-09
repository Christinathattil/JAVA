import java.util.Scanner;

public class Performance {
    int i, n;
    int marks[];

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements you want to store: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        marks = new int[n];
        for (i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array elements are : ");
        for (i = 0; i < n; i++) {
            System.out.println(marks[i]);
        }
    }

    void highestMark() {
        if (n > 0) {
            int max = marks[0];
            for (i = 1; i < n; i++) {
                if (marks[i] > max) {
                    max = marks[i];
                }
            }
            System.out.println("Highest Mark: " + max);
        } else {
            System.out.println("No marks were entered.");
        }
    }

    void lowestMark() {
        if (n > 0) {
            int min = marks[0];
            for (i = 1; i < n; i++) {
                if (marks[i] < min)
                    min = marks[i];
            }
            System.out.println("Lowest mark : " + min);
        } else {
            System.out.println("No marks were added");
        }
    }

    void getMode() {
        if (n > 0) {
            int maxCount = 0;
            int mode = marks[0];
            for (i = 0; i < n; ++i) {
                int value = marks[i];
                int count = 0;
                for (int j = 0; j < n; ++j) {
                    if (marks[j] == value)
                        ++count;
                }
                if (count > maxCount) {
                    maxCount = count;
                    mode = value;
                }
            }

            System.out.println("The mode is : " + mode);
            System.out.println("The frequency is : " + maxCount);
        } else {
            System.out.println("No marks were added");
        }
    }

    public static void main(String[] args) {
        Performance s1 = new Performance();
        s1.readMarks();
        s1.highestMark();
        s1.lowestMark();
        s1.getMode();
    }
}
