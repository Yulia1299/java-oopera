import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(director.toString());
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже добавлен");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String oldActorSurname) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(oldActorSurname)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Актёр с такой фамилией отсутствует");
        }
    }
}