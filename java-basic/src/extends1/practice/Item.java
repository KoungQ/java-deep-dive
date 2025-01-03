package extends1.practice;

/**
 *      price만을 final로 선언하지 않은 이유
 *          처음 설계할 땐 모든 인스턴스를 final로 설계하여 불변 객체의 이점을 챙기려고 했음
 *          하지만 요구사항을 좀 더 깊게 이해해봤을 때, 가격 변동은 생각보다 자주 일어날 수 있는 일이고,
 *          가격 변동이 있다고 해서 새로운 객체를 생성하여 관리하는 것보다 가격만을 바꿔 관리할 수 있도록 final을 해제하였음
 *          다른 인스턴스들은 일반적으로 수정될 일이 없기 때문에 final을 사용하는 게 옳다고 생각
 */

public class Item {

    private final String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }
}
