package Lab9;

import Lab9.Hero.*;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Супермен", 90, "Боец"));
        heroes.add(new Hero("Стрэндж", 15, "Маг"));
        heroes.add(new Hero("Тор", 85, "Воин"));
        heroes.add(new Hero("Алая Ведьма", 30, "Маг"));
        heroes.add(new Hero("Аквамен", 10, "Воин"));

        System.out.println("Вывод списка через for:");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }

        System.out.println("\nВывод списка через for-each:");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }


        heroes.addFirst(new Hero("Зелёный Фонарь", 50, "Защитник"));
        heroes.add(new Hero("Киборг", 25, "Защитник"));

        System.out.println("\nСписок после добавления объектов:");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }

        heroes.remove(2);
        Hero heroToRemove = new Hero("Алая Ведьма", 30, "Маг");
        heroes.remove(heroToRemove);

        System.out.println("\nСписок после удаления объектов:");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }

        System.out.println("\nТекущий размер списка: " + heroes.size());

        Hero heroAtIndex = heroes.get(1);
        System.out.println("\nИмя героя по индексу 1: " + heroAtIndex.getName());

        heroAtIndex.setEnergy(15);
        System.out.println("\nГерой после изменения энергии: " + heroAtIndex);

        System.out.println("\nПоиск героя с энергией < 20:");
        for (Hero hero : heroes) {
            if (hero.getEnergy() < 20) {
                System.out.println("Найден герой: " + hero);
                break;
            }
        }

        Hero testHero = new Hero("Аквамен", 10, "Воин");
        System.out.println("\nСодержится ли <Аквамен> в списке: " + heroes.contains(testHero));

        heroes.clear();
        System.out.println("\nРазмер списка после очистки: " + heroes.size());
    }
}
