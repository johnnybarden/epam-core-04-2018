package com.epam.homework.task27;

public class Task27Realisation implements Task27 {
    @Override
    public AbstractGraph createGraph(int numberNodes) {
        return new AbstractGraph(numberNodes) {
            private int[][] graphArr = new int[numberNodes][numberNodes];

            @Override
            public void addEdge(int first, int second) {
                graphArr[first][second] = 1;
                graphArr[second][first] = 1;
            }

            @Override
            public void removeEdge(int first, int second) {
                graphArr[first][second] = 0;
                graphArr[second][first] = 0;
            }

            @Override
            public boolean isEdgeExists(int first, int second) {
                return graphArr[first][second] == 1;
            }
        };
    }
}
