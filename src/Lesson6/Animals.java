package Lesson6;

public  class Animals {
    String name;
    double max_run;
    double max_swim;
    double max_jump;

    public Animals(String name) {
        this.name = name;
    }
    public void run (double run) {
        if (max_run >= run) {
            System.out.println(name + " пробежал(а)" + run + " м.");
        } else {
            System.out.println(name + " не может пробежать " + run + " м.");
        }
    }
    public void swim (double swim) {
        if (max_swim >= swim) {
            System.out.println(name +" проплыл " + swim + " м.");
        } else {
            System.out.println(name + " не может проплыть " + swim + " м.");
        }
    }
    public void jump(double jump) {
        if (max_jump >= jump) {
            System.out.println(name + " прыгнул " + jump + " м.");
        } else {
            System.out.println(name + " не может прыгнуть " + jump + " м.");
        }
    }
}
class Cat extends Animals  {
    public Cat(String name) {
        super(name);
        max_run = 200;
        max_swim = 0;
        max_jump = 2;
    }
    @Override
    public void run(double run) {
        super.run(run);
    }
    @Override
    public void swim(double swim) {
        super.swim(swim);
    }
    @Override
    public void jump(double jump) {
        super.jump(jump);
    }
//    public void run () {
//
//        System.out.println(name + " пробежал " + run + " м.");
//
//    }
//
//    public void swim () {
//        System.out.println(name + " проплыл " +  swim + " м.");
//    };
//
//    public void jump() {
//        System.out.println(name + " прыгнул на " + jump + " м.");
//    };
}
class Dog extends Animals {
    public Dog(String name) {
        super(name);
        max_run = 500;
        max_jump = 0.5;
        max_swim = 10;
    }
    @Override
    public void run(double run) {
        super.run(run);
    }
    @Override
    public void swim(double swim) {
        super.swim(swim);
    }
    @Override
    public void jump(double jump) {
        super.jump(jump);
    }
}
