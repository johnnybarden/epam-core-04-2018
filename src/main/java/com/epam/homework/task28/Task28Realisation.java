package com.epam.homework.task28;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Task28Realisation implements Task28 {
    @Override
    public int getNumberOvertaking(Set<Car> cars, int lapLength, int lapsCount) {
        List<Car> list = new ArrayList<>(cars);
        int distance = lapLength * lapsCount;
        int overtakingCount = 0;

        for (int i = 0; i < list.size(); i++) {
            Car first = list.get(i);
            int timeFirst = distance / first.getSpeed();
            for (int j = i + 1; j < list.size(); j++) {
                Car second = list.get(j);
                int timeSecond = distance / second.getSpeed();
                int difference = (distance - Math.min(first.getSpeed(), second.getSpeed()) * Math.min(timeFirst, timeSecond));
                overtakingCount += Math.abs(difference / lapLength);

                if ((first.getStartPosition() < second.getStartPosition()) && (second.getSpeed() > first.getSpeed())) {
                    overtakingCount += 1;
                }
                if ((first.getStartPosition() > second.getStartPosition()) && (second.getSpeed() < first.getSpeed())) {
                    overtakingCount += 1;
                }
            }
        }
        return overtakingCount;
    }
}
