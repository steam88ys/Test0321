package kr.hs.study.beans;

public class Person {
    String name;
    int age;
    job career;

    public void prData() {
        System.out.println("===============================");
    }

    public Person() {
        System.out.println("Person 기본 생성자");
        this.name = "홍길동";
        this.age = 0;
        this.career = career;
    }

    public Person(String name, int age, job career) {
        System.out.println("===============================");
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
        System.out.println("직업: "+career);
    }

    public void talk() {
        System.out.println("사람입니다.");
    }


}
