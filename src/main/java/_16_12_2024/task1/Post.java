package _16_12_2024.task1;

public class Post {
    private int weight;
    private Adress adress;

    public Post(int weight, Adress adress) {
        this.weight = weight;
        this.adress = adress;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        String postCode = adress.getPostCode();
        if (postCode.charAt(0) == '1'){

        }
        this.adress = adress;
    }
    void  doSm(String... s){

    };
}

class Adress {
    private String street;
    private String postCode;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Adress(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}


