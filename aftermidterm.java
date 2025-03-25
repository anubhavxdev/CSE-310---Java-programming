class Example implements Cloneable {  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {  
        Example obj = new Example();  

        Example obj2 = new Example();  
        boolean areEqual = obj.equals(obj2);  
        System.out.println("Are objects equal? " + areEqual);  

        Class<?> objClass = obj.getClass();  
        System.out.println("Class of the object: " + objClass.getName());  

        String objString = obj.toString();  
        System.out.println("String representation of the object: " + objString);  

        int objHashCode = obj.hashCode();  
        System.out.println("Hash code of the object: " + objHashCode);  

        try {  
            Example clonedObj = (Example) obj.clone();  
            System.out.println("Object cloned successfully");  
        } catch (CloneNotSupportedException e) {  
            System.out.println("Cloning not supported");  
        }  
    }  
}



//second program

// class Person {  
//     private String name;  
//     private int age;  
//     // Constructor  
//     public Person(String name, int age) {  
//         this.name = name;  
//         this.age = age;  
//     }  
// }  

// class ToStringExample {  
//     public static void main(String[] args) {  
//         // Creating an object of the Person class  
//         Person person = new Person("John Doe", 25);  
        
//         // Printing the object using explicit toString() method call  
//         System.out.println("Without Overriding toString(): " + person.toString());  
//     }  
// }


//third program

class Person {  
    private String name;  
    private int age;  

    // Constructor  
    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}  

class ToStringExample {  
    public static void main(String[] args) {  
        // Creating an object of the Person class  
        Person person = new Person("John Doe", 25);  
        
        // Printing the object using explicit toString() method call  
        System.out.println("Without Overriding toString(): " + person.toString());  
    }  
}


//fourth program4



class Person {  
    private String name;  
    private int age;  

    // Constructor  
    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}  

class ToStringExample {  
    public static void main(String[] args) {  
        // Creating an object of the Person class  
        Person person = new Person("John Doe", 25);  
        
        // Printing the object using explicit toString() method call  
        System.out.println("Without Overriding toString(): " + person.toString());  
    }  
}


//fifth program


class Parent{}  

class Child1 extends Parent{}  

class Child2 extends Parent{}  

class Demo   
{  
    public static void main(String[] args)  
    {  
        Parent p = new Parent();  
        Child1 c1 = new Child1();  
        Child2 c2 = new Child2();  
        
        System.out.println(c1 instanceof Parent);  
        System.out.println(c2 instanceof Parent);  
        System.out.println(p instanceof Child2);  
        
        p = c1;  
        System.out.println(p instanceof Child1);  
        System.out.println(p instanceof Child2);  
        
        p = c2;  
        System.out.println(p instanceof Child1);  
        System.out.println(p instanceof Child2);  
    }  
}