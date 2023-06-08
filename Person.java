class Person {
   // int型のクラスフィールドcountを定義
  public static int count = 0;
  // 以下にインスタンスフィールドを定義
  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  // 以下にコンストラクタを定義し、インスタンスフィールドに値をセット
  Person(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足す
    Person.count ++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  // fullNameメソッドを定義
  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
      
  }

  // bmiメソッドを定義
  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // printDataメソッドを定義
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは"+ Math.round(this.bmi()) + "です");
  }

  // クラスメソッドprintCount()を定義してください
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}