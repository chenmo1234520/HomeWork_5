package pers.chenmo.myapp.Second;

class Pet {
  String name;
  int health;
  int love;

  public Pet() {

  }

  public Pet(String name, int health, int love) {
    this.name = name;
    this.health = health;
    this.love = love;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getLove() {
    return love;
  }

  public void setLove(int love) {
    this.love = love;
  }

  void print() {
    System.out.println("name:" + this.name);
    System.out.println("health:" + this.health);
    System.out.println("love:" + this.love);
  }

}

class Dog extends Pet {
  String strain;

  public Dog(String name, int health, int love, String strain) {
    super(name, health, love);
    this.strain = strain;
  }

  public String getStrain() {
    return strain;
  }

  void print() {
    super.print();
    System.out.println("strain:" + this.strain);

  }

}

class Penguin extends Pet {
  String sex;

  public Penguin(String name, int health, int love, String sex) {
    super(name, health, love);
    this.sex = sex;
  }

  public String getSex() {
    return sex;
  }

  void print() {
    super.print();
    System.out.println("sex:" + this.sex);

  }

}

class Second {
  public static void main(String[] args) {
    Pet p = new Pet("猫", 5, 8);
    p.print();
    System.out.println("========================================");
    Dog d = new Dog("狗", 6, 9, "固执");
    d.print();
    System.out.println("========================================");
    Penguin q = new Penguin("企鹅", 6, 9, "雄性");
    q.print();
  }
}