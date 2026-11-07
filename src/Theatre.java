import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Александр", "Петров", "MALE", 175.0);
        Actor actor2 = new Actor("Екатерина", "Климова", "FEMALE", 168.0);
        Actor actor3 = new Actor("Данила", "Козловский", "MALE", 184.0);

        Director director1 = new Director("Юрий", "Любимов", "MALE", 45);
        Director director2 = new Director("Константин", "Богомолов", "MALE", 18);

        String musicAuthor = "Жорж Бизе";
        String choreographer = "Юрий Григорович";

        Show regularShow = new Show("Мастер и Маргарита", 180, director1, new ArrayList<>());

        Ballet balletShow = new Ballet("Щелкунчик", 130, director2, new ArrayList<>(),
                "Петр Чайковский", "Рождественская сказка о девочке Мари и заколдованном принце.", choreographer);

        Opera operaShow = new Opera("Кармен", 200, director1, new ArrayList<>(),
                musicAuthor, "Трагическая история страсти испанской цыганки Кармен и солдата Хозе.", 55);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        balletShow.addActor(actor2);
        balletShow.addActor(actor3);

        operaShow.addActor(actor1);
        operaShow.addActor(actor3);

        System.out.println("--- Первоначальные списки актеров ---");
        regularShow.printListOfActors();
        System.out.println();
        balletShow.printListOfActors();
        System.out.println();
        operaShow.printListOfActors();
        System.out.println();

        System.out.println("--- Замена актера Петрова на Козловского в драматическом спектакле ---");
        regularShow.replaceActor(actor3, "Petrov");
        regularShow.replaceActor(actor3, "Петров");
        regularShow.printListOfActors();
        System.out.println();

        System.out.println("--- Попытка заменить несуществующего актера ---");
        balletShow.replaceActor(actor1, "Баширов");
        System.out.println();

        System.out.println("--- Вывод либретто ---");
        balletShow.printLibretto();
        System.out.println();
        operaShow.printLibretto();
    }
}