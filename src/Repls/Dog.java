package Repls;

public class Dog extends Animal {
String breed;
int  humanYears;

    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    public int getAgeInHumanYears() {
        if (age<=2){
            return age*11;
        }

      else
        return 22 + ((age-2) * 5);
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n"+"Breed: "+breed+"\n"+"Age in calendar year: "+age+"\n"+"Age in human years: "+humanYears;
    }


  public boolean isSame(Dog d){
        if (this.name.equals(d.name)&&this.age==d.age&&this.breed.equals(d.breed)){
            return true;
        }
        else return false;
  }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
