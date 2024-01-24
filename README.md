- Переменная, объявленная внутри класса - это **ПОЛЕ**
- Если конструктор не описан, то java по умолчанию создаёт пустой конструктор:
## *public Class() {}*

- Integer etc - это объект (класс обёртка)
- int - это примитив
- **this** - это объект, который мы сейчас описываем
- Можно создавать несколько конструкторов в зависимости от ситации
- В Java значение null есть только у объектов; у примитивов - 0
- Геттеры позволяют получить значение праватных полей класса
- Сеттеры изменяют значение приватных полей класса
- Тип возвращаемого объекта у конструктора - это текущий класс
- Integer == Animal (class)
- *Конструктор - это такой метод, который не имеет названия, **только тип возвращаемого объекта***
## Ключевое слово *STATIC*
- Статические методы - это методы относящиеся к классу, т.е к **this**, а не статические к его **экземпляру**
### Пример про *static*:
- У любого квадрата есть диоганали. Так вот, метод getDiagonal() будет статичным, т.к диоганали есть в каждом квадрате. Но метод inscribedСircle() будет нестатичным, т.к не в каждом квадрате есть вписанная окружность. (Или про людей и головы)
- После запуска, java бегает по всей программе, ищет все static и выделяет под неё память.
#### Static нужно использовать аккуратно

### Фишка с двумя конструкторами:
- Если у нас есть два конструктора, один из которого описывает все поля класса, то второй конструктор можно создать ключевым словом this(), где в скобках нужно указать все желаемые поля, которые войдут в новые конструктор.

### Метод toString
- По умолчанию в java сделано так, что данный метод возвращает хеш нашего объекта. Хотим иначе - нужно переопределить поведение toString
- *return String.format("Animal: {name = %s, owner = %s}", name, owner);*

### Ключевое слово *SUPER*
- super означает: вызови мне, пожалуйста, конструктор родительского класса
- this - обращение к полям словего класса
- super - обращение к полям родительского класса
- поднимись выше и вызови какой-то метод там, наверху

### Иерархия на данном этапе:
# Object -> Animal -> OtherAnimal

### *Класс как тип объекта*
- Можно создать отдельный класс, в котором все поля будут иметь тип currentClass для создания экземпляров
- 
public class Owner {

    private String name;
    public Owner(String name) {
        this.name = name;
    }

- И в конструкторе указать тип new Owner(name)

## **ПОЛИМОРФИЗМ**
- Animal cat = new OtherAnimal();

где класс OtherAnimal наследует класс Animal.
Это и есть ничто иное как полиморфизм

*Когда мы можем подсунуть в главный класс одну из его реализаций*

#### Полиморфизм на уровне методов
1. Это перегрузка методов. Т.е когда есть несколько вариантов исполнения метода
2. Второй случай - это переопределение метода. Например, как toString()
3. 
    
    