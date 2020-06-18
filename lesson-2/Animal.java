class Main {
  public static void main(String[] args) {
    Dog chester = new Dog("Chester");
    Dog teddy = new Dog("Teddy");
    Cat koby = new Cat("Koby");
    Fish elmo = new Fish("Elmo");

    chester.bark("Hello");
    chester.bark("goodbye");

    teddy.bark("This is teddy");

    teddy.walk();

    if (chester.getAge() == 5) {
      System.out.println("Chester is 5");
    }
    if (teddy.getAge() == 5) {
      System.out.println("Teddy is 5");
    }

    koby.meow("Hello");
    koby.walk();

    elmo.swim();
  }
}

class Fish extends Animal {
  public Fish(String name) {
    this.name = name;
  }

  public void swim() {
    System.out.println(name + " is swimming");
  }
}

class Dog extends LeggedAnimal {
  public Dog(String name) {
    this.name = name;
  }

  public void bark(String text) {
    System.out.println(name + " is barking:" + text);
  }
}

class Cat extends LeggedAnimal {
  public Cat(String name) {
    this.name = name;
  }
  public void meow(String text) {
    System.out.println(name + " is meowing:" + text);
  }
}

class LeggedAnimal extends Animal {
  public void walk() {
    System.out.println(name + " is walking");
  }
}

class Animal {
  String name;

  public int getAge() {
    if (name == "Chester") {
      return 5;
    } else {
      return 4;
    }
  }
}

