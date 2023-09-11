package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

}

/**
 * В первой строке объявляется класс Market, который реализует интерфейсы
 * iMarketBehavior и iQueueBehavior.
 * 
 * Во второй строке объявляется приватное поле queue, которое представляет собой
 * список объектов, реализующих интерфейс iActorBehavior.
 * 
 * Далее следует конструктор класса Market, который создает пустой список queue
 * с использованием ArrayList.
 * 
 * Следующими идут два переопределенных метода: acceptToMarket() и
 * takeInQueue(). Метод acceptToMarket() принимает объект actor и добавляет его
 * в список queue. Метод takeInQueue() добавляет переданный объект actor в конец
 * списка queue.
 * 
 * Метод releaseFromMarket() не был представлен в вопросе, поэтому я не могу
 * прокомментировать его.
 */