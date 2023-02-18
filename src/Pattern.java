import java.util.*;
//Code to print star pattern.
public class Main {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}

// Code to print solid rectangle pattern
public class Main {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}

// Code to print hollow rectangle pattern
public class Main {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if(i=1 || j=1 || i=n || j=m){
                    System.out.println("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
    
// Code to print a diagnol line
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j>=i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
    
}

// Code to print half pyramid
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

// Code to print inverted half pyramid
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

// Code to print a half pyramid(mirror image)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
