# Java : public static void main(String[] args) 🎉️

**The java main() method is a special method that is used as an entry point to run the program**

```java
public static void main(String[] args){

}
```

* The modifier public and static can be written in either order(static public or public static)
* You can name the argument anything you want but most developers using "args" or "argv"

Let's know what happens when you run a program without   main method

```java
public class sample{
public void msg(){
System.out.println("without main method");
}
}
```

Error: Main method not found in class sample, please define the main method as:
public static void main(String[] args)

### *Let's split it and understand one by one*
