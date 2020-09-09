package lesson2;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addFirst(1, "Str1");
    linkedList.addFirst(2, "Str2");
    linkedList.addFirst(3, "Str3");
    linkedList.addFirst(4, "Str4");

    linkedList.displayList();

    while (!linkedList.isEmpty()) {
      Link aLink = linkedList.deleteFirst();
      System.out.print("Deleted ");
      aLink.displayLink();
      System.out.println("");
    }
    linkedList.displayList();
  }

  public static class Link {   //класс link, представлет собой обычный класс, в котором находятся 3 поля. Привычные int и String, а так же ссылка на объект такого же класса

    public int key;
    public String data;
    public Link nextLink; //основное внимание на то, что nextLink не является объектом,это только ссылка на объект.

    public Link(int key, String data) {  //привычный конструктор
      this.key = key;
      this.data = data;
    }

    public void displayLink() {   //вывод на экран содержимого объекта List
      System.out.print("{ " + key + "," + data + " }");
    }
  }

  static class LinkedList {   //класс, который реализует методы работы с нашими элементами, а именно с List'ами.

    private static Link first;   //опять же, ссылка на экземпляр класса Link, first - не является объектом, это только ссылка на объект.который в момент создания ни на что не ссылается

    public LinkedList() {  //конструктор нашего класса, без параметров, ибо этот класс нам нужен только для работы с листами (List), в целом этот класс можно не реализовывать и всю логику прописать в List,
      first = null;      // но я пока не пойму как это сделать
    }

    public boolean isEmpty() {  //проверяем, не пустоя ли у нас ссылка. Указывает ли она еще на что-нибудь? на какой-нибудь другой объект.
      return (first == null);   //проверка
    }

    public void addFirst(int key, String data) {  //наверно самый интересный и сложный в данный момент метод.Нужно понять принцип его работы, а если этого не сделать - то все очень будет плохо
      Link newLink = new Link(key, data);         //перед добавлением элемента, мы создаем собственно сам элемент(List) с 2мя параметрами. И помним, что у нашего объекта, в данном случае newList есть ссылка на другой объект типа лист, но это только ссылка
      newLink.nextLink = first;                   //у нашего объекта переходим к внутренней ссылке(читаем если надо,строку выше еще раз) и присваеваем значение first.
      first = newLink;                            //
    }
    public void addLast(int key,String data){
      Link newLink = new Link(key,data);

    }

    public Link deleteFirst() {
      Link temp = first;
      first = first.nextLink;
      return temp;
    }

    public void displayList() {
      System.out.print("List (first-->last): ");
      Link current = first;
      while (current != null) {
        current.displayLink();
        current = current.nextLink;
      }
      System.out.println();
    }
  }
}
