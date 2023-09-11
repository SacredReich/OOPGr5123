package Classes;

import Interfaces.iReturnOrder;

public class PromotionalClient extends Actor implements iReturnOrder {
    /** Поле, содержащее название акции */
    private String promName;
    /** Поле, содержащее id аукционера */
    private int idPRO;
    /** Статичное числовое поле, подсчитывающее количество аукционеров */
    public static int promClientCount;

    /**
     * Конструктор, создающий новый экземпляр аукционера с полями:
     * 
     * @param name        - имя аукционера (клиента)
     * @param auctionName - название акции
     * @param idPRO       - id аукционера
     */
    public PromotionalClient(String name, String promName, int id) {
        super(name);
        this.promName = promName;
        this.idPRO = id;
    }

    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public int getidPROD() {
        return idPRO;
    }

    public void setidPRO(int idPRO) {
        this.idPRO = idPRO;
    }

    public static int getpromClientCount() {
        return promClientCount;
    }

    public static void setpromClientCount(int promClientCount) {
        PromotionalClient.promClientCount = promClientCount;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;

    }

    @Override
    public void setTakeOrder(boolean take) {
        super.isTakeOrder = take;
    }

    @Override
    public void returnOrder() {
        if (isReturned() == true)
            System.out.println("Заказ возвращен!");
    }

    @Override
    public boolean isReturned() {
        return true;
    }

}