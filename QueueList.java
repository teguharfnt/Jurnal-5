package com.example.queue;

import java.util.*;

public class QueueList<E> {
    private final Queue<ToDoList> toDoList;

    public QueueList(){
        toDoList = new LinkedList<ToDoList>();
    }

    public void addToDoList(ToDoList object){
        toDoList.add(object);
    }

    public void removeToDo() throws NoSuchElementException {
        toDoList.remove();
    }

//    public boolean isEmpty() {
//        return toDoList.isEmpty();
//    }

    public void printAllToDo() {
        Iterator<ToDoList> iterator = toDoList.iterator();
        if (toDoList.isEmpty()){
            System.out.println("Empty Todolist");
        } else {
            while (iterator.hasNext()){
                Object value = iterator.next();
                System.out.println(value);

            }
        }
    }

    public void printPriority() {
        Iterator<ToDoList> iterator = toDoList.iterator();
        if (toDoList.isEmpty()) {
            System.out.println("Empty Todolist");
        } else {

            while (iterator.hasNext()) {
                Object value = iterator.next();
                if (!iterator.hasNext()) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }

            }
        }
    }
}


