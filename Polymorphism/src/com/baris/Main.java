package com.baris;
//1 create movie class
class Movie {
    private String movieName;
//2 create constructor
    public Movie(String movieName) {
        this.movieName = movieName;
    }
//3 create method
    public String plot() {
        return "No plot here";
    }

    public String getMovieName() {
        return movieName;
    }
}
//4 create class extends top class
class Jaws extends Movie {
    //5 create constructor using inheritance
    public Jaws() {
        super("Jaws");
    }

    //6 create method
    public String plot() {
        return "shark eats people";
    }

}
//7 create class
class IndependenceDay extends Movie {
// 8 create constructor
    public IndependenceDay() {
        super("Independence Day");
    }
// 9 override plot:
    @Override
    public String plot() {
        return "Aliens attack";
    }
}
// repeat same below
class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "escape from maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "jedi vs sith";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("forgetable");
    }

    // no override plot method
}

public class Main {

    public static void main(String[] args) {

        //12 create for loop to use polymorphism
        // to call plot method for that class
        for(int i=1; i<11; i++) {

            Movie mov = randomMovie();
            System.out.println("Movie no : "+ i +" name "
             + mov.getMovieName() + "\n" +
            "plot: " + mov.plot() + "\n");
            // mov.plot() how polymorhpism works
        }
    }

    // **** 10 create a static method in the MAIN
// purpose is return a random movie
    public static Movie randomMovie() {
        // 11we need to generate random number:
        // random double ister inte cast ediyoruz
        int randomNumber = (int) (Math.random() * 5) +1;
        // random ın içine gir 0.0 ve 1.0 arası numara artı 1
        System.out.println("random number is " + randomNumber);
        switch (randomNumber) {
            case 1:
            return new Jaws();

            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
