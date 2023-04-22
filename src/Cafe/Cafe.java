package Cafe;

public class Cafe {

    static class Coffee {

        String name;
        String size;
        String topping1;
        String topping2;
        String topping3;

        public Coffee(String name, String size) {
            this.name = name;
            this.size = size;
        }

        public Coffee(String name, String size, String topping1) {
            this.name = name;
            this.size = size;
            this.topping1 = topping1;
        }

        public Coffee(String name, String size, String topping1, String topping2) {
            this.name = name;
            this.size = size;
            this.topping1 = topping1;
            this.topping2 = topping2;
        }

        public Coffee(String name, String size, String topping1, String topping2, String topping3) {
            this.name = name;
            this.size = size;
            this.topping1 = topping1;
            this.topping2 = topping2;
            this.topping3 = topping3;
        }

        public int priceCoffee() {

            int price = 0;

            if (this.name == "arabic") {
                price += 5;
            } else if (this.name == "cappuccino") {
                price += 6;
            } else if (this.name == "espresso") {
                price += 8;
            } else {
                System.out.println("В нашем заведении подаются только такие виды кофе, как : arabic, cappuccino и espresso");
            }

            if (this.size == "small") {
                price += 3;
            } else if (this.size == "medium") {
                price += 5;
            } else if (this.size == "big") {
                price += 8;
            } else {
                System.out.println("в нашем заведении можно выбрать размер стаканчика с кофе только small, medium, или big");
            }

            if (this.topping1 == "milk" || this.topping2 == "milk" || this.topping3 == "milk") {
                price += 2;
            }
            if (this.topping1 == "syrup" || this.topping2 == "syrup" || this.topping3 == "syrup") {
                price += 3;
            }
            if (this.topping1 == "chocolade" || this.topping2 == "chocolade" || this.topping3 == "chocolade") {
                price += 4;
            }
            return price;
        }
    }

    class Sandwich {

        String typeBread;
        String filling1;
        String filling2;
        String filling3;
        String sause1;
        String sause2;
        String sause3;

        public Sandwich(String typeBread, String filling1) {
            this.typeBread = typeBread;
            this.filling1 = filling1;
        }

        public Sandwich(String typeBread, String filling1, String sause1) {
            this.typeBread = typeBread;
            this.filling1 = filling1;
            this.sause1 = sause1;
        }

        public Sandwich(String typeBread, String filling1, String sause1, String sause2) {
            this.typeBread = typeBread;
            this.filling1 = filling1;
            this.sause1 = sause1;
            this.sause2 = sause2;
        }

        public Sandwich(String typeBread, String filling1, String sause1, String sause2, String sause3) {
            this.typeBread = typeBread;
            this.filling1 = filling1;
            this.sause1 = sause1;
            this.sause2 = sause2;
            this.sause3 = sause3;
        }


        public int priceSandwich() {

            double price = 0;

            if (this.typeBread == "white") {
                price += 0.5;
            } else if (this.typeBread == "borodino") {
                price += 1;
            } else if (this.typeBread == "moscow") {
                price += 3;
            }

            if (this.filling1 == "sausage" || this.filling2 == "sausage" || this.filling3 == "sausage") {
                price += 3;
            }
            if (this.filling1 == "ham" || this.filling2 == "ham" || this.filling3 == "ham") {
                price += 6;
            }
            if (this.filling1 == "turkey" || this.filling2 == "turkey" || this.filling3 == "turkey") {
                price += 3;
            }
            if (this.filling1 == "chesee" || this.filling2 == "chesee" || this.filling3 == "chesee") {
                price += 3;
            }

            if (this.sause1 == "mayonnaise" || this.sause2 == "mayonnaise" || this.sause3 == "mayonnaise") {
                price += 0.5;
            }
            if (this.sause1 == "tobasco" || this.sause2 == "tobasco" || this.sause3 == "tobasco") {
                price += 0.5;
            }
            if (this.sause1 == "cheesy" || this.sause2 == "cheesy" || this.sause3 == "cheesy") {
                price += 1;
            }

            return (int) price;
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee("arabic", "small", "milk");
        System.out.println(coffee.priceCoffee());
    }
}
