package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 03, task 03
 *
 *
 * Есть класс Cat, с полем имя (name, String).  Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран.
 *
 *
 * Date: 05.02.13
 * @author Sergey Kandalintsev
 *
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> catsBundle = new HashMap<String, Cat>();

        for (String s : cats)
        {
            catsBundle.put(s, new Cat(s));
        }

        return catsBundle;
    }

    static class Cat
    {
        String name;

        Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

