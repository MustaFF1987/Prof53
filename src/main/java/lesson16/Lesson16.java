package lesson16;

import lesson16.MyBinaryTree.Vortex;

public class Lesson16 {
    // Graphs. Trees, Binary Trees, Tree Map.
    // Вершина Vortex
    // Ребро Edge - соединение между двумя вершинами
    // Полно-связный граф (fully connected) из любой вершины
    //      можно добраться до любой другой по ребрам графа
    // Граф циклический если из какой-то из его вершин
    //      можно попасть по ребрам в нее же
    // Граф называется "деревом" (tree) если он
    //      ациклический и полно-связный
    // Лемма - в дереве количество ребер равно количеству верщин - 1

    // Бинарное дерево (binary tree) у каждой вершины может быть
    //      максимум две дочерние вершины

    // binary search tree бинарное дерево у которого у каждой вершины
    //      значение в левой дочерней вершине
    //      меньше, а в правой дочерней вершине больше


    public static void main(String[] args) {
        Vortex v5 = new Vortex(5);
        Vortex v7 = new Vortex(7);
        Vortex v6 = new Vortex(6, v5, v7);
        Vortex v10 = new Vortex(10);
        Vortex v8 = new Vortex(8, v6, v10);


        MyBinaryTree tree = new MyBinaryTree(v8);
        System.out.println(tree.depth());

        System.out.println(tree.contains(8));
        System.out.println(tree.contains(33));

        System.out.println(tree);

//        tree.add(30);
//        tree.add(25);
//        tree.add(20);
//        System.out.println(tree);

        tree.delete(6);
        System.out.println(tree);

        System.out.println(tree.countVortexes());

    }
}
