package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);

    abstract public String getName();

}

/**
 * В первой строчке объявляется абстрактный класс Actor, который реализует
 * интерфейс iActorBehavior. Абстрактные классы могут содержать абстрактные
 * методы и невиртуальные (статические) методы, но не могут быть напрямую
 * созданы.
 * 
 * Затем объявляются три приватных поля: имя, флаги для принятия и создания
 * заказов соответственно.
 * 
 * В следующей строчке представлен конструктор класса Actor, принимающий строку
 * name. Здесь же устанавливается значение имени для текущего объекта.
 * 
 * Следующие две строчки объявляют два абстрактных метода: setName() и
 * getName(). Абстрактные методы не содержат тела метода (т.е. отступов кода), и
 * их реализация должна быть предоставлена в классах-наследниках.
 * 
 * Важно отметить, что интерфейс iActorBehavior должен определять методы
 * setName() и getName(), иначе возникнет ошибка компиляции.
 */