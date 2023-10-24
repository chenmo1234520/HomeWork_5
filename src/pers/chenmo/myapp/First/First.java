package pers.chenmo.myapp.First;
/* 电子动物 */
class Feeder {
  String name;

  public Feeder(String name) {
    this.name = name;
  }

  void speak() {
    System.out.println("欢迎来到动物园！");
    System.out.println("我是饲养员 " + this.name);

  }
}

interface Feed {
  void feed();
}

interface Food extends Bone, Fish {

}

interface Bone {
  void choice(Animal d);
}

interface Fish {
  void choice(Animal d);
}

interface Shot {
  void shot();
}

class Animal implements Feed, Shot {
  String food;
  String animal;
  String shot;

  public Animal() {

  }

  public Animal(String food, String animal, String shot) {
    this.food = food;
    this.animal = animal;
    this.shot = shot;
  }

  public Animal(String food, String animal) {
    this.food = food;
    this.animal = animal;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getAnimal() {
    return animal;
  }

  public void setAnimal(String animal) {
    this.animal = animal;
  }

  public void feed() {
    System.out.print("饲养员给" + this.animal + '喂' + this.food + ',');

  };

  public void shot() {

    System.out.println(this.animal + this.shot + "叫");

  }

  public void active() {

    this.feed();
    this.shot();
  }

  public void choice(Animal d) {
    if (d instanceof Dog) {
      System.out.print("汪汪汪~~~");
      System.out.println(this.animal + "正在啃着香喷喷的" + this.food);

    } else if (d instanceof Cat) {
      System.out.print("喵喵喵~~~");
      System.out.println(this.animal + "正在吃着香喷喷的" + this.food);
    }
  }

}

class Dog extends Animal implements Food {

  public Dog() {

  }

  public Dog(String food, String animal) {
    super(food, animal);

  }

  public void feed() {
    System.out.println(this.animal + "正在啃着香喷喷的" + this.food);

  };

  public void shot() {
    System.out.print("汪汪汪~~~");

  }

}

class Cat extends Animal {

  public Cat() {

  }

  public Cat(String food, String animal) {
    super(food, animal);
  }

  public void feed() {
    System.out.println(this.animal + "正在吃着香喷喷的" + this.food);

  };

  public void shot() {
    System.out.print("喵喵喵~~~");

  };
}

class First {
  public static void main(String[] args) {
    Animal a = new Animal("骨头", "小狗", "汪汪");
    Animal a1 = new Animal("黄花鱼", "小猫", "喵喵");
    Feeder f = new Feeder("小华");
    f.speak();
    Animal d = new Dog("骨头", "小狗");
    Animal b = new Cat("黄花鱼", "小猫");
    d.choice(d);
    a.active();
    b.choice(b);
    Animal c = new Cat("黄花鱼", "小猫");
    c.shot();
    c.feed();
    a1.active();

  }
}