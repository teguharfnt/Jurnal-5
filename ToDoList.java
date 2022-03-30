package com.example.queue;

public class ToDoList {
    String namaPekerjaan;

    public ToDoList(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
    }

    public String getNamaPekerjaan() {
        return namaPekerjaan;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "namaPekerjaan='" + namaPekerjaan + '\'' +
                '}';
    }
}
