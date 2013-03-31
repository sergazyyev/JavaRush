/**
 *
 *JavaRush.ru
 *Level 05, Lesson 12, home 04
 *
 * Вывести на экран текущую дату в аналогичном виде "21 12 2012".
 *
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level05.lesson12.home04;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Solution
{
    public static void main(String[] args)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        GregorianCalendar curTime = new GregorianCalendar();
        System.out.println(formatter.format(curTime.getTime()));
    }
}
