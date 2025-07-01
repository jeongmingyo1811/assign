package ref.ex;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수 입력:");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i<orders.length;i++){
            System.out.println((i+1)+"번째 주문 정보 입력:");
            System.out.println("상품명: ");
            String productName = sc.nextLine();
            System.out.println("가격: ");
            int price = sc.nextInt();

            System.out.println("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
